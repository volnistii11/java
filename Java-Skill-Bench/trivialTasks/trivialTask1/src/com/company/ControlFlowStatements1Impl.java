package ru.skillbench.tasks.basics.control;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class ControlFlowStatements1Impl implements ControlFlowStatements1 {

    public ControlFlowStatements1Impl() {

    }

    public float getFunctionValue(float x) {
        float f;
        if (x > 0) {
            f = (float) (2 * Math.sin(x));
        } else {
            f = 6 - x;
        }
        return f;
    }

    public String decodeWeekday(int weekday) {
        String stringWeekday;
        switch (weekday) {
            case 1:
                stringWeekday = "Monday";
                break;

            case 2:
                stringWeekday = "Tuesday";
                break;

            case 3:
                stringWeekday = "Wednesday";
                break;

            case 4:
                stringWeekday = "Thursday";
                break;

            case 5:
                stringWeekday = "Friday";
                break;

            case 6:
                stringWeekday = "Saturday";
                break;

            case 7:
                stringWeekday = "Sunday";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + weekday);
        }
        return stringWeekday;
    }

    public int[][] initArray() {
        int myArray[][] = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                myArray[i][j] = i * j;
            }
        }
        return myArray;
    }

    public int getMinValue(int[][] array) {
        int min = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public BankDeposit calculateBankDeposit(double P) {
        BankDeposit bankDeposit = new BankDeposit();
        bankDeposit.years = 0;
        bankDeposit.amount = 1000;
        while (bankDeposit.amount < 5000) {
            bankDeposit.amount = bankDeposit.amount + (bankDeposit.amount * P) / 100;
            bankDeposit.years++;
        }
        return bankDeposit;
    }



    public static void main(String[] args) {



    }
}
