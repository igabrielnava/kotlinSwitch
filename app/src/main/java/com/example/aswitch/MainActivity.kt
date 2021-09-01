package com.example.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switch_id = findViewById<Switch>(R.id.switch_id)
        
        switch_id.setOnClickListener {
            if(switch_id.isChecked)
                Toast.makeText(this@MainActivity, "Encendido", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this@MainActivity, "Apagado", Toast.LENGTH_LONG).show()
        }
    }
}