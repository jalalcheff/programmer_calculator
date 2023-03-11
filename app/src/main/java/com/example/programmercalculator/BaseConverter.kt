package com.example.programmercalculator

open class BaseConverter {
  open  fun convertToDecimal(binary: String): String {
        val digitList = binary.map { it.toString().toInt() }
        var decimal = 0
        var digitCounter = 1
        for (element in digitList) {
            if (element == 1)
                decimal += digitCounter
            digitCounter *= 2
        }
        return decimal.toString()
    }
}