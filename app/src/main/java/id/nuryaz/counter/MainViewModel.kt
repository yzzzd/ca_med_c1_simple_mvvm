package id.nuryaz.counter

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import id.nuryaz.counter.data.SaveCounter
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val saveCounter: SaveCounter): ViewModel() {

    val counter = ObservableField(0)

    fun increaseCounter() {
        saveCounter.counter = saveCounter.counter + 1
        sendValue()
    }

    fun decreaseCounter() {
        saveCounter.counter = saveCounter.counter - 1
        sendValue()
    }

    fun sendValue() {
        counter.set(saveCounter.counter)
    }
}