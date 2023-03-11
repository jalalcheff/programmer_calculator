package com.example.programmercalculator

open class BaseConverter {
    fun convertFromDecimal(decimal: String): String {
        return decimal.toLong().toString(2)
    }

    fun convertFromHexa(hexa : String):String
    {
        val decmal = hexa.toLong(16)
        return decmal.toString(2)
    }

    fun convertFromOctal1(octal: String): String {
        val decimal=octal.toLong(8)
        return decimal.toString(2)
    }
}