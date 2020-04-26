package com.kata.romannumeral

import org.junit.Assert
import org.junit.Test

class RomanNumeralsShould {

    @Test
    fun `giiven 1 shoud return I in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("I", romanNummeral.convert(arabicNumber = 1))
    }

}