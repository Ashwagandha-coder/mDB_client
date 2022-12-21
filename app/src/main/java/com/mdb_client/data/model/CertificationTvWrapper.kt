package com.mdb_client.data.model

import com.squareup.moshi.Json


data class CertificationTvWrapper (
    val certifications: CertificationsMovieWrapper
)

data class CertificationsTv (
    @Json(name = "RU")
    val ru: List<Au>,

    @Json(name = "US")
    val us: List<Au>,

    @Json(name = "CA")
    val ca: List<Au>,

    @Json(name = "AU")
    val au: List<Au>,

    @Json(name = "FR")
    val fr: List<Au>,

    @Json(name = "DE")
    val de: List<Au>,

    @Json(name = "TH")
    val th: List<Au>,

    @Json(name = "KR")
    val kr: List<Au>,

    @Json(name = "GB")
    val gb: List<Au>,

    @Json(name = "BR")
    val br: List<Au>,

    @Json(name = "NL")
    val nl: List<Au>,

    @Json(name = "PT")
    val pt: List<Au>,

    @Json(name = "CA-QC")
    val caQc: List<Au>,

    @Json(name = "HU")
    val hu: List<Au>,

    @Json(name = "LT")
    val lt: List<Au>,

    @Json(name = "PH")
    val ph: List<Au>,

    @Json(name = "ES")
    val es: List<Au>,

    @Json(name = "SK")
    val sk: List<Au>
)

data class Au (
    val certification: String,
    val meaning: String,
    val order: Long
)
