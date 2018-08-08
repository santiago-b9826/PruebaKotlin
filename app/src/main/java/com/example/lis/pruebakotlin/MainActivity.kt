package com.example.lis.pruebakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MotionEvent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), TextWatcher {

    private var editName: EditText? = null
    private var editAge: EditText? = null
    private var button: Button? = null
    private var name: String? = null
    private var age = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.editText_Name)
        editAge = findViewById(R.id.editText_Age)
        button = findViewById(R.id.button)

        editName?.addTextChangedListener(this)
        //editAge?.addTextChangedListener(this)
    }

    override fun afterTextChanged(p0: Editable?) {

    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        Toast.makeText(this, "Hola " + p0.toString(), Toast.LENGTH_SHORT).show()
    }
}
