package com.nazam.todo_clean_architecture.domain.usecase

import com.nazam.todo_clean_architecture.domain.model.Task
import com.nazam.todo_clean_architecture.domain.repository.TaskRepository

class UpdateTaskUseCase(
    private val taskRepository: TaskRepository
) {
    suspend operator fun invoke(task: Task) {
        taskRepository.update(task)
    }
}
