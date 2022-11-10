package com.example.ivanov_pr1819_mobil.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeVievModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "        Ко́шка (лат. Felis catus) — домашнее животное, одно из наиболее популярных (наряду с собакой) «животных-компаньонов». С точки зрения научной систематики, домашняя кошка — млекопитающее семейства кошачьих отряда хищных. Нередко домашнюю кошку рассматривают как подвид лесной кошки(Felis silvestris)—Felis s. Catu, однако, с точки зрения современной биологической систематики (2017 год), домашняя кошка является отдельным биологическим видом."
    }
    val text: LiveData<String> = _text

    /*private  val _image = MutableLiveData<Image>().apply {
        value = R.id.

    }*/

    /*private var _wallpaper = MutableLiveData<Drawable>()
    val wallpaper: LiveData<Drawable>
        get() = _wallpaper

    fun updateWallPaper() {
        val file = appCtx.getWallpaperFile()
        if(file.exists()) {
            _wallpaper.value = BitmapDrawable(R.drawable.campic, BitmapFactory.decodeFile(file.absolutePath))
        }
    }*/

}