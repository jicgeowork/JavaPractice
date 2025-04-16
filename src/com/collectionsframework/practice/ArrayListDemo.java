package com.collectionsframework.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		//Adding elements into the arrayList
		al.add(4);
		al.add(1);
		al.add(5);
		al.add(6);
		al.add(100);
		System.out.println(al);
		//get the element from arrayList at a specific index
		
		System.out.println(al.get(3));
		
		//add an element in between 
		
		al.add(3, 66);
		System.out.println(al);
		
		//Set an element at a given index
		
		al.set(4, 67);
		System.out.println(al);
		
		//delete an element from a given index
		al.remove(4);
		System.out.println(al);
		
		//find the size of list
		System.out.println(al.size());
		
		//iterate through the list
		for(int i: al) {
			System.out.print(i +  " ");
			
		}
		
		System.out.println();
		//sort the elements in the arrayList
		Collections.sort(al); //sorts in ascending order
		System.out.println(al);
		

	}

}
