package com.eren.todolistapp.data

import kotlinx.coroutines.flow.Flow

interface TodoRepository {

    suspend fun insertTodo(todo: Todo)


    suspend fun deleteTodo(todo: Todo)


    suspend fun getDataById(id: Int): Todo?


    fun getTodos(): Flow<List<Todo>>
}