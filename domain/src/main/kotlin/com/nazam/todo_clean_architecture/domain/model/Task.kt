package com.nazam.todo_clean_architecture.domain.model

import java.time.LocalDateTime

data class Task(
    val id: Int = 0,
    val title: String,
    val description: String? = null,
    val priority: Priority = Priority.MEDIUM,
    val isDone: Boolean = false,
    val createdAt: LocalDateTime = LocalDateTime.now()
)

enum class Priority {
    LOW,
    MEDIUM,
    HIGH
}
