package com.aurea.bootcamp.switch_samples.assignment1;

import com.aurea.bootcamp.switch_samples.Helper;

public class SwitchesForAssignment1 {
	public void doSample1(int number, Helper helper) {
		switch (number) {
			case 1:
				helper.methodWithoutReturn(number);
			break;
	
			case 2:
				helper.methodWithoutReturn(number*4);
			break;

			case 3:
				helper.methodWithoutReturn(number*5);
			break;
		}		
	}
	public void doSample2(Helper helperObj, int value) {
		switch (value) {
			case 1: helperObj.methodWithoutReturn(value); break;
			case 2:	helperObj.methodWithoutReturn(value*4); break;
			case 3:	helperObj.methodWithoutReturn(value*5); break;
		}		
	}
	public void doImprovement1(int num1, Helper helper) {
		switch (num1) {
		case 1: helper.methodWithoutReturn(num1); break;
		case 2:	helper.methodWithoutReturn(num1*4); break;
		case 3:	
			helper.methodWithoutReturn(num1*num1*num1); 
			break;
		default:
			helper.methodWithoutReturn(100);
			break;
		}		
	}
	public void doImprovement2(int param, Helper helper) {
		switch (param) {
			case 1: helper.methodWithoutReturn(param); break;
			case 2:	helper.methodWithoutReturn(param*4); break;
			case 3:	
				int newParam = param*param*param;
				helper.methodWithoutReturn(newParam); 
				break;
		}		
	}
	public void doImprovement3(int num1, int num2, Helper helper) {
		switch (num1) {
		case 1: helper.methodWithoutReturn(num1+num2); break;
		case 2:	helper.methodWithoutReturn(num1*4); break;
		case 3:	
			helper.methodWithoutReturn(num1*num2*num1); 
			break;
		default:
			helper.methodWithoutReturn(100);
			break;
		}		
	}
	
	
}
