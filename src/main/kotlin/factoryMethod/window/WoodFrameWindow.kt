package com.bignerdranch.android.mywebviewaplication.FactoryMethod.Window


open class WoodFrameWindow : Window {
    override fun open() {
        println("Открыть деребянное окно")
    }
    override fun toString(): String {
        return "Деревянное окно"
    }
}
