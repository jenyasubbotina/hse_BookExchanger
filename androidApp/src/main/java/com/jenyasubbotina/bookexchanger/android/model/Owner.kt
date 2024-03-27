package com.jenyasubbotina.bookexchanger.android.model

import com.google.gson.annotations.SerializedName


data class Owner (

  @SerializedName("id"   ) var id   : Int?    = null,
  @SerializedName("name" ) var name : String? = null

)