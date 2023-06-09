package com.example.challengechapterenam.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.challengechapterenam.data.local.dao.FavoriteDao
import com.example.challengechapterenam.data.local.entity.FavoriteEntity


@Database(entities = [FavoriteEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun favoriteDao(): FavoriteDao
}