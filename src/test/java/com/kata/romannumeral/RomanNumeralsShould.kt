package com.kata.romannumeral

import org.junit.Assert
import org.junit.Test

class RomanNumeralsShould {

    @Test
    fun `giiven 1 shoud return I in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("I", romanNummeral.convert(arabicNumber = 1))
    }

    @Test
    fun `given 2 shoud return II in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("II", romanNummeral.convert(arabicNumber = 2))
    }

    @Test
    fun `given 3 shoud return III in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("III", romanNummeral.convert(arabicNumber = 3))
    }


}