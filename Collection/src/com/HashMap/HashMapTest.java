package com.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> cours = new HashMap<Integer, String>();
		cours.put(0, "Java");
		cours.put(1, "C#");
		cours.put(2, "php");
		cours.put(3, "Js");
		//System.out.println(cours.get(0));
		//Entry Set
		System.out.println(" HashMap with Entry Set ");
		Iterator<Entry<Integer, String>> iterator =cours.entrySet().iterator();
		while(iterator.hasNext())
		{
			Entry<Integer, String> cour = iterator.next();
			//System.out.println(cour);
			System.out.println("Key : " + cour.getKey() +" => Value : " + cour.getValue());

		}
		
		//KeySet 
		System.out.println(" HashMap with Key Set ");
		Iterator<Integer> iterat = cours.keySet().iterator();
		while(iterat.hasNext())
		{
			Integer key = iterat.next();
			System.out.println(key);
			System.out.println(cours.get(key));
		}
		
		//For each loop
		System.out.println("For each avec hashMap");
		for(Map.Entry<Integer, String> cour:cours.entrySet())
		{
			System.out.println(cour.getKey());
			System.out.println(cour.getValue());
		}
		
		//foreach
		System.out.println("foreach Java 8");
		cours.forEach((key,value) ->{
			System.out.println(key);
			System.out.println(value);
		});
		
		//boucle with stream Api
		cours.entrySet().stream().forEach((cour) -> {
			System.out.println(cour.getKey());
			System.out.println(cour.getValue());
		});
		for(int i=0;i<cours.size();i++)
		{
			System.out.println(cours.get(i));
		}
		
		
		

	}

}
