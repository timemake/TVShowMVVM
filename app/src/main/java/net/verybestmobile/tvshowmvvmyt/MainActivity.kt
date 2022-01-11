package net.verybestmobile.tvshowmvvmyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint
import net.verybestmobile.tvshowmvvmyt.adapter.TVShowAdapter
import net.verybestmobile.tvshowmvvmyt.databinding.ActivityMainBinding
import net.verybestmobile.tvshowmvvmyt.viewmodel.TVShowViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val tvShowViewModel: TVShowViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            viewModel = tvShowViewModel
            lifecycleOwner = this@MainActivity
            recyclerView.adapter = TVShowAdapter()
        }
    }
}