package com.pihertz.hitl_retrofit_mvvm.repo

import androidx.lifecycle.LiveData
import com.pihertz.hitl_retrofit_mvvm.service.AllApiEndPoints
import com.pihertz.hitl_retrofit_mvvm.vos.PostVo
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import javax.inject.Inject


class PostRepo @Inject constructor(private  val allApiEndPoints: AllApiEndPoints) {


 suspend   fun getAllPost() : LiveData<List<PostVo>> = allApiEndPoints.getAllPosts()
}