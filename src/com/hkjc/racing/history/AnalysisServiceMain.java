package com.hkjc.racing.history;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.hkjc.racingtouch.manager.AnalysisManager;
import com.hkjc.racingtouch.manager.Combinations;

public class AnalysisServiceMain {

	public static void main(String[] args) {
		List<List<String>> combinations = new Combinations().getCombinations();
		AnalysisManager analysisManager = new AnalysisManager();
		
		List<Map<String, Object>> resultRecords = analysisManager.getResultRecords();
		System.out.println("size:" + resultRecords.size());
		serializeData(resultRecords);
		deserializeData();
		
		/*for (Iterator<List<String>> iterator = combinations.iterator(); iterator.hasNext();) {
			List<String> columns = (List<String>) iterator.next();
			
			if(columns != null && columns.size() > 0){
				String columnsStr = columns.toString().substring(1,columns.toString().length()-1);
				
				//List<Map<String, Object>> recordsByGroup = analysisManager.getRecordsByGroup(columnsStr);
				//System.out.println(recordsByGroup);
				
				
				List<Map<String, Object>> resultRecordsByGroup = analysisManager.getResultRecordsByGroup(columnsStr);
				//System.out.println(resultRecordsByGroup);
				
				//Collections.sort
			}
		}*/
	}
	
	private static void serializeData(List<Map<String, Object>> resultRecords){
		// Serialization 
        try
        {   
        	String filename = "hrd.ser";
            
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
             
            // Method for serialization of object
            out.writeObject(resultRecords);
             
            out.close();
            file.close();
             
            System.out.println("Object has been serialized");
 
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
	}

	private static void deserializeData(){
		// Deserialization
	    try
	    {   
	    	String filename = "hrd.ser";
	    	// Reading the object from a file
	        FileInputStream file = new FileInputStream(filename);
	        ObjectInputStream in = new ObjectInputStream(file);
	         
	        // Method for deserialization of object
	        List<Map<String, Object>> object1 = (List<Map<String, Object>>)in.readObject();
	         
	        in.close();
	        file.close();
	         
	        System.out.println("Object has been deserialized " + object1);
	    }
     
	    catch(IOException ex)
	    {
	        System.out.println("IOException is caught");
	    }
	     
	    catch(ClassNotFoundException ex)
	    {
	        System.out.println("ClassNotFoundException is caught");
	    }
	}
}