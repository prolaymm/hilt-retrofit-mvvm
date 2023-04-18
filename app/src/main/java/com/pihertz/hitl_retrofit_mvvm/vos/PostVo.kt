package com.pihertz.hitl_retrofit_mvvm.vos

import com.google.gson.annotations.SerializedName


data class PostVo (
    @SerializedName("userId")
    val userId: Long,
    @SerializedName("id")
    val id: Long,
    @SerializedName("title")
    val title: String,
    @SerializedName("body")
    val body: String
)

