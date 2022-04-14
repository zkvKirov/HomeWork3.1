package ru.netology

data class PhotoAttachment (
    override val type: String = "photo",
    val photo: Photo
) : Attachment ()

data class Photo (
    val id: Int,
    val ownerID: Int,
    val albumID: String,
    val userID: Int,
    val text: String,
    val date: Int,
    val size: Array<Size>?,
    val width: Int,
    val height: Int
)

object Size {
    val type: String = "Тип"
    val url: String = "url"
    val width: Int = 720
    val height: Int = 540
}