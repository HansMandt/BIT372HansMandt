package com.example.unitcoverter;

public class Converter {
    public static float toCelcius(float fah) {
        return (fah - 32) * 5/9;
    }

    public static double toKilograms(double pounds) { return pounds * 0.45359237; }
}
