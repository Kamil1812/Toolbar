package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            val login = findViewById<EditText>(R.id.editText_login).text.toString()
            val haslo = findViewById<EditText>(R.id.editText_haslo).text.toString()

            if (!login.isEmpty() && !haslo.isEmpty())
            {
                findViewById<TextView>(R.id.textView_error).text = ""

                if (login == "Kamil" && haslo == "Niewiadomski")
                {

                }
            }

            else
            {
                findViewById<TextView>(R.id.textView_error).text = "Podaj wszystkie dane!"
            }
        }
    }
}