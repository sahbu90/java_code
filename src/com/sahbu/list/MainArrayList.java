package com.sahbu.list;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		ArrayList<Integer> arrList = new ArrayList<Integer>(11);
		arrList.add(1);
		arrList.add(1);
		arrList.add(1);
//		arrList.add(1);
//		arrList.add(1);
//		arrList.add(1);
//		arrList.add(1);
//		arrList.add(1);
//		arrList.add(1);
//		arrList.add(1);
//		arrList.add(1);
		//reflection
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		Object[] elementData = (Object[]) field.get(arrList);
		System.out.println("ArrayList capacity: "+elementData.length);
		arrList.add(1);
		
		elementData = (Object[]) field.get(arrList);
		System.out.println("ArrayList capacity: "+elementData.length);
		System.out.println("ArrayList size: before trimtosize "+arrList.size());

		arrList.trimToSize();
		System.out.println("ArrayList capacity after trimtosize: "+arrList.size());

	}
}
