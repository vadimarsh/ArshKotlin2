package ru.netology.profile

import ru.netology.profile.model.Profile

fun main() {
    val user1 = Profile(0, "arsh", "Vadim", "Arshinsky")
    println(user1.fullname)
}