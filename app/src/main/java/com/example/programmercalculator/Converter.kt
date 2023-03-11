package com.example.programmercalculator

import android.util.Log
import com.example.programmercalculator.Constants.BINARY
import com.example.programmercalculator.Constants.DECEMAL
import com.example.programmercalculator.Constants.HEXA
import com.example.programmercalculator.Constants.OCTAL

class Converter(var systemNumberType:String,var numberValues: String): BaseConverter() {
private var decimal:String = this.convertToDecimal(numberValues)
        fun checkSelectionSystemType():SystemNumberValues
        {
            return when(systemNumberType)
            {
                 HEXA->convertFromHexa(decimal)
                 OCTAL->convertFromOctal(decimal)
                 DECEMAL->convertFromDecemal(decimal)
                 BINARY->convertFromBinary(decimal)
                else -> throw Exception("invalid")
            }
            }


    private fun convertFromBinary(decimal: String): SystemNumberValues {
        val hexa = convertToHexa(decimal)
        val octal = convertToOctal1(decimal)
        val binary = convertToBinary(decimal)
        Log.i("location","bebeee")
        return SystemNumberValues(hexa, decimal, octal, binary)
    }

    private fun convertFromDecemal(decimal: String): SystemNumberValues {
        val hexa = convertToHexa(decimal)
        val octal = convertToOctal1(decimal)
        val binary = convertToBinary(decimal)
        Log.i("location","decaa")
        return SystemNumberValues(hexa, decimal, octal, binary)
    }

    private fun convertFromOctal(decimal: String): SystemNumberValues {
        val hexa = convertToHexa(decimal)
        val octal = convertToOctal1(decimal)
        val binary = convertToBinary(decimal)
        Log.i("location","octaa")
        return SystemNumberValues(hexa, decimal, octal, binary)
    }

    private fun convertFromHexa(decimal: String): SystemNumberValues {
        val hexa = convertToHexa(decimal)
        val octal = convertToOctal1(decimal)
        val binary = convertToBinary(decimal)
        Log.i("location","hexxaa")
        return SystemNumberValues(hexa, decimal, octal, binary)
    }

    // convert functions
    private fun convertToHexa(decimal : String):String
    {
        return decimal.toLong().toString(16).uppercase()
    }
    private fun convertToOctal1(decimal: String): String {
        return decimal.toLong().toString(8)
    }
    private fun convertToBinary(binary: String): String {
        return binary.toLong().toString(2)
    }



}
