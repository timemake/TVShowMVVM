package net.verybestmobile.tvshowmvvmyt.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.verybestmobile.tvshowmvvmyt.model.TVShow
import net.verybestmobile.tvshowmvvmyt.repository.TVShowRepository
import javax.inject.Inject

@HiltViewModel
class TVShowViewModel @Inject constructor(
    private val repository: TVShowRepository
): ViewModel() {

    private val _shows = MutableLiveData<List<TVShow>>()
    val shows: LiveData<List<TVShow>> get() = _shows

    init {
        getShows()
    }

    private fun getShows() = viewModelScope.launch {
        _shows.value = repository.getShows().tv_shows
    }
}