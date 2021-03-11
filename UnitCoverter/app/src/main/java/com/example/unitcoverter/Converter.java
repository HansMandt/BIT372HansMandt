package com.example.unitcoverter;

public class Converter {

    public static float toCelcius(float fah) {
        return (fah - 32) * 5/9;
    }

    public static double toKilograms(double pounds) { return pounds * 0.45359237; }

    public static double toCentiLiters(double ounces) { return  ounces * 2.841306; }

    public static double toKilometers(double miles) { return  miles * 1.609344; }
}