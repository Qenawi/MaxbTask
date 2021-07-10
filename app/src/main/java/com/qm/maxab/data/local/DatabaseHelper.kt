package com.qm.maxab.data.local

import com.qm.maxab.data.local.entity.CalendarItem

//MARK:- DatabaseHelper @Docs
interface DatabaseHelper {

    suspend fun getCalendarDays(): List<CalendarItem>

    suspend fun insertAll(users: List<CalendarItem>)

}