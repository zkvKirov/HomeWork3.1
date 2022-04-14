package ru.netology

data class GraffitiAttachment (
    override val type: String = "graffiti",
    val graffiti: Graffiti
) : Attachment ()

data class Graffiti (
    val id: Int,
    val ownerID: Int,
    val url: String,
    val width: Int,
    val height: Int
)