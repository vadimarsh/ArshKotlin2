package ru.netology.hiearchy

import ru.netology.hiearchy.view.TextView
import ru.netology.hiearchy.view.ViewGroup
import ru.netology.hiearchy.widget.Button

fun main() {
    val main = ViewGroup()
    val content = ViewGroup()
    main.addView(content)
    val readMore = Button("Read more")
    content.addView(readMore)
    readMore.click()

    val textView = TextView("Some Text")
    textView.click()
    println(textView.text)
    textView.text = "Something bad happened"
    println(textView.text)
    val button = Button("Click me")
    button.click()
    println(button.text)
    button.text = "Don't click me"
    println(button.text)
}