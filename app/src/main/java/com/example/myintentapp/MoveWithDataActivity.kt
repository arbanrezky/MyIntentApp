package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_move_with_data.*

class MoveWithDataActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PERSON = "extra_person"
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataReceived: TextView = findViewById(R.id.tv_object_received)

        val person = intent.getParcelableArrayExtra(EXTRA_PERSON) as Person
        val text = "Name : ${person.name.toString()},\nEmail : ${person.email},\nAge : ${person.age},\nLocation : ${person.city}"
        tv_object_received.text = text
    }
}