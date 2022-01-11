package net.verybestmobile.tvshowmvvmyt.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.verybestmobile.tvshowmvvmyt.api.BASE_URL
import net.verybestmobile.tvshowmvvmyt.api.TVShowApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApi(): TVShowApi =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TVShowApi::class.java)
}