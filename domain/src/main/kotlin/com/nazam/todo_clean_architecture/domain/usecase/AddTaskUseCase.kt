package com.nazam.todo_clean_architecture.domain.usecase

import com.nazam.todo_clean_architecture.domain.model.Task
import com.nazam.todo_clean_architecture.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow

class AddTaskUseCase (
    private val taskRepository: TaskRepository
) {
    suspend operator fun invoke(task: Task): Long {
        return taskRepository.add(task)
    }
}
