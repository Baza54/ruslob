package com.example.ivanov_pr1819_mobil.ui.monitor

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MonitorViewModel: ViewModel()  {
    private val _text = MutableLiveData<String>().apply {
        value = "        Также, уже вне корпуса, будет расположено ещё одно важное устройство – монитор. Монтитор подключается проводом к материнской плате и без него вы, соответственно, не увидите всего что делаете на компьютере :) Основными параметрами монитора являются:\n" +
                "\n" +
                " - Диагональ экрана в дюймах;\n" +
                "\n" +
                " - Поддерживаемое разрешение экрана, например, 1920×1080. Чем оно больше, тем лучше;\n" +
                "\n" +
                " - Угол обзора. Влияет на то, как будет видно изображение если смотреть на монитор со стороны или чуть выше / ниже. Чем больше угол обзора, тем лучше;\n" +
                "\n" +
                " - Яркость и контрастность. Яркость измеряется в кд/м2 и в хороших моделях лежит за пределами 300, а контрастность должна быть не менее 1:1000 для хорошего отображения."
    }
    val text: LiveData<String> = _text
}