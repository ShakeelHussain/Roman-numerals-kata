package com.kata.romannumeral

class RomanNummeral {
    fun convert(arabicNumber: Int): String? {
        val romanNumbers = mapOf(
                1 to "I",
                4 to "IV",
                5 to "V",
                9 to "IX",
                10 to "X",
                20 to "XX",
                40 to "XL")

        if (romanNumbers.containsKey(arabicNumber)) {
            return romanNumbers[arabicNumber]
        }

        if (arabicNumber > 10) {
            val numberToSubtract = arabicNumber % 10
            val tenBase = arabicNumber - numberToSubtract
            return romanNumbers[tenBase] + convert(arabicNumber % tenBase)
        }

        if (arabicNumber < 4)
            return "I" + convert(arabicNumber - 1)

        return convert(arabicNumber - 1) + "I"
    }

}
