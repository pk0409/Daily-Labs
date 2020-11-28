package com.cg.lab6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Excercise6 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id number:");
		int idno=sc.nextInt();
		System.out.println("Enter your date of birth(in dd-MM-yyyy format)");
		String dob=sc.next();
		DateTimeFormatter sdf= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate birthDate=LocalDate.parse(dob,sdf);
		LocalDate currentDate=LocalDate.now();
		int age= Period.between(birthDate, currentDate).getYears();
		String s=String.valueOf(age);
		HashMap <Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(idno,s);
		@SuppressWarnings("rawtypes")
		List res=votersList(hmap);
		System.out.println("Details:"+res);
	}
	@SuppressWarnings("rawtypes")
	private static List votersList(HashMap<Integer,String> hmap)
	{
		@SuppressWarnings("unchecked")
		List<Integer> list=new ArrayList(hmap.entrySet());
		for(Entry<Integer,String> m:hmap.entrySet())
		{
			if(Integer.parseInt(m.getValue())>=18)
			{
				list.add(m.getKey());
				System.out.println("You are eligible to vote");
			}
			else
			{
				System.out.println("You are not eligible to vote");
			}}
		return list;
	}
}
