package com.qm.maxab.util

import android.content.Context
import com.qm.maxab.R

//MARK:- DialogsExtensions @Docs
object DialogsExtensions {
  fun Context.showErrorDialog(
    message: String?,
    onClick: () -> Unit = {}
  ) {
    println("todoAddError")
  }


    fun Context.showSuccessfulDialog(
      message: String?,
      onClick: () -> Unit = {}
    ) {
      println("todoAddSuccess")

    }
  }
