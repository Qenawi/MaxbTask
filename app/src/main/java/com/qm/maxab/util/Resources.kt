package com.qm.maxab.util

/**
 * Created by MahmoudAyman on 6/29/2020.
 **/
sealed class Resource<T>(
        val data: T? = null,
        val message: String? = null
) {
    class Success<T>(data: T?=null, message: String?=null) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Error<T>(message: String?, data: T? = null) : Resource<T>(data, message)
}