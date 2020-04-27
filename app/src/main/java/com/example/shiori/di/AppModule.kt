package com.example.shiori.di

import android.content.Context
import com.example.shiori.ShioriApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

object AppModule {
    @Module
    internal object AppModule {
        @Singleton
        @Provides
        @JvmStatic
        fun provideContext(application: ShioriApplication): Context = application
    }

}