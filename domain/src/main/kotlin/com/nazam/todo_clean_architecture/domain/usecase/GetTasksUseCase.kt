package com.nazam.todo_clean_architecture.domain.usecase

import com.nazam.todo_clean_architecture.domain.model.Task
import com.nazam.todo_clean_architecture.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow

class GetTasksUseCase(
    private val taskRepository: TaskRepository
) {
    operator fun invoke(): Flow<List<Task>> {
        return taskRepository.observeTasks()
    }
}