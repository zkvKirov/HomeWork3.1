package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val post = Post(
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
        val expectedID = Post(
            id = 1,
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
        val actualID = service.add(post)
        assertEquals(expectedID, actualID)
    }

    @Test
    fun update_if() {
        val service = WallService()
        service.add(Post(
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
        ))
        service.add(Post(
            id = 0,
            ownerID = 1,
            fromID = 2,
            createdBy = 3,
            date = 29032022,
            text = "Действительно очень нудное ДЗ",
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
        ))
        service.add(Post(
            id = 0,
            ownerID = 1,
            fromID = 2,
            createdBy = 3,
            date = 29032022,
            text = "Да уж...",
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
        ))
        val update = Post(
            id = 3,
            ownerID = 1,
            fromID = 222,
            createdBy = 322,
            date = 29032022,
            text = "пост заменён",
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

        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun update_else() {
        val service = WallService()
        service.add(Post(
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
        ))
        service.add(Post(
            id = 0,
            ownerID = 1,
            fromID = 2,
            createdBy = 3,
            date = 29032022,
            text = "Действительно очень нудное ДЗ",
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
        ))
        service.add(Post(
            id = 0,
            ownerID = 1,
            fromID = 2,
            createdBy = 3,
            date = 29032022,
            text = "Да уж...",
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
        ))
        val update = Post(
            id = 100,
            ownerID = 1,
            fromID = 2,
            createdBy = 3,
            date = 29032022,
            text = "update",
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

        val result = service.update(update)
        assertFalse(result)
    }
}