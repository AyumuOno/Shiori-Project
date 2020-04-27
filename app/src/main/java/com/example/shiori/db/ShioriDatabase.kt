package com.example.shiori.db

import androidx.room.Database
import androidx.room.RoomDatabase

class ShioriDatabase {
    @Database(
        entities = [],
        version = 1
    )
    abstract class CocoonDatabase : RoomDatabase() {}
}