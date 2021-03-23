package com.example.mylibrary

import org.junit.Before
import org.junit.Test

class CalculatorLibTest {
    lateinit var classToTest: CalculatorLib

    @Before
    fun setUp() {
        classToTest = CalculatorLib()
    }

    @Test
    fun calculate() {
        assert(classToTest.calculate(2, 2) == 4)
    }
}
