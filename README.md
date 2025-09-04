# 📝 To-Do App — Clean Architecture & MVVM

An Android **To-Do List application** built with **Kotlin** and modern Android tools.  
This project is designed to be **clean, simple, and easy to understand**, even for beginners.

## ✨ Features
- Add, edit, and delete tasks
- Mark tasks as done / not done
- Filter: All, Done, Favorites
- Search tasks by title
- Sort by priority or due date
- UI states: Loading / Empty / Success / Error

## 📂 Architecture (Clean Architecture + MVVM)
The app follows **Clean Architecture** to keep the code organized and easy to maintain:

- **domain/** → business logic
    - `model/` → Task model (data structure)
    - `repository/` → repository interface (contract)
    - `usecase/` → use cases (one action = one class)

- **data/** → data layer (Room, mapping, repo implementation)
    - `entity/`, `dao/`, `database/` → Room database
    - `mapper/` → convert between Entity ↔ Model
    - `repository/impl/` → real repository implementation

- **presentation/** → UI layer (Jetpack Compose + ViewModel)
    - `home/`, `edit/`, `detail/` → screens
    - `state/` → UiState (Loading, Empty, Success, Error)

- **core/** → shared tools
    - `common/` → Result, dispatchers, utils
    - `designsystem/` → theme (colors, typography, reusable UI components)
    - `testing/` → fake repositories and helpers for tests

## 🛠️ Tech Stack
- **Kotlin** (language)
- **Jetpack Compose** (UI toolkit)
- **MVVM + Clean Architecture** (architecture)
- **Room** (local database)
- **Hilt** (dependency injection)
- **Coroutines + Flow** (async programming)
- **JUnit & Compose UI tests** (testing)

## 🚀 Goals
- Write **clean, maintainable, and testable code**
- Follow **SOLID principles**
- Provide a **beginner-friendly example** of building an Android app with modern tools
- Create a solid foundation for any professional Android app  