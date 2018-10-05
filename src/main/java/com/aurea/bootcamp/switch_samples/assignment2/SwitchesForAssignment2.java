package com.aurea.bootcamp.switch_samples.assignment2;

import com.aurea.bootcamp.switch_samples.Helper;

public class SwitchesForAssignment2 {
	public static final int[] RESULTS = {9,8,7};
	public static final int RESULT1 = 10;
	public static final int RESULT2 = 100;
	public static final int RESULT3 = 1000;

	private Helper helper;
	
	public SwitchesForAssignment2(Helper helper, int anotherParam) {
		this.helper = helper;
		System.out.println("Initializing with anotherParam = "+anotherParam);
	}
	
	public Integer doSample1(int param) {
		switch (param) {
			case 1: return helper.doubles(param);	
			case 2:	return helper.doubles(param*4);	
			case 3:	return helper.doubles(param*5);
		}
		return null;
	}
	public Integer doSample2(int value1, int value2) {
		switch (value1) {
			case 1:
				return this.helper.sum(value1, value2);	
			case 2:
				return this.helper.doubles(value1+value2);	
			case 3:
				return this.helper.divide((double) value2, (double) value1).intValue();
		}
		return -1;
	}
	public Integer doBonus1(int value1) {
		switch (value1) {
			case 1:
				return RESULTS[2];	
			case 2:
				return RESULTS[1];	
			case 3:
				return RESULTS[0];
		}
		return RESULT1;
	}
	public Integer doBonus2(int value1) {
		switch (value1) {
			case 1:
				return RESULT1;	
			case 2:
				return RESULT2;	
			case 3:
				return RESULT3;
		}
		return RESULT1;
	}
	public Integer doBonus3(int value1) {
		switch (value1) {
			case 1:
				return 10;	
			case 2:
				return 100;	
			case 3:
				return 1000;
		}
		return 1;
	}	
}
