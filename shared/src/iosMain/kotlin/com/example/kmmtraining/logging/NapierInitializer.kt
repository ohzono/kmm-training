package com.example.kmmtraining.logging

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

actual object NapierInitializer {
    actual fun initialize() {
        Napier.base(DebugAntilog())
    }
}