package com.bignerdranch.android.mywebviewaplication.FactoryMethod.Window



open class PlasticFrameWindow : Window {
    override fun open() {
        println("Открыть пластиковое окно")
    }
    override fun toString(): String {
        return "Пластиковое окно"
    }
}