package ru.netology

data class FileAttachment (
    override val type: String = "file",
    val file: File
) : Attachment ()

data class File (
    val id: Int,
    val title: String,
    val ownerID: Int,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int,
    val type: Int
)