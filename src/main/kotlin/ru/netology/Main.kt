package ru.netology

fun main() {
    val post1 = Post(0,1,2, 3, 29032022, "Очень нудное ДЗ", 4,
         5, true, null, null, null, null, null, "post",
         null, null, null, 10, null,true, false,
        true, true, false, true, null, 12
    )

    println(WallService.add(post1))

    val comment1 = Comment (0,123, 0, 0, "комментарий просто так, такого поста нет",
        66, null, 77, 88)
    val comment2 = Comment (0,123, 1, 0, "такой пост есть, комментарий напечатается",
        66, null, 77, 88)

    try {
        WallService.createComment(comment1)
    } catch (e: PostNotFoundException) {
        println(e.message)
        println("Поймали ошибку \"PostNotFoundException\" ")
    }

    try {
        WallService.createComment(comment2)
    } catch (e: PostNotFoundException) {
        println(e.message)
        println("Поймали ошибку \"PostNotFoundException\" ")
    }
}
