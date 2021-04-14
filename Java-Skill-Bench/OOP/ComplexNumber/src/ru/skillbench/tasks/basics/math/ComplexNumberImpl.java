package ru.skillbench.tasks.basics.math;

import java.util.Arrays;

public class ComplexNumberImpl implements ComplexNumber {

    double re = 0;
    double im = 0;

    public static void main(String[] args) {
        // write your code here
    }

    @Override
    public double getRe() {
        return re;
    }

    @Override
    public double getIm() {
        return im;
    }

    @Override
    public boolean isReal() {
       if (im == 0) {
           return true;
       } else {
           return false;
       }
    }

    @Override
    public void set(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public void set(String value) throws NumberFormatException {
        String tempRe = "0";
        String tempIm = "0";

        if (value.isEmpty()) {
            throw new NumberFormatException();
        }

        int lastIndexPlus = value.lastIndexOf('+');
        int lastIndexMinus = value.lastIndexOf('-');
        int lastSignIndex = Math.max(lastIndexPlus, lastIndexMinus);

        if (value.indexOf('i') < 0) {
            if (lastSignIndex > 0) {
                throw new NumberFormatException();
            }
            else {
                tempRe = value;
            }
        }
        else {
            if (value.compareTo("i") == 0) {
                tempIm = "1";
            }
            else if (lastSignIndex > 0) {
                tempRe = value.substring(0, lastSignIndex);
                tempIm = value.substring(lastSignIndex, value.length() - 1);
            }
            else {
                tempIm = value.substring(0, value.length() - 1);
            }
        }

        if (tempRe.compareTo("+") == 0) {
            tempRe = "1";
        }
        else if (tempRe.compareTo("-") == 0) {
            tempRe = "-1";
        }

        if (tempIm.compareTo("+") == 0) {
            tempIm = "1";
        }
        else if (tempIm.compareTo("-") == 0) {
            tempIm = "-1";
        }

        this.re = Double.parseDouble(tempRe);
        this.im = Double.parseDouble(tempIm);
    }

    @Override
    public ComplexNumber copy() {
        ComplexNumber object = new ComplexNumberImpl();
        object.set(re, im);
        return object;
    }

    @Override
    public ComplexNumber clone() throws CloneNotSupportedException {
        ComplexNumber object = new ComplexNumberImpl();
        object.set(re, im);
        return object;
    }

    @Override
    public String toString(){
        if ((re == 0) && (im == 0)){
            return "0.0";
        }
        StringBuilder stingComplexNumber = new StringBuilder();
        if (re != 0) {
            stingComplexNumber.append(re);
            if (im > 0){
                stingComplexNumber.append("+");
            }
        }
        if (im != 0) {
            stingComplexNumber.append(im + "i");
        }
        return stingComplexNumber.toString();
    }

    @Override
    public boolean equals(Object other){
        if (this == other)
            return true;
        if (other instanceof ComplexNumber)
            return ((ComplexNumber) other).getRe() == re && ((ComplexNumber) other).getIm() == im;
        return false;
    }

    @Override
    public int compareTo(ComplexNumber other) {
        if ((re*re + im*im) == (other.getRe()*other.getRe() + other.getIm()*other.getIm())) {
            return 0;
        }
        if ((re*re + im*im) < (other.getRe()*other.getRe() + other.getIm()*other.getIm())) {
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override
    public void sort(ComplexNumber[] array) {
        Arrays.sort(array);
    }

    @Override
    public ComplexNumber negate() {
        re *= -1;
        im *= -1;
        return this;
    }

    @Override
    public ComplexNumber add(ComplexNumber arg2) {
        re += arg2.getRe();
        im += arg2.getIm();
        return this;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber arg2) {
        double buf = re*arg2.getRe() - im*arg2.getIm();
        im = im*arg2.getRe() + re*arg2.getIm();
        re = buf;
        return this;
    }
}
