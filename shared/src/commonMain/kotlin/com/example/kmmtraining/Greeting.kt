package com.example.kmmtraining

import io.github.aakira.napier.Napier

class Greeting {
    fun greeting(): String {
        Napier.d("Pieeer! from shared module.")
        return "Hello, ${Platform().platform}!"
    }
}