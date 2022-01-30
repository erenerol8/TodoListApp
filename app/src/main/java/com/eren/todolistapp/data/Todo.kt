package com.eren.todolistapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    var title : String,
    var description : String?,
    var isDone : Boolean?,
    @PrimaryKey val id : Int? = null
)
