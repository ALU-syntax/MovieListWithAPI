package com.ardian.android

import com.ardian.android.modeldata.SearchData
import retrofit2.Call
import retrofit2.http.GET


/**
 * Created by Ardian Iqbal Yusmartito on 03/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
interface Api {
    @GET("?s=spider&apikey=bb8d10c9")
    fun getMovies():Call<SearchData>
}