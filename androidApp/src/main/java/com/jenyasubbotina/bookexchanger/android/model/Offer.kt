package com.jenyasubbotina.bookexchanger.android.model

import com.google.gson.annotations.SerializedName


data class Offer (

  @SerializedName("id"                ) var id                : String?            = null,
  @SerializedName("title"             ) var title             : String?            = null,
  @SerializedName("description"       ) var description       : String?            = null,
  @SerializedName("price"             ) var price             : Int?               = null,
  @SerializedName("city"              ) var city              : String?            = null,
  @SerializedName("picture"           ) var picture           : String?            = null,
  @SerializedName("genre"             ) var genre             : Genre?             = Genre(),
  @SerializedName("authors"           ) var authors           : ArrayList<Authors> = arrayListOf(),
  @SerializedName("owner"             ) var owner             : Owner?             = Owner(),
  @SerializedName("createdAt"         ) var createdAt         : String?            = null,
  @SerializedName("bookRating"        ) var bookRating        : Int?               = null,
  @SerializedName("isFavoriteForUser" ) var isFavoriteForUser : Boolean?           = null

)