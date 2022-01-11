package net.verybestmobile.tvshowmvvmyt.api

import net.verybestmobile.tvshowmvvmyt.model.TVShowResponse
import retrofit2.http.GET

const val BASE_URL = "https://www.episodate.com/api/"
const val END_POINT = "most-popular"

interface TVShowApi {

    @GET(END_POINT)
    suspend fun getShows(): TVShowResponse
}