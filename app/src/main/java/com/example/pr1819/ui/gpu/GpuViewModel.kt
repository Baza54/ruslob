package com.example.ivanov_pr1819_mobil.ui.gpu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GpuViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Албания: mjau\n" +
                "Англия: meow\n" +
                "Арабские страны: miaou\n" +
                "Аргентина: miau\n" +
                "Африка: miaau\n" +
                "Венгрия: miau\n" +
                "Германия: miau\n" +
                "Голландия: miauw\n" +
                "Греция: niaou\n" +
                "Дания: mjav\n" +
                "Израиль: miyau\n" +
                "Индия: mya: u,mya:u:\n" +
                "Индонезия: ngeong\n" +
                "Исландия: mja\n" +
                "Испания: miau\n" +
                "Италия: miao\n" +
                "Каталония: meu, meu\n" +
                "Китай: miao\n" +
                "Корея: (n)ya-ong\n" +
                "Норвегия: mjau\n" +
                "Польша: miau\n" +
                "Португалия: miau\n" +
                "Россия: мяу\n" +
                "Тайланд: meowmeow"
    }
    val text: LiveData<String> = _text
}