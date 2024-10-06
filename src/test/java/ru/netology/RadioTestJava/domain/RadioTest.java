package ru.netology.RadioTestJava.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test// действия со станциями
    public void next() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test// действия со станциями
    public void nextCycle() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со станциями
    public void previousCycle() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.previous();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со станциями
    public void previous() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.previous();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test//допустимые значения
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test//недопустимые значения

    public void shouldNotSetStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//недопустимые значения
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }



    @Test// действия со звуком
    public void increase() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increase();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test// действия со звуком
    public void doNotIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increase();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со звуком
    public void DoNotDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decrease();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со звуком
    public void decrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decrease();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test//допустимые значения
    public void SetVolumeValMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//недопустимые значения
    public void SetVolumeValMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со звуком
    public void IncreaseMid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.increase();

        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со звуком
    public void decreaseMid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.decrease();

        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
