package ru.netology

data class Comment (
    val ownerID: Int,
    val postID: Int,
    val fromGroup: Int = 0,
    val message: String,
    val replyToComment: Int,
    val attachments: List<String>?,
    val stickerID: Int,
    val guid: Int
        ) {
}