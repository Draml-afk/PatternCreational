package com.bignerdranch.android.mywebviewaplication.FactoryMethod.Window


open class MetalFrameWidow : Window {
    override fun open() {
        println("Открыть металическое окно")
    }
    override fun toString(): String {
        return "Металлическое окно"
    }

}