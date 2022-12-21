package com.mdb_client.data.service

import com.mdb_client.data.model.CertificationsMovieWrapper
import retrofit2.http.GET

interface CertificationsService {

    @GET("")
    suspend fun getCertificationsMovie() : CertificationsMovieWrapper


    @GET("")
    suspend fun getCertificationsTV()





}