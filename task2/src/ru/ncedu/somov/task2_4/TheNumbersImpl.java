package ru.ncedu.somov.task2_4;


/**
 * Создайте интерфейс TwoNumbers с методами setX(), setY(),
 * getDifference(). Реализуйте интерфейс в классе TheNumbersImpl.
 * setX() должен устанавливать значение поля x, setY() – значение
 * поля y. getDifference() печатает на экран абсолютное значение
 * разности x и y.
 */
public class TheNumbersImpl implements TwoNumbers{
    private double x;
    private double y;



    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getDifference() {
        return Math.abs(x-y);
    }
}
