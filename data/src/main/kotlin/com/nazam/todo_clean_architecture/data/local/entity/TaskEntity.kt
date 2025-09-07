package com.nazam.todo_clean_architecture.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nazam.todo_clean_architecture.domain.model.Priority
import java.time.LocalDateTime
/**
 * Entité Room pour représenter une tâche dans la base de données.
 */
@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String? = null,
    val priority: Priority = Priority.MEDIUM,
    val isDone: Boolean = false,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
