package com.qm.maxab.ui.fragment.splash

import com.qm.maxab.base.viewmodel.BaseViewModel
import com.qm.maxab.constants.Codes
import com.qm.maxab.util.KtCoroutine

//MARK:- SplashViewModel @Docs
class SplashViewModel : BaseViewModel() {

  init {
    KtCoroutine.delayJob(1) {
      postValue(Codes.LOGIN_SCREEN)
    }
  }
}