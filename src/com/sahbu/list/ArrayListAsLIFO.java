package com.sahbu.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAsLIFO {
	public static List<Integer> convertListIntoLIFO(List<Integer> list){
		System.out.println("Before Lifo: "+list);
		 Collections.reverse(list);
		 return list;
	}
public static void main(String[] args) {
	System.out.println("After Lifo: "+	convertListIntoLIFO(Arrays.asList(10,4,23,0,54)));
 }
}
