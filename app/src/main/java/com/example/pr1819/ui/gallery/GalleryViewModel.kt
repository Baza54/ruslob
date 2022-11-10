package com.example.ivanov_pr1819_mobil.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "    Кошку можно кормить натуральными продуктами, но имейте в виду, что это не должна быть еда со стола. Можно давать нежирные кисломолочные продукты (творог, кефир), мясные субпродукты (печень, легкое, почки, сердце), мясо (говядину, баранину, крольчатину), рыбу (сельдь, сардины, скумбрию), овощи (кабачки, тыкву, огурцы)."
    }
    val text: LiveData<String> = _text
}