package com.beyourself.gallery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    val number: MutableLiveData<Int> by lazy { MutableLiveData<Int>().also { it.value = 0 } }
    val number2 = MutableLiveData(0)

    fun modifyNumber(aNumber: Int) {
        number.value = number.value?.plus(aNumber)
    }

    fun getNumberValue(): Int {
        return number.value ?: 0
    }

}