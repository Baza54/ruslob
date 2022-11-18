package com.example.ivanov_pr1819_mobil.ui.gpu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GpuViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "\"Главная дорога\" - дорога, обозначенная знаками 2.1, 2.3.1 - 2.3.7 или 5.1, по отношению к пересекаемой (примыкающей), или дорога с твердым покрытием (асфальто- и цементобетон, каменные материалы и тому подобное) по отношению к грунтовой, либо любая дорога по отношению к выездам с прилегающих территорий. Наличие на второстепенной дороге непосредственно перед перекрестком участка с покрытием не делает ее равной по значению с пересекаемой."
    }
    val text: LiveData<String> = _text
}