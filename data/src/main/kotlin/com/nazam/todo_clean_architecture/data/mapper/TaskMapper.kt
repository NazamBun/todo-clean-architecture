package com.nazam.todo_clean_architecture.data.mapper

import com.nazam.todo_clean_architecture.data.local.entity.TaskEntity
import com.nazam.todo_clean_architecture.domain.model.Task

/**
 * Mappeurs entre la couche Data (Room) et la couche Domain.
 * Extensions = code lisible et testable.
 */
fun TaskEntity.toDomain(): Task =
    Task(
        id = id,
        title = title,
        description = description,
        priority = priority,
        isDone = isDone,
        createdAt = createdAt
    )

fun Task.toEntity(): TaskEntity =
    TaskEntity(
        id = id,
        title = title,
        description = description,
        priority = priority,
        isDone = isDone,
        createdAt = createdAt
    )

// Helpers pour listes (utile avec DAO qui renvoie List<TaskEntity>)
fun List<TaskEntity>.toDomain(): List<Task> = map { it.toDomain() }
fun List<Task>.toEntity(): List<TaskEntity> = map { it.toEntity() }