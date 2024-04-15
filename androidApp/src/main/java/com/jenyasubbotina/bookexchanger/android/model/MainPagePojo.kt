package com.jenyasubbotina.bookexchanger.android.model

import com.google.gson.annotations.SerializedName


data class MainPagePojo (

  @SerializedName("selections" ) var selections : ArrayList<Selections> = arrayListOf()

)