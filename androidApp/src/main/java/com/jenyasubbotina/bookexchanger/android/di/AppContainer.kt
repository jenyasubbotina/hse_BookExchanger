package com.jenyasubbotina.bookexchanger.android.di

import com.jenyasubbotina.bookexchanger.android.network.NetworkService
import com.jenyasubbotina.bookexchanger.android.repository.MainRepository

interface AppContainer {
    val networkService: NetworkService
    val repository: MainRepository
}