package com.example.programmercalculator

import com.example.programmercalculator.Constants.BINARY
import com.example.programmercalculator.Constants.DECEMAL
import com.example.programmercalculator.Constants.HEXA
import com.example.programmercalculator.Constants.OCTAL

class Converter(var systemNumberType:String): BaseConverter() {
private var decimal:String = this.convertToDecimal(systemNumberType)
        fun checkSelectionSystemType()
        {
            when(systemNumberType)
            {
                 HEXA->convertFromHexa(decimal)
                 OCTAL->convertFromOctal(decimal)
                 DECEMAL->convertFromDecemal(decimal)
                 BINARY->convertFromBinary(decimal)
            }
        }

    private fun convertFromBinary(decimal: String) {
        TODO("Not yet implemented")
    }

    private fun convertFromDecemal(decimal: String) {
        TODO("Not yet implemented")
    }

    private fun convertFromOctal(decimal: String) {
        TODO("Not yet implemented")
    }

    private fun convertFromHexa(decimal: String) {
        TODO("Not yet implemented")
    }


    }
