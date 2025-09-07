package com.nazam.todo_clean_architecture.data.local.converter

import androidx.room.TypeConverter
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset

/**
 * Convertit LocalDateTime <-> Long (epoch millis) pour Room.
 * On utilise l'UTC pour éviter les surprises de fuseau horaire.
 */
class DateTimeConverter {

    @TypeConverter
    fun fromLocalDateTime(value: LocalDateTime?): Long? {
        return value?.toInstant(ZoneOffset.UTC)?.toEpochMilli()
    }

    @TypeConverter
    fun toLocalDateTime(value: Long?): LocalDateTime? {
        return value?.let { Instant.ofEpochMilli(it).atOffset(ZoneOffset.UTC).toLocalDateTime() }
    }
}
