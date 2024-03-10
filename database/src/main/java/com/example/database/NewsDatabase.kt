package com.example.database

import android.annotation.SuppressLint
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.database.dao.ArticleDao
import com.example.database.models.ArticleDBO


@Database(entities = [ArticleDBO::class], version = 1)
abstract class NewsDatabase : RoomDatabase() {
    abstract fun articlesDao(): ArticleDao


    @SuppressLint("NotConstructor")
    fun NewsDatabase(applicationContext: Context): NewsDatabase{
        val db = Room.databaseBuilder(
           checkNotNull(applicationContext.applicationContext),
            NewsDatabase::class.java, "news").build()
        return db
    }


}