package com.pihertz.hitl_retrofit_mvvm.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.pihertz.hitl_retrofit_mvvm.repo.PostRepo
import com.pihertz.hitl_retrofit_mvvm.vos.PostVo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(private  val  postRepo: PostRepo) : ViewModel() {


   lateinit var postList : LiveData<List<PostVo>>
   fun getAllPost() {
      CoroutineScope(IO) .launch {
         postList = postRepo.getAllPost()
      }
   }
}