package com.jenyasubbotina.bookexchanger.android

import android.app.Application
import com.jenyasubbotina.bookexchanger.android.di.initKoin
import org.koin.android.ext.koin.androidContext

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@Application)
        }
    }
}