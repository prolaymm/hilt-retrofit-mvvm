package com.pihertz.hitl_retrofit_mvvm.view_model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pihertz.hitl_retrofit_mvvm.repo.PostRepo
import com.pihertz.hitl_retrofit_mvvm.vos.PostVo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor() : ViewModel() {



   init {
       Log.d("vm", "view model working")
   }
   lateinit var postList : LiveData<List<PostVo>>
   fun getAllPost() {
      Log.d("dadadadavm", "view moddadael working")

   }
}