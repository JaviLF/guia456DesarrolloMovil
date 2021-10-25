package edu.bo.ucb.negocios

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val btnService = findViewById(R.id.service_button) as Button
        val btnportfolio = findViewById(R.id.portfolio_button) as Button
        val btnAbout = findViewById(R.id.about_button) as Button
        val btnContact = findViewById(R.id.contact_button) as Button
        val btnSocial = findViewById(R.id.social_button) as Button
        val txtButton = findViewById(R.id.button_name_text) as TextView


        btnService.setOnClickListener {
            txtButton.text=btnService.text
        }
        btnportfolio.setOnClickListener({
            txtButton.text=btnportfolio.text
        })
        btnAbout.setOnClickListener ({
            txtButton.text=btnAbout.text
        })
        btnContact.setOnClickListener ({
            txtButton.text=btnContact.text
        })
        btnSocial.setOnClickListener ({
            txtButton.text=btnSocial.text
        })*/

    }

    fun selectedButton(view: View){
        if(view.id === R.id.service_button){
            Toast.makeText(view.context,"Opcion de Servicios",Toast.LENGTH_LONG).show()
            val intent = Intent(this, ServiceActivity::class.java).apply {  }
            startActivity(intent)
        }else{
            Toast.makeText(view.context,"Evento no Definido",Toast.LENGTH_LONG).show()
        }
    }
}