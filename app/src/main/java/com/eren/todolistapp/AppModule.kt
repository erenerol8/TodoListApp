package com.eren.todolistapp

import android.app.Application
import androidx.room.Room.databaseBuilder
import com.eren.todolistapp.data.TodoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase {
        return databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()

    }
}