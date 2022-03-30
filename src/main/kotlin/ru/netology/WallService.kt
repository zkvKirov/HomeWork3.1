package ru.netology

class WallService {
    private var posts = emptyArray<Post>()
    private var id = 0

    fun add(post: Post): Post {
        posts += post
        id ++
        post.id = id
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (p in posts) {
            if (post.id == p.id) {
                val index = posts.indexOf(p)
                posts[index] = post.copy(
                    fromID = post.fromID,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerID = post.replyOwnerID,
                    replyPostID = post.replyPostID,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reports = post.reports,
                    views = post.views,
                    postType = post.postType,
                    singerID = post.singerID,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    donut = post.donut,
                    postponedID = post.postponedID
                )
                return true
            }
            continue
        }
        return false
    }
}