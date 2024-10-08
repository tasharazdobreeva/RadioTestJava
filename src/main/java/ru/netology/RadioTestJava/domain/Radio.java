package ru.netology.RadioTestJava.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStaion;

    public Radio() {
        this.maxStaion = 9;
    }

    public  Radio(int stationsCount) {
        this.maxStaion = stationsCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        if (currentStation != maxStaion) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void previous() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStaion;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStaion) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increase() {
        if (currentVolume !=100) {
            currentVolume ++;
        } else {
            currentVolume = 0;
        }
    }

    public void decrease() {
        if (currentVolume != 0) {
            currentVolume --;
        } else {
            currentVolume = 100;
        }
    }
}
