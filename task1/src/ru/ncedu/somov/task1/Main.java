package ru.ncedu.somov.task1;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

/**
 * Основной класс Main, где происходит тестирование остальных классов
 */


public class Main {

    public static void main(String[] args) throws ParseException {

        System.out.println("===========================================================================================");
        //Проверка работы задания 1(уравнение)
        Equation equation = new Equation();
        System.out.println("20 * x^2 + (-41) * x +2 =0");
        equation.resultEquation(20, -41, 2);
        System.out.println("===========================================================================================");

        //Проверка работы задания 2(игра)
        Game game = new Game();
        game.bonesGame(5,5);
        System.out.println("===========================================================================================");

        //Проверка работы задания 3(адрес человека)
        HumanAddress humanAddress = new HumanAddress();

        System.out.println("Поиск людей с фамилией Smith");
        System.out.println(humanAddress.searchBySurname("Smith"));

        System.out.println("Поиск людей с атрибутом адреса 2");
        System.out.println(humanAddress.searchByAddressAttribute(2));

        System.out.println("Поиск людей, который родились в диапазоне [1997.04.11;1997.05.11]");
        System.out.println(humanAddress.searchByDateOfBirthRange("1997-04-11", "1997-05-11"));

        System.out.println("Поиск самого молодого человека в списке");
        System.out.println(humanAddress.searchForTheYoungestHuman());

        System.out.println("Поиск людей, живущих на улице Myasnickaya");
        System.out.println(humanAddress.searchPeopleByStreetName("Myasnickaya"));
        System.out.println("===========================================================================================");

    }
}
