package com.example.androidactivitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()
        Log.d("MainActivity2", "onCreate Called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        button2.setOnClickListener {
//            val builder = AlertDialog.Builder(this)
//            builder.setTitle("Alert")
//            builder.setPositiveButton(
//                R.string.back
//            ) { _, _ ->
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//            }
//            builder.setNegativeButton(R.string.no
//            ) {
//
//            }
//        }

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart", Toast.LENGTH_SHORT).show()
        Log.d("MainActivity2", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_SHORT).show()
        Log.d("MainActivity2", "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_SHORT).show()
        Log.d("MainActivity2", "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_SHORT).show()
        Log.d("MainActivity2", "onStop Called")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_SHORT).show()
        Log.d("MainActivity2", "onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_SHORT).show()
        Log.d("MainActivity2", "onDestroy Called")
    }

}