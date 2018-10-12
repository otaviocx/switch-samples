package com.aurea.bootcamp.switch_samples.assignment3;

import com.aurea.bootcamp.switch_samples.Helper;

public class SwitchesForAssignment3Bonus {
    public Integer doBonusImprovement1(Helper helper, int value) {
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

    public Integer doSample2(Helper helper, int value1, int value2) {
        int resultValue;
        switch (value1) {
            case 1:
                resultValue = helper.sum(value1, value2);
            break;
            case 2:
                resultValue = helper.doubles(value1+value2);
            break;
            case 3:
                resultValue = helper.divide(value2, value1);
            break;
            default:
                resultValue = -1;
            break;
        }
        return resultValue;
    }

    public Integer doSample3(Helper helper, int value1, int value2) {
        switch (value1) {
            case 1:
                return helper.sum(value1, value2);
            case 2:
                return helper.doubles(value1+value2);
            case 3:
                return helper.divide(value2, value1);
            default:
                return -1;
        }
    }

}
