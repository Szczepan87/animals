package com.example.animals.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.animals.model.Animal

class ListViewModel(application: Application) : AndroidViewModel(application) {

    val animals by lazy { MutableLiveData<List<Animal>>() }
    val loadError by lazy { MutableLiveData<Boolean>() }
    val loading by lazy { MutableLiveData<Boolean>() }

    fun refresh() {
        getAnimals()
    }

    private fun getAnimals() {
        val alligator = Animal("alligator")
        val bee = Animal("bee")
        val cat = Animal("cat")
        val dog = Animal("dog")
        val elephant = Animal("elephant")
        val flamingo = Animal("flamingo")

        val list = arrayListOf(alligator, bee, cat, dog, elephant, flamingo)

        animals.value = list
        loadError.value = false
        loading.value = false
    }
}