package com.example.desarrolllador1.startup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     /*   btnGetAge.setOnClickListener{

            val yearOfBirth:Int = inputYear.text.toString().toInt()
            var currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = currentYear - yearOfBirth
            lblYear.text = "Actualmente tienes $myAge años de edad"
        }*/
    }

    fun btnFnEvent(view:View){

        val userDOB:String = inputYear.text.toString()
        if(userDOB.toInt()==0){
            lblYear.text = "Año invalido"
            return
        }
        var year:Int= Calendar.getInstance().get(Calendar.YEAR)
        val myAge = year - userDOB.toInt()
        val avg = myAge/userDOB.toInt()
        lblYear.text = "tienes "+ myAge
    }
}
