package edu.bo.ucb.negocios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
import android.view.View
import androidx.appcompat.widget.Toolbar
//import kotlinx.android.synthetic.main.toolbar.*

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        supportActionBar.let {


            it?.setDisplayHomeAsUpEnabled(true)
            it?.setDisplayShowHomeEnabled(true)
            /*val toolbar = findViewById(R.id.toolbar) as Toolbar
            setSupportActionBar(toolbar)*/
        }
        //supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        //supportActionBar!!.setDisplayShowHomeEnabled(true)
    }
}