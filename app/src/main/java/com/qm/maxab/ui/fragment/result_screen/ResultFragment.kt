package com.qm.maxab.ui.fragment.result_screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.qm.maxab.R
import com.qm.maxab.base.view.BaseFragment
import com.qm.maxab.databinding.InputScreenBinding
import com.qm.maxab.databinding.ResultScreenBinding
import com.qm.maxab.ui.fragment.input_screen.InputScreenViewProtocols
import com.qm.maxab.ui.fragment.input_screen.InputViewModel
import com.qm.maxab.ui.fragment.splash.SplashFragmentDirections
import com.qm.maxab.util.navigateSafe

class ResultFragment : BaseFragment<ResultScreenBinding, ResultViewModel>(), ResultScreenViewProtocols {
    override fun pageTitle(): String {
        return getString(R.string.InputFragment)
    }

    //MARK:- provide view model
    override val mViewModel: ResultViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel.view = this
    }

    override fun goToInputScreen()
    {
        navigateSafe(ResultFragmentDirections.actionPlaceholder2ToPlaceholder())
    }
}