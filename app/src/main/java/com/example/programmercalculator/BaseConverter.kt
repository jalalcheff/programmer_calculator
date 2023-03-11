package com.example.programmercalculator

import android.util.Log

open class BaseConverter {
   open fun convertBinaryFromDecimal(decimal: String): String {
        return decimal.toLong().toString(2)
    }

    open fun convertBinaryFromHexa(hexa : String):String
    {
        val decmal = hexa.toLong(16)
        return decmal.toString(2)

    }

    open fun convertBinaryFromOctal1(octal: String): String {
        val decimal=octal.toLong(8)
        return decimal.toString(2)
    }
}