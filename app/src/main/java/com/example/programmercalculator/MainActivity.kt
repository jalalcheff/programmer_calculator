package com.example.programmercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    var inputNumberValues=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myConverter=Converter(Constants.DECEMAL,"10")
        Log.i("myResults",myConverter.checkSelectionSystemType().toString())
    }

    fun onClickEqualButton(view: View)
    {
        val whatChipSelected=findViewById<ChipGroup>(R.id.selectedChipGroup).checkedChipId
        val selectedChip=findViewById<Chip>(whatChipSelected)
        val hexa=findViewById<TextView>(R.id.hexaResult)
        val decemal=findViewById<TextView>(R.id.decemalResult)
        val octal=findViewById<TextView>(R.id.octalResult)
        val binary=findViewById<TextView>(R.id.binaryResult)
        val myConverter=Converter(Constants.DECEMAL,inputNumberValues)
        hexa.text=myConverter.checkSelectionSystemType().hexa
       // var myConverter:Converter?=null
        Log.i("mrmr",hexa.text.toString())
     /*   when(selectedChip.text)
        {
         Constants.HEXA->{
              myConverter=Converter(Constants.HEXA,inputNumberValues)
         }
            Constants.DECEMAL->{
                myConverter=Converter(Constants.DECEMAL,inputNumberValues)
            }
            Constants.OCTAL->{
                myConverter=Converter(Constants.OCTAL,inputNumberValues)

            }
            Constants.BINARY->{
                myConverter=Converter(Constants.BINARY,inputNumberValues)
            }
        }

        hexa.text= myConverter?.checkSelectionSystemType()?.hexa
        decemal.text= myConverter?.checkSelectionSystemType()?.decemal
        octal.text= myConverter?.checkSelectionSystemType()?.decemal
        binary.text= myConverter?.checkSelectionSystemType()?.binary*/

    }

    fun onClickNumber(view: View)
    {
        inputNumberValues+=(view as TextView).text.toString()
        var inputText=findViewById<TextView>(R.id.inputNumber)
        inputText.text=inputNumberValues

    }

}