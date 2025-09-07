package com.nazam.todo_clean_architecture.data.local.converter

import androidx.room.TypeConverter
import com.nazam.todo_clean_architecture.domain.model.Priority

/**
 * Converter Room pour stocker et relire l'enum Priority.
 */
class PriorityConverter {

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name // Ex: Priority.LOW -> "LOW"
    }

    @TypeConverter
    fun toPriority(value: String): Priority {
        return Priority.valueOf(value) // Ex: "LOW" -> Priority.LOW
    }
}