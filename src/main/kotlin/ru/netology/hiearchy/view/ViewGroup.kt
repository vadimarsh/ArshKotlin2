package ru.netology.hiearchy.view

class ViewGroup : View() {

    private lateinit var view: View

    fun addView(v: View) {
        this.view = v
    }
}