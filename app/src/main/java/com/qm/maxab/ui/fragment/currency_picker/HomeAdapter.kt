package com.qm.maxab.ui.fragment.currency_picker

import com.qm.maxab.R
import com.qm.maxab.base.view.BaseAdapter
import com.qm.maxab.base.view.BaseViewHolder

//MARK:- HomeAdapter @Docs
class HomeAdapter(itemClick: (UIItem) -> Unit) : BaseAdapter<UIItem>(itemClick) {

    override fun layoutRes(): Int = R.layout.item_home_view
    override fun onViewHolderCreated(viewHolder: BaseViewHolder<UIItem>) {

    }
}