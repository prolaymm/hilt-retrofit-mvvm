package com.pihertz.hitl_retrofit_mvvm.service

import androidx.lifecycle.LiveData
import com.pihertz.hitl_retrofit_mvvm.vos.PostVo
import retrofit2.http.GET

interface AllApiEndPoints {

    @GET("posts")
    suspend fun  getAllPosts() : LiveData<List<PostVo>>
}