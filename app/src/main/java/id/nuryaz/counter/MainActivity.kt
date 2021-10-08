package id.nuryaz.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import id.nuryaz.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var counter = 0

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun increaseCounter() {
        counter += 1
        binding.tvCounter.text = "$counter"
    }

    private fun decreaseCounter() {
        counter -= 1
        binding.tvCounter.text = "$counter"
    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.btnPlus -> increaseCounter()
            binding.btnMinus -> decreaseCounter()
        }
    }
}