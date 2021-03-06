package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add(0,"Annanas");
		fruits.addFirst("FirstFruit");
		fruits.addLast("LastFruit");
		
		if(!fruits.isEmpty()) {
			//All elements
			System.out.println(fruits +" # Size => " +fruits.size());
			
			//Get first element
			System.out.println("1 er element de la liste => " + fruits.getFirst());
			
			//get Last element
			System.out.println("le dernier element => " + fruits.getLast());
			
			//Get element par son Index avec get
			System.out.println("Recuperer un element depuis la liste => " + fruits.get(2));
			
			//La suppression  d'un element
			fruits.remove(0);
			fruits.removeFirst(); //first ele
			fruits.removeLast(); //last ele
			
			System.out.println("Après la suppression => " + fruits);
			
			//Supprimer tous les elements
			//fruits.clear();

			
			//recherche 
			System.out.println(fruits.contains("Banana"));
			
			System.out.println(fruits.indexOf("Banana"));
			
			
			//boucle 
			System.out.println("boucle linked Liste");
			for(String fruit:fruits)
			{
				System.out.println(fruit);
			}
			
			//iterator
			Iterator<String> iterator = fruits.iterator();
			while(iterator.hasNext())
			{
				String fruit = iterator.next();
				System.out.println(fruit);
			}
			
			//foreach
			fruits.forEach(fruit -> {
				System.out.println(fruit);
			});
			
		}else {
			System.out.println("La liste est vide");
		}

	}

}
