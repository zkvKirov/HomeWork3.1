package ru.netology

class Geo (
        val type: String,
        val coordinates: String,
        val place: Place
        ) {
}

class Place (
        val id: Int,
        val title: String,
        val latitude: Int, // Географическая широта, в градусах
        val longitude: Int, // Географическая долгота, в градусах
        val created: Int, // Дата создания места в Unixtime
        val icon: String, // URL изображения
        val checkins: Int,
        val updated: Int, // Дата обновления места в Unixtime
        val type: Int,
        val country: Int, // Идентификатор страны
        val city: Int, // Идентификатор города
        val address: String
        )