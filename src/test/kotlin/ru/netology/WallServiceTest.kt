package ru.netology

import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun prepare() {

    }

    @After
    fun clearPosts () {
        WallService.removeAll()
    }

    @Test
    fun add() {
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
        val actualID = WallService.add(post)
        assertEquals(expectedID, actualID)
    }

    @Test
    fun update_if() {
        WallService.add(Post(
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
        WallService.add(Post(
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
        WallService.add(Post(
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
        val updatedPost = Post(
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

        val result = WallService.update(updatedPost)
        assertTrue(result)
    }

    @Test
    fun update_else() {
        WallService.add(Post(
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
        WallService.add(Post(
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
        WallService.add(Post(
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
        val updatedPost = Post(
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

        val result = WallService.update(updatedPost)
        assertFalse(result)
    }
}