package com.example.kmmtraining.android

import android.app.Application
import com.example.kmmtraining.logging.NapierInitializer

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        NapierInitializer.initialize()
    }
}