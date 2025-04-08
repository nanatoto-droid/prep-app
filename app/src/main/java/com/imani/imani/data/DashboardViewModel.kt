package com.imani.imani.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.imani.imani.model.DashboardStat
import com.imani.imani.model.QuickAction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DashboardViewModel:ViewModel(){

    private val _Stats= MutableStateFlow(
        listOf(
            DashboardStat("Revenue","12000", Icons.Default.Phone, Color.Gray),
            DashboardStat("Users","1456",Icons.Default.Person,Color.Cyan)
        )
    )
    val stat:StateFlow<List<DashboardStat>>get()=_Stats
    private val _quickAction= MutableStateFlow(
        listOf(
            QuickAction("add user",Icons.Default.Person),
            QuickAction("Generate report",Icons.Default.AccountCircle),
            QuickAction("Setting",Icons.Default.Settings)
        )
    )
    val quickAction:StateFlow<List<QuickAction>>get()=_quickAction
}

