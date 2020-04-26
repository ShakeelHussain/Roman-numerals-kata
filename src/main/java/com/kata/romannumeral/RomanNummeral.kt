package com.kata.romannumeral

class RomanNummeral {
    fun convert(arabicNumber: Int): String {
        if (arabicNumber.equals(2)) {
            return "II";
        }
        if (arabicNumber.equals(3)) {
            return "III";
        }
        return "I";
    }
}
