package com.qm.maxab.ui.fragment.result_screen

import androidx.databinding.ObservableField
import com.qm.maxab.base.viewmodel.BaseViewModel
import com.qm.maxab.ui.fragment.input_screen.InputScreenViewProtocols

class ResultViewModel:BaseViewModel()
{
   var view: ResultScreenViewProtocols? = null
   fun onClick(){
     view?.goToInputScreen()
   }
}