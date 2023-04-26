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
object ApiService {


    @Provides
    fun provideBaseUrl () = Constants.BASE_URL

    @Provides
    @Singleton
    fun provideRetrofit(BASE_URL : String) : AllApiEndPoints =  Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AllApiEndPoints::class.java)




}