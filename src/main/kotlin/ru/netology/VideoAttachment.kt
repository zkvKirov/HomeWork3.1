package ru.netology

data class VideoAttachment (
    override val type: String = "video",
    val video: Video
) : Attachment()

data class Video(
    val id: Int,
    val ownerID: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val image: Array<Image>?,
    val date: Int,
    val addingDate: Int,
    val views: Int,
    val comments: Int,
    val canAdd: Boolean,
    val isPrivate: Boolean = true,
    val width: Int,
    val height: Int
)

object Image {
    val width: Int = 720
    val url: String = "url"
    val height: Int = 540
    val withPadding: Boolean = true
}