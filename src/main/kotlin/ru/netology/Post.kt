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
    val reports: Reports?,
    val views: Views?,
    val postType: String, // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    val singerID: Int,
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

class Comments (
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
        )

class Copyright (
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)

class Likes (
    val count: Int,
    val userLikes: Boolean,
    val canLikes: Boolean,
    val canPublish: Boolean,
)

class Reports (
    val count: Int,
    val userReposted: Boolean
)

class Views (
    val count: Int
        )

class Donut (
    val isDonut: Boolean = true,
    val paidDuration: Int,
    val placeholder: Placeholder,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

class Placeholder