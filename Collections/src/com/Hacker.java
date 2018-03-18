package com;

import java.util.*;
import java.util.stream.Stream;

public class Hacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,3,5,7,2,10};
		Integer range1[] = {1,2,3,4};
		Integer range2[] = {2,4,6,8};
		List<Integer> list = Arrays.asList(arr);
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		
		Stream<Integer> list4 = list.stream().
		filter(elem1 -> 
		{ 
			if(elem1 %2 == 0)
			{
				System.out.println(elem1);
				list1.add(elem1);
			}
			if(elem1 %3 == 0)
			{
				list2.add(elem1);
			}
			if(elem1 %4 == 0)
			{
				list3.add(elem1);
			}
				return true;
		});
		System.out.println(list1.size());
		list1.forEach(System.out::println);
		System.out.println("list2");
		list2.forEach(System.out::println);
		System.out.println("list3");
		list3.forEach(System.out::println);
		list4.forEach(System.out::println);
		
/*		list1.stream()
		 .filter(elem1 -> 
		 { 
			list2.stream().
			filter(elem2 -> {
					list.stream().filter(element -> 
					{
					if(element >=elem1 && element <= elem2)
						return true;
					else
						return false;
					})
				
			})
		 } )
		
	};*/

}
}