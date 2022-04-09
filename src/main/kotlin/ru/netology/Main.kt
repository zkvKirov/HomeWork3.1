package ru.netology

fun main() {
    val post1 = Post(
        id = 0,
        ownerID = 1,
        fromID = 2,
        createdBy = 3,
        date = 29032022,
        text = "Очень нудное ДЗ",
        replyOwnerID = 4,
        replyPostID = 5,
        friendsOnly = true,
        comments = null,
        copyright = null,
        likes = null,
        reports = null,
        views = null,
        postType = "post",
        singerID = 10,
        canPin = true,
        canDelete = false,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = true,
        donut = null,
        postponedID = 12
    )

    println(WallService.add(post1))

}
