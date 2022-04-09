package ru.netology

data class VideoAttachment (
    override val type: String = "video",
    val video: Video = Video(123, 456, "Война", "Кино про войну", 90, null,
        1998, 6042022, 55, 0, false, true, 720, 436)
    ) : Attachment() {
}

class Video(
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
        ) {
}

object Image {
    val width: Int = 720
    val url: String = "url"
    val height: Int = 540
    val withPadding: Boolean = true
}