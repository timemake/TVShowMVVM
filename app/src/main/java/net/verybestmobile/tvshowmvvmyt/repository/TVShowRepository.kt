package net.verybestmobile.tvshowmvvmyt.repository

import dagger.internal.InjectedFieldSignature
import net.verybestmobile.tvshowmvvmyt.api.TVShowApi
import javax.inject.Inject

class TVShowRepository @Inject constructor(
    private val tvShowApi: TVShowApi
) {

    suspend fun getShows() = tvShowApi.getShows()
}