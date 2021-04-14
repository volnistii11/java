package ru.ncedu.somov.task2_2;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

/**
 * Основной класс Main, где происходит тестирование остальных классов
 */


public class Main {

    public static void main(String[] args) throws ParseException {

        gameInterface game = new Game();
        game.bonesGame(5,5);
        System.out.println("===========================================================================================");

    }
}
