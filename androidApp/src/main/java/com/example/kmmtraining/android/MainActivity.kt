package com.example.kmmtraining.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kmmtraining.Greeting
import android.widget.TextView
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
        if (BuildConfig.DEBUG) {
            Napier.base(DebugAntilog())
            Napier.i("This is not from shared module's Napier.")
        }
    }
}
