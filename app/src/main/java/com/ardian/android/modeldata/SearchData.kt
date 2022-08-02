package com.ardian.android.modeldata

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 03/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class SearchData(
    @SerializedName("Search") val data : List<MovieData>,
    @SerializedName("totalResults") val totalData : Int
)