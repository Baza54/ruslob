package com.example.ivanov_pr1819_mobil.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "    Выезд из двора или c другой прилегающей территории:\n" +
                "Согласно определению понятия «перекресток», выезд с прилегающей территории не считается перекрестком . Сюда относятся выезды из дворов, жилых массивов, автостоянок, АЗС, предприятий и другие подобные ситуации, когда водитель должен уступить дорогу транспортным средствам и пешеходам, движущимся\n" +
                " по дороге."
    }
    val text: LiveData<String> = _text
}