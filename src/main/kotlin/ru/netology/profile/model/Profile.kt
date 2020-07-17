package ru.netology.profile.model

import javax.xml.soap.Name

class Profile(
    val id: Int,
    val login: String,
    val name: String,
    val lastname: String
) {
    val avatarURL: String = "default.png"
    val fullname
        get() = name + " " + lastname

}