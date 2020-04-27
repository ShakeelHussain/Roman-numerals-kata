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

        var romanNummeral = getRomanNumeral(arabicNumber - 1)

        if (arabicNumber > 5 ) {
            arabicNumber =  arabicNumber % 5
            var romanNummeral = getRomanNumeral(arabicNumber )
            return "V" + romanNummeral;
        }

        if (arabicNumber == 4) {
            return "I" + "V";
        }

        if (arabicNumber == 5) {
            return "V";
        }

        return "I" + romanNummeral;
    }
}
