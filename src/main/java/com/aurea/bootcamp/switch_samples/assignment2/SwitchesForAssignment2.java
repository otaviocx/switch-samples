package com.aurea.bootcamp.switch_samples.assignment2;

import com.aurea.bootcamp.switch_samples.Helper;

import java.util.LinkedList;

public class SwitchesForAssignment2 {
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
            case 2:    return helper.doubles(param*4);
            case 3:    return helper.doubles(param*5);
            default: return null;
        }
    }
    public Integer doSample2(int value1, int value2) {
        switch (value1) {
            case 1:
                return this.helper.sum(value1, value2);
            case 2:
                return this.helper.doubles(value1+value2);
            case 3:
                return this.helper.divide(value2, value1);
            default:
                return -1;
        }
    }
    public LinkedList<String> doSample3(int value1, int value2, String text) {
        switch (value1) {
            case 4:
                return helper.returnLinkedList(text, "Bla");
            case 5:
                return helper.returnLinkedList("Bla", text);
            default:
                return null;
        }
    }
    public Object doSample4(int number) {
        switch (number) {
            case 5:
                return helper.returnAnObject();
            default:
                return null;
        }
    }
    public String doSample5(int number) {
        switch (number) {
            case 5:
                return helper.returnString();
            case 10:
                return "Another String";
            default:
                return null;
        }
    }
    public Integer doBonus1(int value1) {
        switch (value1) {
            case 1:
                return RESULT1;
            case 2:
                return RESULT2;
            case 3:
                return RESULT3;
            default:
                return RESULT1;
        }
    }
    public Integer doBonus2(int num) {
        switch (num) {
            case 4:
                return 10;
            case 7:
                return 100;
            case 10:
                return 1000;
            default:
                return 1;
        }
    }
}
