package com.kata.romannumeral

class RomanNummeral {
    fun convert(arabicNumber: Int): String {
        if (arabicNumber.equals(2)) {
            return "II";
        }
        return "I";
    }
}
