package com.kata.romannumeral

class RomanNummeral {
    fun convert(arabicNumber: Int): String {
        return getRomanNumeral(arabicNumber)
    }

    private fun getRomanNumeral(arabicNumber: Int): String {
        if (arabicNumber == 1) {
            return "I";
        }
        if (arabicNumber == 4) {
            return "IV";
        }
        val romanNummeral = getRomanNumeral(arabicNumber - 1)
        return "I" + romanNummeral;
    }
}
