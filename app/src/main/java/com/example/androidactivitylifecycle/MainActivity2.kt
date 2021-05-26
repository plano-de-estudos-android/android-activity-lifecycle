package com.example.androidactivitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.androidactivitylifecycle.R
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()
        Log.d("MainActivity2", "onCreate Called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button2.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Olá")
                .setPositiveButton(
                    "Voltar"
                ) { dialog, which ->
                }
                .setNegativeButton("Cancelar", null)
                .setCancelable(false)
                .show()
        }
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