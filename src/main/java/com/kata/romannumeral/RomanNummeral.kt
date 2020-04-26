package com.kata.romannumeral

class RomanNummeral {
    fun convert(arabicNumber: Int): String {
        return getRomanNumeral(arabicNumber)
    }

    private fun getRomanNumeral(arabicNumber: Int): String {
        if (arabicNumber == 1) {
            return "I";
        }
        val romanNummeral = getRomanNumeral(arabicNumber - 1)
        return "I" + romanNummeral;
    }
}
