package ru.skillbench.tasks.basics.math;

import java.util.Arrays;

public class ArrayVectorImpl implements ArrayVector {

    private double[] arrayVector;

    public ArrayVectorImpl() {

    }

    public void set(double... elements) {
        arrayVector = elements;

    }

    public double[] get() {
        return arrayVector;
    }

    public ArrayVector clone() {

        ArrayVector cloneVector = new ArrayVectorImpl();
        cloneVector.set(get().clone());
        return cloneVector;
    }

    public int getSize() {
        return arrayVector.length;
    }

    @Override
    public void set(int index, double value) {
        if ((index >= get().length) || index < 0) {
            if (index >= 0) {
                int diff = index - get().length + 1;
                double[] varVector;
                varVector = new double[get().length + diff];

                for (int i = 0; i < get().length; i++) {
                    varVector[i] = get()[i];
                }
                varVector[index] = value;

                arrayVector = varVector;
            }
        } else {
            arrayVector[index] = value;
        }


    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        return arrayVector[index];
    }

    @Override
    public double getMax() {
        double max = arrayVector[0];
        for (int i = 0; i < arrayVector.length; i++) {
            if (max < arrayVector[i]) {
                max = arrayVector[i];
            }
        }
        return max;
    }

    @Override
    public double getMin() {
        double min = arrayVector[0];
        for (int i = 0; i < arrayVector.length; i++) {
            if (min > arrayVector[i]) {
                min = arrayVector[i];
            }
        }
        return min;
    }

    @Override
    public void sortAscending() {
        Arrays.sort(arrayVector);
    }

    @Override
    public void mult(double factor) {
        for (int i = 0; i < arrayVector.length; i++) {
            arrayVector[i] *= factor;
        }
    }


    //Все верно выводит, но программа не принимает
    @Override
    public ArrayVector sum(ArrayVector anotherVector) {
        for (int i = 0; i < arrayVector.length; i++) {
                anotherVector.get()[i] = anotherVector.get()[i] + get()[i];
        }
        return anotherVector;
    }

    @Override
    public double scalarMult(ArrayVector anotherVector) {
        double result = 0;
        for (int i = 0; i < anotherVector.get().length; i++) {
            if (i < arrayVector.length ) {
                result += anotherVector.get(i) * get(i);
            }

        }
        return result;
    }

    @Override
    public double getNorm() {
        double result = 0;
        for (int i=0; i<arrayVector.length;i++){
            result+= arrayVector[i]*arrayVector[i];
        }
        result = Math.sqrt(result);
        return result;
    }

    public static void main(String[] args) {

        ArrayVectorImpl test = new ArrayVectorImpl();

        test.set(14, 2, 41, 77.3, 5, 77.5);

        System.out.println(Arrays.toString(test.get()));

        System.out.println(Arrays.toString(test.clone().get()));

        System.out.println(test.getSize());

        test.set(8, 23);
        System.out.println(Arrays.toString(test.get()));

        System.out.println(test.get(8));

        System.out.println(test.getMax());

        System.out.println(test.getMin());

        test.sortAscending();
        System.out.println(Arrays.toString(test.get()));

        test.mult(2);
        System.out.println(Arrays.toString(test.get()));

        ArrayVector secondVector = new ArrayVectorImpl();
        secondVector.set(1.1,1,1,1,1,1,1,1,1,1,1.5,1,1);

        System.out.println(Arrays.toString(test.sum(secondVector).get()));

        System.out.println(test.scalarMult(test.clone()));

        System.out.println(test.getNorm());
    }
}
