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
    var selectedChipText=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  val myConverter=Converter(Constants.DECEMAL,"10")
        //Log.i("myResults",myConverter.checkSelectionSystemType().toString())
    }

    fun onClickEqualButton(view: View)
    {
        val whatChipSelected=findViewById<ChipGroup>(R.id.selectedChipGroup).checkedChipId
        val selectedChip=findViewById<Chip>(whatChipSelected)
       // var myConverter:Converter?=null
        Log.i("mrmr","$selectedChipText : ${Constants.DECEMAL}")
        assignValues(Converter(Constants.DECEMAL,inputNumberValues))
        when(selectedChipText)
        {
         Constants.HEXA->{
              assignValues(Converter(Constants.HEXA,inputNumberValues))
         }
            Constants.DECEMAL->{
                Log.i("bsbs",Converter(Constants.DECEMAL,inputNumberValues).checkSelectionSystemType().hexa)
                assignValues(Converter(Constants.DECEMAL,inputNumberValues))
            }
            Constants.OCTAL->{
                assignValues(Converter(Constants.OCTAL,inputNumberValues))

            }
            Constants.BINARY->{
                assignValues(Converter(Constants.BINARY,inputNumberValues))
            }

        }


    }

    private fun assignValues(converter: Converter) {
        val hexa=findViewById<TextView>(R.id.hexaResult)
        val decemal=findViewById<TextView>(R.id.decemalResult)
        val octal=findViewById<TextView>(R.id.octalResult)
        val binary=findViewById<TextView>(R.id.binaryResult)
        hexa.text= converter.checkSelectionSystemType().hexa
        decemal.text= converter.checkSelectionSystemType().decemal
        octal.text= converter.checkSelectionSystemType().octal
        binary.text= converter.checkSelectionSystemType().binary
    }

    fun onClickNumber(view: View)
    {
        inputNumberValues+=(view as TextView).text.toString()
        var inputText=findViewById<TextView>(R.id.inputNumber)
        inputText.text=inputNumberValues

    }

    fun onSelectedChip(view: View){
      // if ((view as Chip).isChecked)
      selectedChipText=(view as Chip).text.toString()
        Log.i("frfr",(view as Chip).text.toString())
    }

}