package com.picker.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var progress:ProgressBar
    lateinit var loading:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progress = findViewById<ProgressBar>(R.id.progressBar)
        loading = findViewById<TextView>(R.id.loading)
    }

    fun onStart(view: View) {
        progress.visibility = ProgressBar.VISIBLE
        loading.visibility = TextView.VISIBLE
    }

    fun onStop(view: View) {
        progress.visibility = ProgressBar.INVISIBLE
        loading.visibility = TextView.INVISIBLE
    }
}