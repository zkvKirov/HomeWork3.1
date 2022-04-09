package ru.netology

data class FileAttachment (
    override val type: String = "file",
    val file: File = File (111, "Документ", 222, 540, "ext", "url", 6042022, 0)
    ) : Attachment () {
}

class File (
    val id: Int,
    val title: String,
    val ownerID: Int,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int,
    val type: Int
    ) {
}