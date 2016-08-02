package com.esentri.salesforcedemo.fuse.salesforcedemo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

public class AccountBean {

	//Initialize Salesforce and Oracle List object
    private static List<HashMap<Object, Object>> arrayList_salesforce = new ArrayList<>();
    private static List<HashMap<Object, Object>> arrayList_oracle = new ArrayList<>();
    
	//Initialize Oracle List object
    private static int accountids;
    
	//Initialize Insert and Update Data List object
    private List<HashMap<Object, Object>> arrayList_insert = new ArrayList<>(arrayList_salesforce);
    private List<HashMap<Object, Object>> arrayList_update = new ArrayList<>();
	
    //Convert Salesforce timestamp to date
    public void datetransformation_salesforce() {
    	for (Iterator<HashMap<Object, Object>> iterator1 = arrayList_insert.iterator(); iterator1.hasNext();) {
		    //Initializing salesforce data iterator
			HashMap<Object, Object> sf = iterator1.next();
			
			long val = Long.parseLong(sf.get("LastModifiedDate").toString());
			Date date=new Date(val);
	        SimpleDateFormat df2 = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
	        String dateText = df2.format(date);
	        
	        sf.replace("LastModifiedDate", dateText);
		}
    }
    
    public void datetransformation_oracle() {
    	for (Iterator<HashMap<Object, Object>> iterator1 = arrayList_oracle.iterator(); iterator1.hasNext();) {
			HashMap<Object, Object> or = iterator1.next();
			
			if(or.get("UPDATED_ON") != null){
				String temp = or.get("UPDATED_ON").toString();
		        or.replace("UPDATED_ON", temp.substring(0, temp.length()-2));
			}
    	}
    }
    
    //INSERT INTO and UPDATE Salesforce data separation method
	public void dataSplit(){
		//Initialize Insert Data List object with full Salesforce data set
		arrayList_insert = new ArrayList<>(arrayList_salesforce);
		
		//Integer variable to track iterator index
	    int i1 = 0;
	    //Integer variable to track arrayList_insert index 
	    int i2 = 0;
	    
	    datetransformation_salesforce();
	    datetransformation_oracle();
	    
	    //Iteration loop to spereate the saelsfroce data
		for (Iterator<HashMap<Object, Object>> iterator1 = arrayList_insert.iterator(); iterator1.hasNext();) {
		    //Initializing salesforce data iterator
			HashMap<Object, Object> sf = iterator1.next();
		    
			//Iteration loop to compare the saelsforce data with the oracle data
			for (Iterator<HashMap<Object, Object>> iterator2 = arrayList_oracle.iterator(); iterator2.hasNext();) {
				//Initializing oracle data iterator
				HashMap<Object, Object> or = iterator2.next();
				//IF statement to find matching records
			    if(sf.get("Name").equals(or.get("NAME"))) {
		    		//Remove record from HashMap
			    	iterator1.remove();
			    	//Add record to update list
			    	if(!sf.get("LastModifiedDate").equals(or.get("UPDATED_ON"))){
			    		arrayList_update.add(arrayList_salesforce.get(i1));
			    		//Get ID attribute from Oracle HashMap and add it to the matching Salesforce record
			    		arrayList_update.get(i2).put("Oracle_Id", or.get("ID"));
			    		//Transform Salesforce Type attribute to all upper case (necessary for oracle constraints)
			    		arrayList_update.get(i2).replace("Type", arrayList_update.get(i2).get("Type").toString().toUpperCase());
			    		//Increase Integer variable by 1
			    		i2 += 1;
			    	}
		    	}
			}
    		//Increase Integer variable by 1
			i1 += 1;
		}
		//Mark for delete
		System.out.println(arrayList_insert);
		System.out.println(arrayList_update);
	}
	
	//INSERT INTO String method
	public String insertDatabase(){
		//Initializing INSERT INTO string variable
		String insertString = "INSERT ALL";		

		//Loop to create INTO...VALUES statements
		for(int i=0; i < arrayList_insert.size(); i++){
			//Increasing the ID value by 1
			accountids += 1;
			//Adding the INTO...VALUES statement to the INSERT String
			insertString += " INTO ORGANISATION(ID, ORGANISATION_TYP_CODE, NAME) VALUES("
			+ accountids + ", '" 
			+ arrayList_insert.get(i).get("Type").toString().toUpperCase() 
			+ "', '" + arrayList_insert.get(i).get("Name")
			+"')";
		}
		
		//Adding additional statement specifically for INSERT INTO ALL statements 
		insertString += " SELECT * FROM dual";
		//Mark for delete
		System.out.println(insertString);
		
		//Return the INSERT String
		return insertString;
	}
	
	//--Getter--
	public List<HashMap<Object, Object>> getArrayList_salesforce() {
		return arrayList_salesforce;
	}

	public List<HashMap<Object, Object>> getArrayList_oracle() {
		return arrayList_oracle;
	}

	public List<HashMap<Object, Object>> getArrayList_insert() {
		return arrayList_insert;
	}

	public List<HashMap<Object, Object>> getArrayList_update() {
		return arrayList_update;
	}
	
	//--Setter--
    //Custom set method to create a List of HashMaps using the Salesforce data
	public void setArrayList_salesforce(String t) throws JSONException {
		
		//Convert input body to JSON Object
        JSONObject jObject = new JSONObject(t);
        //Initialize HashMap
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        
        //Loop to add HashMaps to the List
        for (int i = 0; i < jObject.getJSONArray("records").length(); i++) {
             JSONObject object = jObject.getJSONArray("records").getJSONObject(i);
             Iterator<String> iteratorkeys = object.keys();

             while(iteratorkeys.hasNext()) {
               String currentKey = iteratorkeys.next();
               hashMap.put(currentKey.toString(), object.get(currentKey).toString());
             }
             
             //Initialize temporary HashMap to fill List object
             HashMap<Object, Object> temp = new HashMap<Object, Object>(hashMap);
             arrayList_salesforce.add(temp);
        }
           
        //Clear temporary HashMap
        hashMap.clear();
    }

	public static void setArrayList_oracle(
			List<HashMap<Object, Object>> arrayList_oracle) {
		AccountBean.arrayList_oracle = arrayList_oracle;
	}
	
	public static void setAccountids(
			List<HashMap<Object, Object>> temp_oracle) {
		AccountBean.accountids = (int) ((BigDecimal) temp_oracle.get(0).get("MAX(ID)")).intValue();
	}
}