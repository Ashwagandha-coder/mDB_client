package com.mdb_client.data.service

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.mdb_client.data.Config
import com.mdb_client.data.model.CertificationTvWrapper
import com.mdb_client.data.model.CertificationsMovieWrapper
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface CertificationsService {

    @GET("")
    suspend fun getCertificationsMovie() : CertificationsMovieWrapper


    @GET("")
    suspend fun getCertificationsTV() : CertificationTvWrapper






    companion object {


        fun instance() = Retrofit.Builder()
            .baseUrl(Config.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()


    }





}