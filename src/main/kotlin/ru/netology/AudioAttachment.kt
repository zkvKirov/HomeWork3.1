package ru.netology

data class AudioAttachment (
    override val type: String = "audio",
    val audio: Audio = Audio(234, 56756, "Кино", "Группа крови", 85,
        "url", 345, 678, 1991)
    ) : Attachment() {
}

class Audio(
    val id: Int,
    val ownerID: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val albumID: Int,
    val genreID: Int,
    val date: Int
    ) {

}