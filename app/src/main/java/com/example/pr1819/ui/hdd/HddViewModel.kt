package com.example.ivanov_pr1819_mobil.ui.hdd

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HddViewModel: ViewModel()  {
    private val _text = MutableLiveData<String>().apply {
        value = "    \"Велосипед\" - транспортное средство, кроме инвалидных колясок, которое имеет по крайней мере два колеса и приводится в движение как правило мускульной энергией лиц, находящихся на этом транспортном средстве, в частности при помощи педалей или рукояток, и может также иметь электродвигатель номинальной максимальной мощностью в режиме длительной нагрузки, не превышающей 0,25 кВт, автоматически отключающийся на скорости более 25 км/ч."
        }
    val text: LiveData<String> = _text
}