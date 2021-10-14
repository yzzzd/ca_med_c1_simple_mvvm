package id.nuryaz.counter.data

import android.content.Context

/**
 * Created by nuryazid on 4/21/18.
 */

class SaveCounter(context: Context) {
    var pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    var counter: Int
        set(value) {
            val editor = pref.edit()
            editor?.putInt(COUNTER, value)
            editor?.apply()
        }
        get() = pref.getInt(COUNTER, 0)

    companion object {
        const val PREF_NAME = "data-counter"
        const val COUNTER = "counter"
    }
}