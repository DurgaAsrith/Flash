package com;

import java.util.*;
import java.util.stream.Collectors;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=1;i<=5;i++)
		{
			list.add(i);
		}
		for(int i=1;i<=20;i++)
		{
			list1.add(i);
		}
		
/*		list.
			stream().
			filter( elem1 -> list1.contains(elem1)).
			forEach(System.out::print);*/
		
		list.stream()
		.filter(elem -> elem%3 == 0).filter(elem -> elem%5 == 0).forEach(System.out::println);
		/*list.stream().filter(elem -> elem%5 == 0).forEach(System.out::println);
		int count = list.stream().filter(elem -> elem%5 == 0).reduce(0 , (x,y) -> x+y);
		list.stream().filter(elem -> elem %3 == 0).forEach(System.out::println);
		int count1 = list.stream().filter(elem -> elem%3 == 0).reduce(0 , (x,y) -> x+y);
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count + count1);*/
		//list.stream().filter(elem -> elem %3 == 0).forEach(System.out::println);
		
/*		ArrayList arrlist = list.stream().filter(elem -> elem%3 == 0).collect(Collectors.toCollection(ArrayList :: new));
		arrlist.forEach(System.out::println);*/
		
		
		
	}

}
