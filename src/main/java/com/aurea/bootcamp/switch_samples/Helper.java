package com.aurea.bootcamp.switch_samples;

public class Helper {
	public void methodWithoutReturn(int param) {
		System.out.println("The given param was "+param);
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
