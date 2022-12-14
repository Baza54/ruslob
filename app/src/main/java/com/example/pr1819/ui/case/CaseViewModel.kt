package com.example.ivanov_pr1819_mobil.ui.case

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CaseViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "  \"Мотоцикл\" - двухколесное механическое транспортное средство с боковым прицепом или без него, рабочий объем двигателя которого (в случае двигателя внутреннего сгорания) превышает 50 куб. см или максимальная конструктивная скорость (при любом двигателе) превышает 50 км/ч. К мотоциклам приравниваются трициклы, а также квадрициклы с мотоциклетной посадкой или рулем мотоциклетного типа, имеющие ненагруженную массу, не превышающую 400 кг (550 кг для транспортных средств, предназначенных для перевозки грузов) без учета массы аккумуляторов (в случае электрических транспортных средств), и максимальную эффективную мощность двигателя, не превышающую 15 кВт."
    }
    val text: LiveData<String> = _text
}