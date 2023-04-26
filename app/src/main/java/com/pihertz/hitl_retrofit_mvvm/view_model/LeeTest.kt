package com.pihertz.hitl_retrofit_mvvm.view_model

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LeeTest {


    @Singleton
    @Provides
    fun  getLee() {
        Log.d("lee","leee pl")
    }
}