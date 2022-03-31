package ru.netology

class PostSource (
    val type: String, // Возможные значения: vk, widgets, api, rss, sms
    val platform: String, // Возможные значения: android, iphone, wphone
    val data: String,
    /*
    Тип действия (только для type = vk или widget).
    Возможные значения:
    - profile_activity — изменение статуса под именем пользователя (для type = vk);
    - profile_photo — изменение профильной фотографии пользователя (для type = vk);
    - comments — виджет комментариев (для type = widget);
    - like — виджет «Мне нравится» (для type = widget);
    - poll — виджет опросов (для type = widget).
     */
    val url: String
        ) {

}