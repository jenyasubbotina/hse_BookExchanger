package com.jenyasubbotina.bookexchanger.android.di

import com.jenyasubbotina.bookexchanger.android.local.Storage
import com.jenyasubbotina.bookexchanger.android.network.NetworkService
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.bind
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration) = startKoin {
    appDeclaration()
    modules(
        commonModule()
    )
}

fun commonModule() = module {
    single {
        Storage(androidContext())
    }

    single<NetworkService> {
        NetworkService(
            storage = get()
        )
    }
}