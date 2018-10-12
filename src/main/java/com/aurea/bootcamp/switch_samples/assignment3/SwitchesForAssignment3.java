package com.aurea.bootcamp.switch_samples.assignment3;

import com.aurea.bootcamp.switch_samples.Helper;

public class SwitchesForAssignment3 {
    public static final String RESULT1 = "Another String";
    public static final String RESULT2 = "Good Assignment";
    public static final int RESULT3 = 1000;
    public static final long RESULT4 = 100;

    private Helper helper;

    public SwitchesForAssignment3(Helper helper, int anotherParam) {
        this.helper = helper;
        System.out.println("Initializing with anotherParam = "+anotherParam);
    }

    public Integer doSample1(int param) {
        Integer result;
        switch (param) {
            case 1: result = helper.doubles(param); break;
            case 2:    result = helper.doubles(param*4); break;
            case 3:    result = helper.doubles(param*5); break;
            default: result = -1; break;
        }
        return result;
    }
    public int doSample2(int value1, int value2) {
        int result = 0;
        switch (value1) {
            case 1:
                result = this.helper.sum(value1, value2);
            break;
            case 2:
                result = 34200;
            break;
            case 3:
                result = RESULT3;
            break;
        }
        return result;
    }
    public String doSample3(int value1, int value2) {
        String result;
        switch (value1) {
            case 1:
                result = "Just a string";
            break;
            case 2:
                result = RESULT1;
            break;
            case 3:
                result = RESULT2;
            break;
            default:
                result = "";
        }
        return result;
    }
    public Long doSample4(long value1, String str) {
        Long result;
        switch (str) {
            case "One":
                result = 1L;
                break;
            case "Two":
                result = 2L;
                break;
            case "First Param":
                result = value1;
                break;
            default:
                result = RESULT4;
        }
        return result;
    }
    public Integer doBonus2(int value) {
        switch (value) {
            case 9:
                return helper.sum(value, 2);
            case 8:
                return helper.sum(value, 5);
            case 7:
                return helper.sum(value, 4);
        }
        throw new IllegalArgumentException("The value needs to be 9, 8 or 7.");
    }
    public Integer doBonusImprovement1(int value) {
        switch (value) {
            case 5:
                return helper.sum(value, 2);
            case 10:
                return helper.sum(value, 5);
            case -1:
                throw new ArithmeticException("Just throwing an exception for -1");
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
            case 7:    result = helper.doubles(param*5); break;
            default:
                result = -1; break;
        }
        return result;
    }

}
