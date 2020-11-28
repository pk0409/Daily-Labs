package com.cg.lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
public class Excercise1 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		System.out.println("Number of entries:");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the Id no.:");
			int idno=sc.nextInt();
			System.out.println("Enter the name:");
			String name=sc.next();
			hmap.put(idno, name);
		}
		for(Entry<Integer, String> m:hmap.entrySet())
		{
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		@SuppressWarnings("rawtypes")
		List l=getValues(hmap);
		System.out.println("Sorted values in list form are:"+l);
	}
	@SuppressWarnings("rawtypes")
	private static List getValues(HashMap<Integer,String> hmap)
	{
		List<Entry<Integer,String>> list=new ArrayList<Entry<Integer,String>>(hmap.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer,String> >() { 
			public int compare(Entry<Integer,String> o1,  
					Entry<Integer,String> o2) 
			{ 
				return (o1.getValue()).compareTo(o2.getValue()); 
			}
		});
		return list;
	}}
