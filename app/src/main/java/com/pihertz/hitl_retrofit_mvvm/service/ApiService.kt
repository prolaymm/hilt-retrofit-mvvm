package com.pihertz.hitl_retrofit_mvvm.service

import android.content.Context
import com.pihertz.hitl_retrofit_mvvm.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiService {


    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit {

        return  Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun getAllApiEndPoints(retrofit: Retrofit) : AllApiEndPoints {

        return  retrofit.create(AllApiEndPoints::class.java)
    }

}