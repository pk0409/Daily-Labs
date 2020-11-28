package com.cg.lab6;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
public class Excercise4 {
	public static void main(String args[])
	{
		HashMap<String,Integer>hmap=new HashMap<String,Integer>();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the student registration number:");	
			String sno=sc.next();
			System.out.println("Enter the marks:");
			int marks=sc.nextInt();
			hmap.put(sno, marks);}
		System.out.println(hmap);
		HashMap<String,String> scholarship=getStudents(hmap);
		for(Entry<String, String> m:scholarship.entrySet()) {
			System.out.println("Student Registration no.:"+m.getKey()+","+" "+m.getValue());
		}}

	private static HashMap<String,String> getStudents(HashMap<String,Integer>hmap)
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		for(Entry<String, Integer> m:hmap.entrySet())
		{
			//System.out.println(m.getKey() + " : " + m.getValue());
			if (m.getValue()>=(90))	
			{
				hm.put(m.getKey(),"Congratulations!!You have earned Gold medal");
			}
			else if(m.getValue()>=80 && m.getValue()<90)
			{
				hm.put(m.getKey(), "Congratulations!!You have earned Silver medal");
			}
			else if(m.getValue()>=70 && m.getValue()<80)
			{
				hm.put(m.getKey(), "Congratulations!!You have earned Bronze medal");
			}
			else
			{
				hm.put(m.getKey(), "Sorry!!You are not eligible for scholarship");
			}
		}
		return hm;
	}
}