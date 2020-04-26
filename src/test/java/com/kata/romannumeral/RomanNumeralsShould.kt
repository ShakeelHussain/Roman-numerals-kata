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

    @Test
    fun `given 4 shoud return IV in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("IV", romanNummeral.convert(arabicNumber = 4))
    }

    @Test
    fun `given 5 shoud return IV in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("V", romanNummeral.convert(arabicNumber = 5))
    }

    @Test
    fun `given 6 shoud return VI in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("VI", romanNummeral.convert(arabicNumber = 6))
    }


}