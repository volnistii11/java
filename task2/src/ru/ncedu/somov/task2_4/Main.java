package ru.ncedu.somov.task2_4;

import ru.ncedu.somov.task2_3.ExtendedClass;

import java.text.ParseException;

/**
 * Основной класс Main, где происходит тестирование остальных классов
 */


public class Main {

    public static void main(String[] args) throws ParseException {
            TwoNumbers xy = new TheNumbersImpl();

            xy.setX(10.2231);
            xy.setY(10.3311);

            System.out.println(xy.getDifference());

    }
}
