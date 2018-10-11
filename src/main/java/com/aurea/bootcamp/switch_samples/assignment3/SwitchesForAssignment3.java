package com.aurea.bootcamp.switch_samples.assignment3;

import com.aurea.bootcamp.switch_samples.Helper;

public class SwitchesForAssignment3 {
	public static final int[] RESULTS = {9,8,7};
	public static final int RESULT1 = 10;
	public static final int RESULT2 = 100;
	public static final int RESULT3 = 1000;

	private Helper helper;
	
	public SwitchesForAssignment3(Helper helper, int anotherParam) {
		this.helper = helper;
		System.out.println("Initializing with anotherParam = "+anotherParam);
	}
	
	public Integer doSample1(int param) {
		Integer result;
		switch (param) {
			case 1: result = helper.doubles(param); break;	
			case 2:	result = helper.doubles(param*4); break;	
			case 3:	result = helper.doubles(param*5); break;
			default: result = -1; break;
		}
		return result;
	}
	public double doSample2(int value1, int value2) {
		double result = -1.0;
		switch (value1) {
			case 1:
				result = this.helper.sum(value1, value2).doubleValue();	
			case 2:
				result = this.helper.doubles(value1+value2);
			case 3:
				result = this.helper.divide(value2, value1);
		}
		return result;
	}
	public Integer doBonus1(int param) {
		Integer result = null;
		switch (param) {
			case 1: result = helper.doubles(param); break;	
			case 2:	result = helper.doubles(param*4); break;	
			case 3:	result = helper.doubles(param*5); break;
		}
		if(result == null) {
			throw new IllegalArgumentException("The value needs to be 1, 2 or 3.");
		}
		return result;
	}
	public Integer doBonus2(int value) {
		switch (value) {
			case 9: return helper.sum(value, 2);	
			case 8:	return helper.sum(value, 5);
			case 7:	return helper.sum(value, 4);	
		}
		throw new IllegalArgumentException("The value needs to be 9, 8 or 7.");
	}
	public Integer doImprovement1(int param) {
		Integer result;
		switch (param) {
			case 1: 
			case 3: 
			case 5: 
				result = helper.doubles(param); 
			break;	
			case 2:	
			case 4:	
				result = helper.doubles(param*4); 
				break;	
			case 7:	result = helper.doubles(param*5); break;
			default: 
				result = -1; break;
		}
		return result;
	}
	
}
