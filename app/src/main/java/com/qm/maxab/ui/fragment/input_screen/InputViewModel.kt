package com.qm.maxab.ui.fragment.input_screen

import androidx.databinding.ObservableField
import com.qm.maxab.base.viewmodel.BaseViewModel

class InputViewModel:BaseViewModel()
{
   var input = ObservableField<String>("0.0")
   var view:InputScreenViewProtocols? = null
   fun onClick(){
     view?.openSelectionList()
   }
}