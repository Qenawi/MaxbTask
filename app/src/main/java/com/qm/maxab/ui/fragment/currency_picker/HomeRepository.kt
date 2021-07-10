package com.qm.maxab.ui.fragment.currency_picker

import androidx.lifecycle.*
import com.qm.maxab.base.network.HandleResponseData
import com.qm.maxab.base.network.IsRepo
import com.qm.maxab.constants.ConstString
import com.qm.maxab.data.remote.ApiService
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

//MARK:- HomeRepository  @Docs
class HomeRepository @Inject constructor(private val apiService: ApiService) : IsRepo {


    fun getLocalData(): MediatorLiveData<HandleResponseData<ArrayList<UIItem>>> {
        val userLiveData = MediatorLiveData<HandleResponseData<ArrayList<UIItem>>>()
        val source =
            MutableLiveData<HandleResponseData<ArrayList<UIItem>>>(HandleResponseData.success(

                mapToUi(offlineHomeResponse())
            )
            )
        userLiveData.addSource(source) {
            userLiveData.value = it
            userLiveData.removeSource(source)
        }
        return userLiveData

    }

    //Mark:- todo map to back Thr
    private fun mapToUi(data: HomeResponse?): ArrayList<UIItem> {
        val maxCnt = 20
        val result = ArrayList<UIItem>()
        val str = data?.rates.toString()
        val lst = str.split(",")
        lst.subList(0, maxCnt.coerceAtMost(lst.size)).forEach { item ->
            val innerItem = item.split("=")
            innerItem.last().toDoubleOrNull()?.let { amountOfCur ->
                result.add(UIItem(title = "${innerItem.first()} : $amountOfCur", amount = amountOfCur))
            }
        }
        return result
    }

    fun getLiveData(): MediatorLiveData<HandleResponseData<ArrayList<UIItem>>> {
        val userLiveData = MediatorLiveData<HandleResponseData<ArrayList<UIItem>>>()
        val source = LiveDataReactiveStreams.fromPublisher(
            apiService.getChars(ConstString.ApiKey)
                .subscribeOn(Schedulers.io())
                .onErrorReturn {
                    HomeResponse(base = null,
                        date = null,
                        rates = null,
                        success = false,
                        timestamp = null,
                        error = null)
                }
                .map {
                    if (it.success == true)
                        return@map HandleResponseData.success(mapToUi(it))
                    else
                        return@map HandleResponseData.error(it.error?.info)
                }
        )
        userLiveData.addSource(source) {
            userLiveData.value = it
            userLiveData.removeSource(source)
        }
        return userLiveData
    }
}
