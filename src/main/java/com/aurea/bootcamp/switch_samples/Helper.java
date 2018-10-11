package com.aurea.bootcamp.switch_samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Helper {
	public void methodWithoutReturn(int param) {
		System.out.println("The given param was "+param);
	}

	public void printString(String str) {
		System.out.println("Given String: "+str);
	}

	public void printExceptionMessage(Exception ex) {
		System.out.println("Exception Message: "+ex.getMessage());
	}

	public void printObjects(Object... objs) {
		for(Object obj : objs) {
			System.out.println("Obj: "+obj);
		}
	}

	public int doubles(int param) {
		return param*2;
	}
	
	public Integer sum(Integer param1, Integer param2) {
		return param1+param2;
	}
	
	public Integer divide(Integer param1, Integer param2) {
		return param1 / param2;
	}

	public LinkedList<String> returnLinkedList(String... args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addAll(Arrays.asList(args));
		return list;
	}

	public String returnString() {
		return "Just a simple string";
	}

	public Object returnAnObject() {
		return new Object();
	}
}
