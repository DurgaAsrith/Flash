package com;

import java.util.*;

public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str1 = "rail safetyss";
		String str2 = "fairy talessx";
		boolean bool = anagram(str1,str2);
		System.out.println("Anagram :" +bool);
		}
		public static boolean anagram(String str1,String str2 )
		{
			
			char ch1,ch2;
			char strArr1[] = str1.toCharArray();
			char strArr2[] = str2.toCharArray();
			HashMap<Character,Integer> hmap1 = new HashMap<Character,Integer>();
			HashMap<Character,Integer> hmap2 = new HashMap<Character,Integer>();
			boolean bool = true;
			if(strArr1.length == strArr2.length)
			{
				System.out.println("Equals");
			for( int i=0;i<strArr1.length;i++)
			{
				ch1 = strArr1[i];
				ch2 = strArr2[i];
				if(ch1 != ' ')
				{
				if(hmap1.containsKey(ch1))
				{
					
					hmap1.put(ch1, hmap1.get(ch1) + 1);
				}
				else
				{
					hmap1.put(ch1, 1);	
				}
				}
				//2nd map
				if(ch2 != ' ')
				{
				if(hmap2.containsKey(ch2))
				{
					hmap2.put(ch2, hmap2.get(ch2) + 1);
				}
				else
				{
					hmap2.put(ch2, 1);	
				}
				}		
			}//end of for loop
			Set<Character> set = hmap1.keySet();
			set.forEach(x -> System.out.println("map1 key is:"+x+"vakue is "+hmap1.get(x)));

			Set<Character> set1 = hmap2.keySet();
			set.forEach(x -> System.out.println("map2 key is:"+x+"vakue is "+hmap2.get(x)));
			
			for( char ch : set)
			{
				System.out.println(ch);
				if(hmap1.get(ch) != hmap2.get(ch) ) 
				{
					System.out.println("1"+ hmap1.get(ch)+" "+hmap2.get(ch));
				return false;	
				}
			 }
			}
			else
			{
				System.out.println("else");
				return false;
			}
			System.out.println("2");
			return bool ;
		}
	}

