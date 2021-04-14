package ru.ncedu.somov.task2_3;

import ru.ncedu.somov.task2_2.Game;
import ru.ncedu.somov.task2_2.gameInterface;

import java.text.ParseException;

/**
 * Основной класс Main, где происходит тестирование остальных классов
 */


public class Main {

    public static void main(String[] args) throws ParseException {


        System.out.println("equals==============================================================");
        ExtendedClass a = new ExtendedClass((byte) 2,2,1,"qwe1");
        ExtendedClass b = new ExtendedClass((byte) 2,2,1,"qwe");
        System.out.println(a.equals(b));


        System.out.println("hashcode============================================================");
        if (a.hashCode() == b.hashCode()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        System.out.println("toString============================================================");
        System.out.println(a.toString());

    }
}
