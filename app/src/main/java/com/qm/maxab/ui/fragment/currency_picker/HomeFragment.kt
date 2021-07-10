package com.qm.maxab.ui.fragment.currency_picker

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.qm.maxab.base.network.Status.*
import com.qm.maxab.base.view.BaseFragment
import com.qm.maxab.databinding.FragmentHomeBinding
import com.qm.maxab.util.DialogsExtensions.showErrorDialog
import com.qm.maxab.util.navigateSafe
import com.qm.maxab.util.observe
import dagger.hilt.android.AndroidEntryPoint

//MARK:- HomeFragment  @Docs
@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override fun pageTitle(): String = ""

    override val mViewModel: HomeViewModel by viewModels()

    override fun onViewCreated(
      view: View,
      savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel.apply {
            observe(mutableLiveData) {
                when (it) {
                    is UIItem -> {
                        navigateSafe(HomeFragmentDirections.actionHomeFragmentToPlaceholder2()
                        )
                    }
                }
            }
            observe(observeUsers()) {
                when (it?.status) {
                    SUCCESS -> {
                        showProgress(false)
                        loadDataOnAdapter(it.data)
                    }
                    MESSAGE -> {
                        showProgress(false)
                        activity?.showErrorDialog(it.message)
                    }
                    LOADING -> {
                        showProgress()
                    }
                }
            }
        }
    }
}