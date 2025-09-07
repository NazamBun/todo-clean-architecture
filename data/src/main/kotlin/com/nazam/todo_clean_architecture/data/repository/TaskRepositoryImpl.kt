package com.nazam.todo_clean_architecture.data.repository

import com.nazam.todo_clean_architecture.data.local.dao.TaskDao
import com.nazam.todo_clean_architecture.data.mapper.toDomain
import com.nazam.todo_clean_architecture.data.mapper.toEntity
import com.nazam.todo_clean_architecture.domain.model.Task
import com.nazam.todo_clean_architecture.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TaskRepositoryImpl (
    private val dao: TaskDao
): TaskRepository {

    override fun observeTasks(): Flow<List<Task>> {
        return dao.observeAll().map { entities ->
            entities.toDomain()
        }
    }

    override suspend fun getById(id: Int): Task? {
        return dao.getById(id)?.toDomain()
    }

    override suspend fun add(task: Task): Long {
        return dao.insert(task.toEntity())
    }

    override suspend fun update(task: Task) {
        dao.update(task.toEntity())
    }

    override suspend fun delete(id: Int) {
        dao.deleteById(id)
    }

    override fun search(query: String): Flow<List<Task>> {
        return dao.search(query).map { entities ->
            entities.toDomain()
        }
    }
}