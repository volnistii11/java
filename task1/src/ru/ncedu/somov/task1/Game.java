package ru.ncedu.somov.task1;

import java.util.Arrays;
import java.util.Random;

/**
 * В классе Game происходит реализация игры в кости.
 * Играют N игроков (компьютер в списке последний). Подкидываются одновременно К кубиков.
 * Выигрывает тот, у кого большая сумма очков.
 * Кто выиграл, тот и кидает первым в следующем кону(тот, кто был за ним, становится вторым и т.д.).
 * Игра идет до 7 выигрышей. Начинаете игру Вы (Пользователь под номером 1).
 */

public class Game {

    /**
     *
     * @param n - число игроков
     * @param k - колличество кубиков
     * В методе bonesGame происходит вся реализация игры в кости.
     * В players_results[i][0] записывается результат, который выбил i-ый игрок, бросив k кубиков.
     * В players_results[i][1] записывается колличество побед i-ого игрока за 7 раундов
     */
    public void bonesGame(int n, int k) {
        int[][] players_results = new int[n][2];
        int round;
        Random rnd = new Random(System.currentTimeMillis());

        System.out.println("\nПользователь - это игрок под номером 1");
        System.out.println("Если максимальное колличество очков одинаково, то побеждает тот, кто первый бросил кубики. "
                + "\nПоэтому тот, кто побеждает по очкам в текущем раунде, в следующем раунде бросает первый "
                + "\nи отсчет начинается с него\n");
        int winner = 0;
        for (round = 0; round < 7; round++) {


            int z = 0;


            for (int i = winner; i < n; i++) {
                System.out.println("Бросает кости игрок по номером " + (i + 1));
                players_results[i][0] = 0;
                int j = 0;
                while (j < k) {
                    players_results[i][0] = players_results[i][0] + 1 + rnd.nextInt(6);
                    j++;
                }
                System.out.println(" Сумма игрока номер " + (i + 1) + " равна " + players_results[i][0]);
                if (i == (n - 1)) {
                    i = -1;
                }
                if (z == (n - 1)) break;
                z++;
            }

            int max = players_results[0][0];
            int max_index = 0;

            for (int i = 1; i < n; i++) {
                if (players_results[i][0] > max) {
                    max = players_results[i][0];
                    max_index = i;
                }
            }
            players_results[max_index][1]++;
            System.out.println("Побеждает игрок номер " + (max_index + 1) + " поэтому он начинает следующий раунд");
            System.out.println("--------------------------------------------------Конец " + (round + 1) + " раунда");
            winner = max_index;

        }
        System.out.println("Колличество побед " + (1) + "игрока = " + players_results[0][1]);
        System.out.println("Колличество побед " + (2) + "игрока = " + players_results[1][1]);
        System.out.println("Колличество побед " + (3) + "игрока = " + players_results[2][1]);
        System.out.println("Колличество побед " + (4) + "игрока = " + players_results[3][1]);
        System.out.println("Колличество побед " + (5) + "игрока = " + players_results[4][1]);
    }

}
