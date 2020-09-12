package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(10);
        conditioner.increaseCurrentTemperature();
        assertEquals(11, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(9, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureOverMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(5);
        conditioner.decreaseCurrentTemperature();
        assertEquals(5, conditioner.getCurrentTemperature());
    }

    @Test
    public void setCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(30);
        assertEquals(30, conditioner.getCurrentTemperature());
    }
    @Test
    public void setCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(5);
        assertEquals(5, conditioner.getCurrentTemperature());
    }

    @Test
    void SetCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(20);
        int expected = 20;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

}