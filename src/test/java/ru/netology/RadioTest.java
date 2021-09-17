package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldNotSetStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMaxStation() + 1);
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetStationBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation() - 1);
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void currentStationNotEqualToMaxStation() {
        Radio rad = new Radio();

        rad.nextStation();

        int expected = rad.getMinStation();
        int actual = rad.getCurrentStation() - 1;

        assertEquals(expected, actual);
    }

    @Test
    public void currentStationNotEqualToMinStation() {
        Radio rad = new Radio();

        rad.prevStation();

        int expected = rad.getMaxStation();
        int actual = rad.getCurrentStation() + 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio rad = new Radio();
        rad.setMaxStation(9);

        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio rad = new Radio();
        rad.setMinStation(0);

        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }





    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume() + 1);

        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume() - 1);

        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpVolume() {
        Radio rad = new Radio();
        rad.increaseVolume();

        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio rad = new Radio();
        rad.decreaseVolume();

        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();
        rad.setMaxVolume(10);

        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio rad = new Radio();
        rad.setMinVolume(0);

        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }




}

