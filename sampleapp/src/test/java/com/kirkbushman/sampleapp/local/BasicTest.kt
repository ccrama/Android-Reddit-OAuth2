package com.kirkbushman.sampleapp.local

import org.junit.Assert.*
import org.junit.Test

class BasicTest {

    @Test
    fun basicMathTest() {
        assertEquals("Assert basic sum of two numbers", 4, 2 + 2)
    }

    @Test
    fun basicStringTest() {
        assertEquals("Assert basic replacing of string", "Hello World!".replace("World", "Universe"), "Hello Universe!")
    }
}
