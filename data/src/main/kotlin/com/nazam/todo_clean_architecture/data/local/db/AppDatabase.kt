package com.nazam.todo_clean_architecture.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.nazam.todo_clean_architecture.data.local.converter.DateTimeConverter
import com.nazam.todo_clean_architecture.data.local.converter.PriorityConverter
import com.nazam.todo_clean_architecture.data.local.dao.TaskDao
import com.nazam.todo_clean_architecture.data.local.entity.TaskEntity

@Database(
    entities = [TaskEntity::class],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    PriorityConverter::class,
    DateTimeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}