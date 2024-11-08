package com.example.simple_adapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val infos = listOf(
            mapOf("name" to "Nfs", "prix" to "9400DH"),
            mapOf("name" to "itel", "prix" to "10000DH"),
            mapOf("name" to "Cod", "prix" to "6000DH"),
            mapOf("name" to "AcII", "prix" to "1000DH")
        )
        val key = arrayOf("name", "prix")

        val v  = intArrayOf(R.id.name, R.id.prix)
        val adapter = SimpleAdapter(this, infos, R.layout.list_items, key, v)
        val listView: ListView = findViewById(R.id.list_View)
        listView.adapter = adapter


    }
}