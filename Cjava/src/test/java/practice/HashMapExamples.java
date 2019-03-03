package practice;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExamples {

	static HashMap<String, Integer > hm = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		hm.put("Sarath", 33);
		hm.put("Sandhya",28);
		hm.put("Manaswi", 1);
		hm.put("Satyanarayana",54);
		hm.put("Padmavathi", 49);
		System.out.println(hm);
		
		if(hm.containsKey("Sarath"))
		{
			Integer a= hm.get("Sarath");
			System.out.println("Sarath age is:" + a );
		}
		//hm.clear();
		if(hm.isEmpty())
		{
			System.out.println("map is empty");
		}else
			System.out.println("map has some data" + hm);
		
		hm.remove("Sarath");
		System.out.println(hm);
		sortbykey();
	}
	
	
	public static void sortbykey() 
    { 
        // TreeMap to store values of HashMap 
        TreeMap<String, Integer> sorted = new TreeMap<>(); 
  
        // Copy all data from hashMap into TreeMap 
        sorted.putAll(hm); 
  
        // Display the TreeMap which is naturally sorted 
        for (HashMap.Entry<String, Integer> entry : sorted.entrySet())  
            System.out.println("Key = " + entry.getKey() +  
                         ", Value = " + entry.getValue()+
                         ", Hascode=" +entry.hashCode());         
    } 

}
