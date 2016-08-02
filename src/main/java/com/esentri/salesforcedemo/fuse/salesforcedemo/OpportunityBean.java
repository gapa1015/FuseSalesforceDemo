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

public class OpportunityBean {
	
	//Initialize Salesforce and Oracle List object
    private static List<HashMap<Object, Object>> arrayList_salesforce = new ArrayList<>();
    private static List<HashMap<Object, Object>> arrayList_salesforce_accounts = new ArrayList<>();
    private static List<HashMap<Object, Object>> arrayList_salesforce_contacts = new ArrayList<>();
    private static List<HashMap<Object, Object>> arrayList_oracle = new ArrayList<>();
    private static List<HashMap<Object, Object>> arrayList_oracle_accounts = new ArrayList<>();
    private static List<HashMap<Object, Object>> arrayList_oracle_contacts = new ArrayList<>();
    
	//Initialize Oracle Ids
    private static int opportunityids;
    
	//Initialize Insert and Update Data List object
    private List<HashMap<Object, Object>> arrayList_insert = new ArrayList<>(arrayList_salesforce);
    private List<HashMap<Object, Object>> arrayList_update = new ArrayList<>();
        
    //Convert Salesforce timestamp to date
    public void datetransformation_salesforce() {
    	for (Iterator<HashMap<Object, Object>> iterator1 = arrayList_insert.iterator(); iterator1.hasNext();) {
		    //Initializing salesforce data iterator
			HashMap<Object, Object> sf = iterator1.next();
			
			long val1 = Long.parseLong(sf.get("CreatedDate").toString());
			Date date1=new Date(val1);
	        SimpleDateFormat df1 = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
	        String dateText1 = df1.format(date1);
	        
			long val2 = Long.parseLong(sf.get("LastModifiedDate").toString());
			Date date2=new Date(val2);
	        SimpleDateFormat df2 = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
	        String dateText2 = df2.format(date2);
	        
	        sf.replace("CreatedDate", dateText1);
	        sf.replace("LastModifiedDate", dateText2);
		}
    }
    
    public void datetransformation_oracle() {
    	for (Iterator<HashMap<Object, Object>> iterator1 = arrayList_oracle.iterator(); iterator1.hasNext();) {
			HashMap<Object, Object> or = iterator1.next();
			
			if(or.get("SF_AKTUALISIERT_AM") != null){
				String temp = or.get("SF_AKTUALISIERT_AM").toString();
		        or.replace("SF_AKTUALISIERT_AM", temp.substring(0, temp.length()-2));
			}
    	}
    }
    
    public void transformOpportunityData() {
    	for(int i=0; arrayList_insert.size() > i; i++){
    		String temp = arrayList_insert.get(i).get("Name").toString().toUpperCase();
    		arrayList_insert.get(i).replace("Beauftragungsart__c", arrayList_insert.get(i).get("Beauftragungsart__c").toString().toUpperCase());
    		arrayList_insert.get(i).replace("Branche__c", arrayList_insert.get(i).get("Branche__c").toString().toUpperCase());
    		arrayList_insert.get(i).put("Projektkuerzel", temp.substring(0, Math.min(temp.length(), 3)));
	    	if(arrayList_insert.get(i).get("Abrechnungsart__c").equals("Time & Material")){
	    		arrayList_insert.get(i).replace("Abrechnungsart__c", "TAM");
	    	} else {
	    		arrayList_insert.get(i).replace("Abrechnungsart__c", "FESTPREIS");
	    	}
	    	
	    	if(arrayList_insert.get(i).get("Land__c").equals("esentri DE")){
	    		arrayList_insert.get(i).put("Auftragnehmer_Id", 1);
	    	} else {
	    		arrayList_insert.get(i).put("Auftragnehmer_Id", 2);
	    	}
	    }
    }
    
	//Adding the Oracle Account Ids
	private void addOracleId(){
		for(int i1=0; arrayList_insert.size() > i1; i1++){
			for(int i2=0; arrayList_salesforce_accounts.size() > i2; i2++){
				if(arrayList_insert.get(i1).get("AccountId").equals(arrayList_salesforce_accounts.get(i2).get("Id"))){
					arrayList_insert.get(i1).put("Oracle_Account_Name", arrayList_salesforce_accounts.get(i2).get("Name"));
					break;
				}
			}
		}
		
		for(int i1=0; arrayList_insert.size() > i1; i1++){
			for(int i2=0; arrayList_oracle_accounts.size() > i2; i2++){
				if(arrayList_insert.get(i1).get("Oracle_Account_Name").equals(arrayList_oracle_accounts.get(i2).get("NAME"))){
					arrayList_insert.get(i1).put("Oracle_Account_Id", arrayList_oracle_accounts.get(i2).get("ID"));
					break;
				}
			}
		}
		
		for(int i1=0; arrayList_insert.size() > i1; i1++){
			for(int i2=0; arrayList_salesforce_contacts.size() > i2; i2++){
				if(arrayList_insert.get(i1).get("Ansprechpartner_Kunde__c").equals(arrayList_salesforce_contacts.get(i2).get("Id"))){
					arrayList_insert.get(i1).put("Oracle_Contact_Vorname", arrayList_salesforce_contacts.get(i2).get("FirstName"));
					arrayList_insert.get(i1).put("Oracle_Contact_Nachname", arrayList_salesforce_contacts.get(i2).get("LastName"));
					break;
				}
			}
		}
		
		for(int i1=0; arrayList_insert.size() > i1; i1++){
			for(int i2=0; arrayList_oracle_contacts.size() > i2; i2++){
				if(arrayList_insert.get(i1).get("Oracle_Contact_Vorname").equals(arrayList_oracle_contacts.get(i2).get("VORNAME")) && arrayList_insert.get(i1).get("Oracle_Contact_Nachname").equals(arrayList_oracle_contacts.get(i2).get("NACHNAME"))){
					arrayList_insert.get(i1).put("Oracle_Contact_Id", arrayList_oracle_contacts.get(i2).get("ID"));
					break;
				}
			}
		}
	}
    
    //INSERT INTO and UPDATE Salesforce data separation method
	public void dataSplit(){
		//Initialize Insert Data List object with full Salesforce data set
		arrayList_insert = new ArrayList<>(arrayList_salesforce);
		
		//Integer variable to track iterators
	    int i1 = 0;
	    int i2 = 0;
	    
	    //Method to add Oracle IDs to Salesforce Opportunity data
	    addOracleId();
	    //Methode to transform long value to Date 
	    datetransformation_salesforce();
	    //Method to transform Oracle date format to equal the salesforce date format
	    datetransformation_oracle();
	    //Method to transform certain  Salesforce data into the expected Oracle format
	    transformOpportunityData();
	    
	    //Iteration loop to spereate the saelsfroce data
		for (Iterator<HashMap<Object, Object>> iterator1 = arrayList_insert.iterator(); 
				iterator1.hasNext();) {
		    //Initializing salesforce data iterator
			HashMap<Object, Object> sf = iterator1.next();		  
			
			//Iteration loop to compare the Salesforce data with the Oracle data
			for (Iterator<HashMap<Object, Object>> iterator2 = arrayList_oracle.iterator(); 
					iterator2.hasNext();) {
				//Initializing oracle data iterator
				HashMap<Object, Object> or = iterator2.next();
				//If statement to find matching records
			    if(sf.get("Name").equals(or.get("NAME"))) {
		    		//Remove record from HashMap
			    	iterator1.remove();
			    	//Add record to update list
			    	if(!sf.get("LastModifiedDate").equals(or.get("SF_AKTUALISIERT_AM"))){
			    		arrayList_update.add(arrayList_salesforce.get(i1));
			    		//Get ID attribute from Oracle HashMap and add to Salesforce record
			    		arrayList_update.get(i2).put("Oracle_Id", or.get("ID"));
			    		//Increase Integer variable by 1
				    	i2 += 1;
			    	}
		    	}
			}
    		//Increase Integer variable by 1
			i1 += 1;
		}
	}
	
	//INSERT INTO String method
	public String insertDatabase(){
		//Initializing INSERT INTO string variable
		String insertString = "INSERT ALL";		

		//Loop to create INTO...VALUES statements
		for(int i=0; i < arrayList_insert.size(); i++){
			//Increasing the ID value by 1
			opportunityids += 1;
			//Adding the INTO...VALUES statement to the INSERT String
			insertString += " INTO PROJEKT("
					+ "ID, "
					+ "PROJEKT_ART_CODE, "
					+ "PROJEKT_TYP_CODE, "
					+ "ENDKUNDE_ID, "
					+ "AUFTRAGGEBER_ID, "
					+ "AUFTRAGNEHMER_ID, "
					+ "VERTRIEBS_TYP_CODE, "
					+ "BRANCHE_TYP_CODE, "
					+ "TECHSTACK_TYP_CODE, "
					+ "NAME, "
					+ "PROJEKTKUERZEL, "
					+ "IST_AKTIV, "
					+ "AUFTRAGSWERT, "
					+ "KUNDENANSPRECHPERSON_ID, "
					+ "ANGEBOTSNUMMER, "
					+ "SF_AKTUALISIERT_AM, "
					+ "SF_AKTUALISIERT_VON, "
					+ "SF_ERSTELLT_AM, "
					+ "SF_ERSTELLT_VON) "
					+ "VALUES(" 
					+ opportunityids + ", '"
					+ arrayList_insert.get(i).get("Abrechnungsart__c") + "', '"
					+ "EXTERN', "
					+ arrayList_insert.get(i).get("Oracle_Account_Id") + ", "
					+ arrayList_insert.get(i).get("Oracle_Account_Id") + ", "
					+ arrayList_insert.get(i).get("Auftragnehmer_Id") + ", '"
					+ arrayList_insert.get(i).get("Beauftragungsart__c") + "', '"
					+ arrayList_insert.get(i).get("Branche__c") + "', '"
					+ arrayList_insert.get(i).get("Technologie__c") + "', '"
					+ arrayList_insert.get(i).get("Name") + "', '"
					+ arrayList_insert.get(i).get("Projektkuerzel") + "', '"
					+ "T', "
					+ arrayList_insert.get(i).get("Amount") + ", "
					+ arrayList_insert.get(i).get("Oracle_Contact_Id") + ", '"
					+ arrayList_insert.get(i).get("Angebotsnummer__c") + "', "
					+ "TO_DATE('" + arrayList_insert.get(i).get("LastModifiedDate") + "', 'YYYY-MM-dd hh:mi:ss'), '"
					+ arrayList_insert.get(i).get("LastModifiedById") + "', "
					+ "TO_DATE('" + arrayList_insert.get(i).get("CreatedDate") + "', 'YYYY-MM-dd hh:mi:ss'), '"
					+ arrayList_insert.get(i).get("CreatedById") + "'"
					+ ")";
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

	public static List<HashMap<Object, Object>> getArrayList_salesforce_accounts() {
		return arrayList_salesforce_accounts;
	}
	
	public static List<HashMap<Object, Object>> getArrayList_salesforce_contacts() {
		return arrayList_salesforce_contacts;
	}
	
	public List<HashMap<Object, Object>> getArrayList_oracle() {
		return arrayList_oracle;
	}

	public static List<HashMap<Object, Object>> getArrayList_oracle_accounts() {
		return arrayList_oracle_accounts;
	}
	
	public static List<HashMap<Object, Object>> getArrayList_oracle_contacts() {
		return arrayList_oracle_contacts;
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

	public static void setArrayList_salesforce_accounts(String t) throws JSONException {
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
             arrayList_salesforce_accounts.add(temp);
        } 
        //Clear temporary HashMap
        hashMap.clear();
	}

	public static void setArrayList_salesforce_contacts(String t) throws JSONException {
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
             arrayList_salesforce_contacts.add(temp);
        } 
        //Clear temporary HashMap
        hashMap.clear();
	}
	
	public static void setArrayList_oracle(
			List<HashMap<Object, Object>> arrayList_oracle) {
		OpportunityBean.arrayList_oracle = arrayList_oracle;
	}
	
	public static void setArrayList_oracle_accounts(
			List<HashMap<Object, Object>> arrayList_oracle_accounts) {
		OpportunityBean.arrayList_oracle_accounts = arrayList_oracle_accounts;
	}

	public static void setArrayList_oracle_contacts(
			List<HashMap<Object, Object>> arrayList_oracle_contacts) {
		OpportunityBean.arrayList_oracle_contacts = arrayList_oracle_contacts;
	}
	
	public static void setContactids(
			List<HashMap<Object, Object>> temp_oracle) {
		OpportunityBean.opportunityids = (int) ((BigDecimal) temp_oracle.get(0).get("MAX(ID)")).intValue();
	}
}