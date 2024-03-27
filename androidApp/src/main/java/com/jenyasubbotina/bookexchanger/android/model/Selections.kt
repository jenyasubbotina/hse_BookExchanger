package com.jenyasubbotina.bookexchanger.android.model
import com.google.gson.annotations.SerializedName


data class Selections (

  @SerializedName("title"  ) var title  : String?           = null,
  @SerializedName("offers" ) var offers : ArrayList<Offer> = arrayListOf()

)