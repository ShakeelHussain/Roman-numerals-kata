package com.kata.romannumeral

class RomanNummeral {
    fun convert(arabicNumber: Int): String? {
        val romanNumbers = mapOf(1 to "I", 4 to "IV", 5 to "V", 6 to "VI", 7 to "VII", 8 to "VIII")
        if (romanNumbers.containsKey(arabicNumber)) {
            return romanNumbers[arabicNumber]
        }
        return "I" + convert(arabicNumber - 1);
    }

}
