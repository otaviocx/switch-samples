package com.aurea.bootcamp.switch_samples;

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
	
	public Double divide(Double param1, Double param2) {
		return param1 / param2;
	}
}
