package com.cg.lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int n=sc.nextInt();
		System.out.println("Enter the value:");
		char arr[]=sc.next().toCharArray();
		System.out.print("Value entered is:");
		for(int i=0;i<n;i++) {	
			System.out.print(arr[i]+" ");
		}
		Map<Character, Integer> m=countChars(arr);
		System.out.println("\nCharacters with their occurences are:"+m);
	}
	private static Map<Character,Integer> countChars(char arr[])
	{
		Map<Character,Integer> map=new HashMap<>();
		//Arrays.sort(arr);
		//System.out.println("Sorted array:"+Arrays.toString(arr));
		//for(Character c:arr)
		for(int i=0;i<arr.length;i++)
		{
			char c=arr[i];
			if(map.containsKey(c))
			{
				int count=map.get(c);
				count++;
				map.put(c,count);
			}
			else
			{
				map.put(c,1);
			}
		}
		return map;
	}
}

