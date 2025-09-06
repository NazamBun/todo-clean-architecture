package com.nazam.todo_clean_architecture.domain.repository

import com.nazam.todo_clean_architecture.domain.model.Task
import kotlinx.coroutines.flow.Flow
/**
 * Contrat du dépôt de tâches.
 * Le domain ne connaît pas Room ni Android.
 */
interface TaskRepository {

    /** Flux de toutes les tâches (réagit aux changements). */
    fun observeTasks(): Flow<List<Task>>

    /** Récupère une tâche précise ou null si absente. */
    suspend fun getById(id: Int): Task?

    /** Ajoute une nouvelle tâche et retourne son id. */
    suspend fun add(task: Task): Int

    /** Met à jour une tâche existante. */
    suspend fun update(task: Task)

    /** Supprime une tâche par id. */
    suspend fun delete(id: Int)

    /** Recherche par titre (simplifié). */
    fun search(query: String): Flow<List<Task>>
}