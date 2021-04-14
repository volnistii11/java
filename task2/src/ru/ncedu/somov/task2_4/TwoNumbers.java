package ru.ncedu.somov.task2_4;

/**
 * Создайте интерфейс TwoNumbers с методами setX(), setY(),
 * getDifference(). Реализуйте интерфейс в классе TheNumbersImpl.
 * setX() должен устанавливать значение поля x, setY() – значение
 * поля y. getDifference() печатает на экран абсолютное значение
 * разности x и y.
 */
public interface TwoNumbers {
    public void setX(double x);
    public void setY(double y);
    public double getDifference();
}
