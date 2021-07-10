package com.qm.maxab.ui.fragment.currency_picker

import android.os.Parcelable
import com.qm.maxab.base.view.BaseParcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UIItem(
    var title: String,
    val amount: Double,
) : BaseParcelable, Parcelable {
    override fun unique(): Any {
        return title
    }

}
