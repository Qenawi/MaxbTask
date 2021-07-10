package com.qm.maxab.ui.fragment.currency_picker

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.qm.maxab.R
import com.qm.maxab.base.network.HandleResponseData
import com.qm.maxab.base.viewmodel.AndroidBaseViewModel
import com.qm.maxab.util.AppUtil
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//MARK:- HomeViewModel @Docs
@HiltViewModel
class HomeViewModel @Inject constructor(
  app: Application,
  private val homeRepository: HomeRepository,
) : AndroidBaseViewModel(app) {

    private var usersLivedata = MediatorLiveData<HandleResponseData<ArrayList<UIItem>>>()

    val adapter = HomeAdapter(::onItemClick)

    private fun onItemClick(homeItem: UIItem) {
        setValue(homeItem)
    }

    fun loadDataOnAdapter(results: List<UIItem?>?) {
        results?.let { adapter.setList(it) }
    }

    init {
        getData()
    }

    private fun getData() {
        if (!AppUtil.isNetworkAvailable(app)) {
            usersLivedata.postValue(HandleResponseData.error(msg = app.getString(R.string.network_error)))
            return
        }

      usersLivedata = homeRepository.getLiveData()
      //MARK:- loading
      usersLivedata.postValue(HandleResponseData.loading())
    }


    fun observeUsers(): LiveData<HandleResponseData<ArrayList<UIItem>>> = usersLivedata
}