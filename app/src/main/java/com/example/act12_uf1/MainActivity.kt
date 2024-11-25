package com.example.act12_uf1

import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggleScroll: ToggleButton = findViewById(R.id.toggleScroll)
        val horizontalScrollView: HorizontalScrollView = findViewById(R.id.horizontalScrollView)

        toggleScroll.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Mostrar líneas de scroll
                horizontalScrollView.isHorizontalScrollBarEnabled = true
            } else {
                // Ocultar líneas de scroll
                horizontalScrollView.isHorizontalScrollBarEnabled = false
            }
        }
    }
}
