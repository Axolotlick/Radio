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
    public void shouldSetStationEqualToCurrent() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getCurrentStation() + 1);
        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void currentStationNotEqualToMaxStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation());
        rad.nextStation();

        int expected = rad.getMinStation();
        int actual = rad.getCurrentStation() - 1;

        assertEquals(expected, actual);
    }

    @Test
    public void currentStationNotEqualToMinStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMaxStation());
        rad.prevStation();

        int expected = rad.getMaxStation();
        int actual = rad.getCurrentStation() + 1;

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = rad.getMinStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = rad.getMaxStation();
        int actual = rad.getCurrentStation();

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
        rad.setCurrentVolume(rad.getMaxVolume() + 12);

        int expected = rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();

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

    @Test
    public void shouldNotTurnUpVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume());
        rad.increaseVolume();

        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume());
        rad.decreaseVolume();

        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume());
        rad.increaseVolume();

        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume());
        rad.decreaseVolume();

        int expected = rad.getCurrentStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
}

