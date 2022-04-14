package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var badComments = emptyArray<Comment>()
    private var originalID = 0
    private var originalCommentID = 0

    fun add(post: Post): Post {
        originalID ++
        val newPost = post.copy(id = originalID)
        posts += newPost
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (p in posts) {
            if (p.id == post.id) {
                val index = posts.indexOf(p)
                posts[index] = p.copy(
                    fromID = post.fromID,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerID = post.replyOwnerID,
                    replyPostID = post.replyPostID,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    postSource = post.postSource,
                    geo = post.geo,
                    attachments = post.attachments,
                    singerID = post.singerID,
                    copyHistory = post.copyHistory,
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
        }
        return false
    }

    fun removeAll () {
        posts = emptyArray()
        comments = emptyArray()
        originalID = 0
        originalCommentID = 0
    }

    fun createComment(comment: Comment): Comment {
        for (post in posts) {
            if (post.id == comment.postID) {
                originalCommentID++
                val newComment = comment.copy(id = originalCommentID)
                comments += newComment
                println("Комментарий добавлен")
                return comments.last()
            }
        }
        throw PostNotFoundException ("Пост с id = ${comment.postID} не существует")
    }

    fun reportComment(ownerID: Int, id: Int, reason: Int): Boolean {
        for (comment in comments) {
            if (comment.id == id) {
                val results: String = when (reason) {
                    0 -> "спам"
                    1 -> "детская порнография"
                    2 -> "экстремизм"
                    3 -> "насилие"
                    4 -> "пропаганда наркотиков"
                    5 -> "материал для взрослых"
                    6 -> "оскорбление"
                    8 -> "призывы к суициду"
                    else -> {throw ReasonNotFoundException("Причина введена не верно")}
                }
                badComments += comment
                return true
            }
        }
        throw CommentNotFoundException ("Комментария с id = $id не существует")
    }
}