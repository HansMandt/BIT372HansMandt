package com.example.unitcoverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ConverterTest {
    @Test
    public void fahrenheit_conversion_isCorrect() {
        assertEquals(0.0, Converter.toCelcius(32),0.01);
    }

    @Test
    public void pounds_conversion_isCorrect() {
        assertEquals( 4.54, Converter.toKilograms(10), 0.1);
    }

    @Test
    public void ounces_conversion_isCorrect() {
        assertEquals( 28.41, Converter.toCentiLiters(10), 0.1);
    }

    @Test
    public void miles_conversion_isCorrect() {
        assertEquals(96.56, Converter.toKilometers(60), 0.1);
    }
}