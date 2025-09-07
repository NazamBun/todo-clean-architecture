package com.nazam.todo_clean_architecture

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
/**
 * Classe Application principale.
 * Point d'entrée pour Hilt (injection de dépendances).
 */
@HiltAndroidApp
class TodoApplication : Application()
