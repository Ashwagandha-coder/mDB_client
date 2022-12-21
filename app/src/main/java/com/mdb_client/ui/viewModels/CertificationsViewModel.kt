package com.mdb_client.ui.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mdb_client.data.model.CertificationMovie
import kotlinx.coroutines.launch

class CertificationsViewModel: ViewModel() {


    init {

    }


    private val _liveData: MutableLiveData<CertificationMovie> = MutableLiveData()
    val liveData = _liveData

    private fun request() = viewModelScope.launch {



    }


}