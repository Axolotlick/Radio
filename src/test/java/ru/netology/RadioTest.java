package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void containsTheNumberOfStations() {
        Radio rad = new Radio(4);

        assertEquals(4, rad.getNumberOfStations());
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation() - 1);

        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMaxStation() + 1);

        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpNextStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpNextStation3() {
        Radio rad = new Radio();
        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownPrevStation() {
        Radio rad = new Radio(20);
        rad.prevStation();

        int expected = 19;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownPrevStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownPrevStation3() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume() - 12);

        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume() + 12);

        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpVolume() {
        Radio rad = new Radio();
        rad.increaseTheVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.increaseTheVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpVolume3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseTheVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume() {
        Radio rad = new Radio();
        rad.decreaseTheVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.decreaseTheVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(30);
        rad.decreaseTheVolume();

        int expected = 29;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeNotEqualToMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume());
        rad.increaseTheVolume();

        int expected = rad.getMinVolume() + 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeNotEqualToMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume());
        rad.decreaseTheVolume();

        int expected = rad.getMaxVolume() - 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}