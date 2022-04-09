package ru.netology

data class Post(
    val id: Int = 0,
    val ownerID: Int = 0,
    val fromID: Int,
    val createdBy: Int,
    val date: Int = 0,
    val text: String,
    val replyOwnerID: Int,
    val replyPostID: Int,
    val friendsOnly: Boolean = true,
    val comments: Comments?,
    val copyright: Copyright?,
    val likes: Likes?,
    val reposts: Reposts?,
    val views: Views?,
    val postType: String, // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    val postSource: PostSource?,
    val geo: Geo?,
    val attachments: Array<Attachment>?,
    val singerID: Int,
    val copyHistory: Array<String>?,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean,
    val isFavorite: Boolean = true,
    val donut: Donut?,
    val postponedID: Int
        ) {
}

object Comments {
    val count: Int = 0
    val canPost: Boolean = true
    val groupsCanPost: Boolean = true
    val canClose: Boolean = true
    val canOpen: Boolean = true
}

object Copyright {
    val id: Int = 0
    val link: String = ""
    val name: String = ""
    val type: String = ""
}

object Likes {
    val count: Int = 0
    val userLikes: Boolean = true
    val canLikes: Boolean = true
    val canPublish: Boolean = true
}

object Reposts {
    val count: Int = 0
    val userReposted: Boolean = true
}

object Views {
    val count: Int = 0
        }

object Donut {
    val isDonut: Boolean = true
    val paidDuration: Int = 0
    val placeholder: Placeholder? = null
    val canPublishFreeCopy: Boolean  = true
    val editMode: String = ""
}

class Placeholder