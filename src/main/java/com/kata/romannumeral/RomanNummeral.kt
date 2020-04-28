package com.kata.romannumeral

class RomanNummeral {
    fun convert(arabicNumber: Int): String {
        val romanNumbers = listOf("I", "II", "III", "IV")
        return romanNumbers[arabicNumber - 1];
    }

}
