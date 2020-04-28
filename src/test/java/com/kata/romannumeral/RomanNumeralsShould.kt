package com.kata.romannumeral

import org.junit.Assert
import org.junit.Test

class RomanNumeralsShould {

    @Test
    fun `given 1 should return I in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("I", romanNummeral.convert(arabicNumber = 1))
    }

    @Test
    fun `given 2 should return II in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("II", romanNummeral.convert(arabicNumber = 2))
    }


    @Test
    fun `given 4 should return IV in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("IV", romanNummeral.convert(arabicNumber = 4))
    }

}