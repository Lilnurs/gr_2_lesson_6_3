package com.example.gr_2_lesson_6_2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    private  lateinit var textGmail: EditText
    private lateinit var textPassword: EditText
    private lateinit var btn :Button
    private lateinit var enter : TextView
    private lateinit var registr:TextView
    private lateinit var forgot : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textGmail = findViewById(R.id.Gmail)
        textPassword =findViewById(R.id.password)
        enter =  findViewById(R.id.tv_enter)
        btn = findViewById(R.id.button)
        registr = findViewById(R.id.Vxod)
        forgot = findViewById(R.id.fogot_password)
        textGmail.addTextChangedListener {
            if (textGmail.text.toString().isEmpty()){
                btn.setBackgroundColor(ContextCompat.getColor(this,R.color.gray))
            }
            else {
                btn.setBackgroundColor(ContextCompat.getColor(this,R.color.orange))
            }
        }
        textPassword.addTextChangedListener {
            if (textPassword.text.toString().isEmpty()){
                btn.setBackgroundColor(ContextCompat.getColor(this,R.color.gray))
            }
            else {
                btn.setBackgroundColor(ContextCompat.getColor(this,R.color.orange))
            }
        }
        btn.setOnClickListener {
            if (textGmail.text.toString().equals("admin@gmail.com")&& textPassword.text.toString().equals("admin")){
                btn.visibility = View.GONE
                enter.visibility =  View.GONE
                textGmail.visibility = View.GONE
                textPassword.visibility = View.GONE
                registr.visibility = View.GONE
                forgot.visibility = View.GONE
             Toast.makeText(this,"Вы успешно зарегались!",Toast.LENGTH_SHORT).show()}
            else{
                Toast.makeText(this,"Неверная почта или пароль",Toast.LENGTH_SHORT).show()
            }


        }



    }
}