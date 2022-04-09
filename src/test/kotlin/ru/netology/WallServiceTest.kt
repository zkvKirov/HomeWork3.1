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
            0,1,2, 3, 29032022, "Очень нудное ДЗ", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        )
        val expectedID = Post(
            1,1,2, 3, 29032022, "Очень нудное ДЗ", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        )
        val actualID = WallService.add(post)
        assertEquals(expectedID, actualID)
    }

    @Test
    fun update_if() {
        WallService.add(Post(
            0,1,2, 3, 29032022, "Очень нудное ДЗ", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        ))
        WallService.add(Post(
            0,1,2, 3, 29032022, "Действительно очень нудное ДЗ", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        ))
        WallService.add(Post(
            0,1,2, 3, 29032022, "Да уж...", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        ))
        val updatedPost = Post(
            3,111,222, 333, 29032022, "пост заменён", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        )

        val result = WallService.update(updatedPost)
        assertTrue(result)
    }

    @Test
    fun update_else() {
        WallService.add(Post(
            0,1,2, 3, 29032022, "Очень нудное ДЗ", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        ))
        WallService.add(Post(
            0,1,2, 3, 29032022, "Действительно очень нудное ДЗ", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        ))
        WallService.add(Post(
            0,1,2, 3, 29032022, "Да уж...", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        ))
        val updatedPost = Post(
            100,1,2, 3, 29032022, "update", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        )

        val result = WallService.update(updatedPost)
        assertFalse(result)
    }

    @Test
    fun createComment() {
        WallService.add(Post(
            0,1,2, 3, 29032022, "Очень нудное ДЗ", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        ))
        val comment = Comment (123, 1, 0, "такой пост есть, комментарий напечатается",
            66, null, 77, 88)
        val result = WallService.createComment(comment)
        assertEquals(comment, result)
    }

    @Test (expected = PostNotFoundException::class)
    fun noCreateComment() {
        WallService.add(Post(
            0,1,2, 3, 29032022, "Очень нудное ДЗ", 4,
            5, true, null, null, null, null, null, "post",
            null, null, null, 10, null,true, false,
            true, true, false, true, null, 12
        ))
        val comment = Comment (123, 0, 0, "комментарий просто так, такого поста нет",
            66, null, 77, 88)
        WallService.createComment(comment)
    }
}