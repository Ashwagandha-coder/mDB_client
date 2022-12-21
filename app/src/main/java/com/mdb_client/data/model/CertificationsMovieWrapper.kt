package com.mdb_client.data.model


data class CertificationsMovieWrapper (
    val certifications: Map<String, List<CertificationMovie>>
)

data class CertificationMovie (
    val certification: String,
    val meaning: String,
    val order: Long
)