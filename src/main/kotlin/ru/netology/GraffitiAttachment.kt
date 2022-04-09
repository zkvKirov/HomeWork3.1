package ru.netology

class GraffitiAttachment (
    override val type: String = "graffiti",
    val graffiti: Graffiti = Graffiti(777, 999, "url", 720, 540)
    ) : Attachment () {
}

class Graffiti (
    val id: Int,
    val ownerID: Int,
    val url: String,
    val width: Int,
    val height: Int
    ) {
}