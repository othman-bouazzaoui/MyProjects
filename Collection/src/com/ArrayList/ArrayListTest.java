package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		//Create Array list Object
		ArrayList<String> langs = new ArrayList<>();
		langs.add("Fr");
		langs.add("Ar");
		langs.add("En");
		if(!langs.isEmpty()) {
		//Afficher tous le contenu
		System.out.println(langs +" son Size => " + langs.size());
		
		//afficher le premier element avec get(index)
		System.out.println("Le premier element => " + langs.get(1));
		
		//la modification d'un element avec set(le dernier dans ce cas)
		langs.set(langs.size()-1, "De");
		
		//après la modification 
		System.out.println("après la modifications  => "+ langs);
		
		//Suppression d'un element
		langs.remove(0);//index ou la valeur exact
		System.out.println("après la suppression d'un element => "+ langs);
		
		//Suppression de tous les elements ou plusieur
		langs.removeAll(langs); //prends une collection
		langs.clear();//Clear une liste
		System.out.println("après la suppression de tous les emelements => "+ langs);
		
		//Rempli la liste de a 0
		langs.add("Fr");langs.add("Ar");langs.add("En");
		
		
		System.out.println("Les Boucles avec ArrayList");
		//boucle for loop sur une ArrayList
		for(int i=0; i<langs.size();i++) 
			{
				System.out.println(langs.get(i));
			}
		
		//boucle for each sur une ArrayList
		for(String lang:langs) 
			{
				System.out.println(lang);
			}
		
		//basic boucle iterator
		System.out.println("Iterator Avec ArrayList");
		for(Iterator iterator = langs.iterator();iterator.hasNext();)
			{
				String lang = (String) iterator.next();
				System.out.println(lang);
			}
		
		//boucle iterator
		Iterator iter = langs.iterator();
		while(iter.hasNext())
			{
				String lang = (String) iter.next();
				System.out.println(lang);
			}
		
		//Java 8 + lambda
		langs.stream().forEach(lang -> {
			System.out.println(lang);
		});
		//Java Foreach
		langs.forEach(lang -> {
			System.out.println(lang);
		});
		
		}else {
			System.out.println("No language !");
		}
		

	}

}
