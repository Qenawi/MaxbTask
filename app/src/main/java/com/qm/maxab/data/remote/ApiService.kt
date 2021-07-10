package com.qm.maxab.data.remote

import com.qm.maxab.ui.fragment.currency_picker.HomeResponse
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by MahmoudAyman on 6/24/2020.
 **/

interface ApiService {

  @GET("api/latest")
//  fun getChars(@Query("page") page: Int): Flowable<Resource<HomeResponse>>
  fun getChars(@Query("access_key") key: String): Flowable<HomeResponse>
}