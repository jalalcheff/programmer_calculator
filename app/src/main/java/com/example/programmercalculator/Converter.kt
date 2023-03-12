package com.example.programmercalculator

import android.util.Log
import com.example.programmercalculator.Constants.BINARY
import com.example.programmercalculator.Constants.DECEMAL
import com.example.programmercalculator.Constants.HEXA
import com.example.programmercalculator.Constants.OCTAL

class Converter(var systemNumberType:String,var numberValues: String): BaseConverter() {
//private var decimal:String = this.convertToDecimal(numberValues)
        fun checkSelectionSystemType():SystemNumberValues
        {
            return when(systemNumberType)
            {
                 HEXA->{
                     Log.i("rere",convertBinaryFromHexa(numberValues))
                     convertFromHexa(convertBinaryFromHexa(numberValues))
                 }
                 OCTAL->convertFromOctal(convertBinaryFromOctal1(numberValues))
                 DECEMAL-> {
                     Log.i("rere",convertBinaryFromDecimal(numberValues))
                     convertFromDecemal(convertBinaryFromDecimal(numberValues))

                 }
                 BINARY->convertFromBinary(numberValues)
                else -> throw Exception("invalid")
            }

            }


    private fun convertFromBinary(binary: String): SystemNumberValues {
        val hexa = convertToHexa(binary)
        val octal = convertToOctal1(binary)
        val decimal = convertToDecemal(binary)
        return SystemNumberValues(hexa, decimal, octal, binary)
    }

    private fun convertFromDecemal(binary: String): SystemNumberValues {
        val hexa = convertToHexa(binary)
        val octal = convertToOctal1(binary)
        val decimal=convertToDecemal(binary)
        val binary = binary
        Log.i("bobo",SystemNumberValues(hexa, decimal, octal, binary).octal)
        return SystemNumberValues(hexa, decimal, octal, binary)
    }

    private fun convertFromOctal(binary: String): SystemNumberValues {
        val hexa = convertToHexa(binary)
        val octal = convertToOctal1(binary)
        val decimal = convertToDecemal(binary)
        return SystemNumberValues(hexa, decimal, octal, binary)
    }

    private fun convertFromHexa(binary: String): SystemNumberValues {
        val hexa = convertToHexa(binary)
        val octal = convertToOctal1(binary)
        val decimal = convertToDecemal(binary)
        return SystemNumberValues(hexa, decimal, octal, binary)
    }

    // convert functions
    private fun convertToHexa(binary : String):String
    {
        return convertToDecemal(binary).toLong().toString(16).uppercase()
    }
    private fun convertToOctal1(binary: String): String {
        return convertToDecemal(binary).toLong().toString(8)
    }
     fun convertToDecemal(binary: String): String {
            return binary.toInt(2).toString()
    }



}
