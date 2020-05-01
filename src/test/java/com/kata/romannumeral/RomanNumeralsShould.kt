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
    fun `given 3 should return III in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("III", romanNummeral.convert(arabicNumber = 3))
    }

    @Test
    fun `given 4 should return IV in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("IV", romanNummeral.convert(arabicNumber = 4))
    }

    @Test
    fun `given 5 should return V in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("V", romanNummeral.convert(arabicNumber = 5))
    }

    @Test
    fun `given 6 should return VI in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("VI", romanNummeral.convert(arabicNumber = 6))
    }

    @Test
    fun `given 7 should return VII in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("VI", romanNummeral.convert(arabicNumber = 6))
    }

    @Test
    fun `given 8 should return VIII in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("VIII", romanNummeral.convert(arabicNumber = 8))
    }

    @Test
    fun `given 9 should return IX in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("IX", romanNummeral.convert(arabicNumber = 9))
    }

    @Test
    fun `given 10 should return X in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("X", romanNummeral.convert(arabicNumber = 10))
    }

    @Test
    fun `given 11 should return XI in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("XI", romanNummeral.convert(arabicNumber = 11))
    }

    @Test
    fun `given 12 should return XII in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("XII", romanNummeral.convert(arabicNumber = 12))
    }

    @Test
    fun `given 43 should return dfsadf in roman`() {
        val romanNummeral: RomanNummeral = RomanNummeral();
        Assert.assertEquals("XLIII", romanNummeral.convert(arabicNumber = 43))
    }

}