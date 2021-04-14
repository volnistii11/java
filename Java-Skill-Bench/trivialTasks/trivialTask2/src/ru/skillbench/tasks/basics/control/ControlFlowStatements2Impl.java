package ru.skillbench.tasks.basics.control;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ControlFlowStatements2Impl implements ControlFlowStatements2{

    public ControlFlowStatements2Impl() {

    }

    public int getFunctionValue(int x) {
        int f;
        if ((x < -2) || (x > 2)) {
            f = 2 * x;
        } else {
            f = -3 * x;
        }
        return f;
    }

    public String decodeMark(int mark) {
        String stringMark = "";
        switch (mark) {
            case 1:
                stringMark = "Fail";
                break;

            case 2:
                stringMark = "Poor";
                break;

            case 3:
                stringMark = "Satisfactory";
                break;

            case 4:
                stringMark = "Good";
                break;

            case 5:
                stringMark = "Excellent";
                break;

            default:
                stringMark = "Error";
        }
        return stringMark;
    }

    public double[][] initArray() {
        double myArray[][] = new double[5][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                myArray[i][j] = (Math.pow(i, 4)) - Math.sqrt(j);
            }
        }
        return myArray;
    }

    public double getMaxValue(double[][] array) {
        double max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public Sportsman calculateSportsman(float P) {
        Sportsman sportsman = new Sportsman();

        float distance = 10;
        sportsman.addDay(distance);
        while (sportsman.getTotalDistance() < 200) {
            distance += distance * P / 100;
            sportsman.addDay(distance);
        }


        return sportsman;
    }


    public static void main(String[] args) {



    }
}
