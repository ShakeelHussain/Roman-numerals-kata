package com.kata.romannumeral

class RomanNummeral {
    fun convert(arabicNumber: Int): String {
        return getRomanNumeral(arabicNumber)
    }

    private fun getRomanNumeral(arabicNumber: Int): String {
        var arabicNumber = arabicNumber;
        if (arabicNumber == 1) {
            return "I";
        }
        if (arabicNumber == 4) {
            return "IV";
        }

        if (arabicNumber == 5) {
            return "V";
        }

        val romanNummeral = getRomanNumeral(arabicNumber - 1)
        return "I" + romanNummeral;
    }
}
