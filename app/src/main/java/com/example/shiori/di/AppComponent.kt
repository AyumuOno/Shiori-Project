package com.example.shiori.di

import com.example.shiori.ShioriApplication
import com.example.shiori.di.activitymodule.*
//import com.example.shiori.api.ShioriApi
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        RoomModule::class
//        ApiComponentModule::class,
//        RepositoryModule::class,
//
    ]
)
interface AppComponent : AndroidInjector<ShioriApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: ShioriApplication): AppComponent
    }

//    fun cocoonApi(): CocoonApi

    override fun inject(application: ShioriApplication)
}
