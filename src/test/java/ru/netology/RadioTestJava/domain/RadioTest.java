package ru.netology.RadioTestJava.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test// действия со станциями
    public void next() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со станциями
    public void doNotNext() {
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
        radio.setCurrentStation(6);

        radio.previous();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со станциями
    public void doNotPrevious() {
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
    public void shouldNotSetStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(16);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//недопустимые значения

    public void shouldNotSetStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-6);

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

    @Test//классы эквивалентности
    public void shouldSetStationBorderMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLowerBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

   @Test// действия со звуком
    public void increase() {
       Radio radio = new Radio();
       radio.setCurrentVolume(80);

       radio.increase();

       int expected = 81;
       int actual = radio.getCurrentVolume();
       Assertions.assertEquals(expected, actual);

   }

       @Test// действия со звуком
    public void doNotIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increase();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со звуком
    public void decrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);

        radio.decrease();

        int expected = 69;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со звуком
    public void decreaseCycle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decrease();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test// действия со звуком
    public void doNotDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decrease();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test//допустимые значения
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//недопустимые значения
    public void shouldNotSetVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(116);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//недопустимые значения

    public void shouldNotSetVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-6);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//недопустимые значения
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//классы эквивалентности
    public void shouldSetVolumeBorderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLowerBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}



// действия со станциями
//граничные значения, кроме за нижней границей и за верхней границей
