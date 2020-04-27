package com.example.shiori.di

import androidx.room.Room
import com.example.shiori.ShioriApplication
import com.example.shiori.db.ShioriDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object RoomModule {
    @Singleton
    @Provides
    @JvmStatic
    fun provideRoomDatabase(application: ShioriApplication): ShioriDatabase =
        Room.databaseBuilder(application, ShioriDatabase::class.java, "shiori-db")
            .build()

// TODO: DBが決まり次第追加していく

}