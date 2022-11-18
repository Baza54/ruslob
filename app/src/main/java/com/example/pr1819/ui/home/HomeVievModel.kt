package com.example.ivanov_pr1819_mobil.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeVievModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "        Правила дорожного движения - это свод правил, регулирующих обязанности участников дорожного движения, а также технические требования, предъявляемые к транспортным средствам, для обеспечения безопасности дорожного движения."
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