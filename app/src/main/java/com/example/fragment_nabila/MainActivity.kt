package com.example.fragment_nabila

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne = findViewById<Button>(R.id.fragmentOne)
        val fragmentTwo = findViewById<Button>(R.id.fragmentTwo)
        val fragmentThree = findViewById<Button>(R.id.fragmentThree)
        val fragmentFour = findViewById<Button>(R.id.fragmentFour)
        val fragmentFive = findViewById<Button>(R.id.fragmentFive)

        fragmentOne.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlueFragment())
            fragmentTransaction.commit()
        }
        fragmentTwo.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BusanaFragment())
            fragmentTransaction.commit()
        }
        fragmentThree.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, KulinerFragment())
            fragmentTransaction.commit()
        }
        fragmentFour.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, RedFragment())
            fragmentTransaction.commit()
        }
        fragmentFive.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, TOFragment())
            fragmentTransaction.commit()
        }

    }
}