package com.qm.maxab.base.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ObservableBoolean
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import com.qm.maxab.BR
import com.qm.maxab.util.LocalUtil
import com.qm.maxab.util.bindView

/**
 * Created by MahmoudAyman on 7/17/2020.
 **/

abstract class BaseActivity<B : ViewDataBinding, VM : ViewModel> : AppCompatActivity() {

  val showProgress = ObservableBoolean()
  protected abstract val mViewModel: VM
  lateinit var binding: B

  override fun onCreate(savedInstanceState: Bundle?) {
    LocalUtil.changeLanguage(this)
    super.onCreate(savedInstanceState)
    LocalUtil.changeLanguage(this)
    binding = bindView()
    binding.setVariable(BR.viewModel, mViewModel)
  }
}
