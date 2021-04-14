package ru.ncedu.somov.task1;

/**
 * В классе Equation происходит рещение квадратного уравнения вида a * (x ^ 2) + b * x + c = 0
 * Также в классе Equation есть подкласс Discriminant, где происходит расчет дискриминанта уравнения
 */

public class Equation {

    private double result;

    private class Discriminant {

        private double d_result;

        private double decisionD(double a, double b, double c){

            d_result = b*b-4*a*c;
            return d_result;
        }

    }

    public void resultEquation(double a, double b, double c) {
        Discriminant discriminant = new Discriminant();
        discriminant.decisionD(a,b,c);

        if (discriminant.d_result > 0 ) {
            result = (-b + Math.sqrt(discriminant.d_result)) / (2 * a);
            System.out.println("x1 = " + result);

            result = (-b - Math.sqrt(discriminant.d_result)) / (2 * a);
            System.out.println("x2 = " + result);

        } else if (discriminant.d_result == 0) {
            result = -b / (2 * a);
            System.out.println("x = " + result);

        } else {
            System.out.println("Корней нет.");
        }

    }

}
