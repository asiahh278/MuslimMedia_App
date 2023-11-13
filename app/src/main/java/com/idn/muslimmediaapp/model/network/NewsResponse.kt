package com.idn.muslimmediaapp.model.network

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

// kot-gen: memjdahkan kita agar tidak nulis banyak kode
@JsonClass(generateAdapter = true) // to automatically generate JSON Adapter
data class NewsResponse(

    @Json(name = "totalResult")
    val totalResult: Int? = null,

    @Json(name = "articles")
    val articles: List<ArticlesItem>? = null,

    @Json(name = "status")
    val status: String? = null
)

@JsonClass(generateAdapter = true)
@Parcelize
data class Source(
    @Json(name = "name") // JSON Properties mapping
    val name: String? = null
): Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class ArticlesItem(

    @Json(name = "publishedAt")
    val publishedAt: String? = null,

    @Json(name = "author")
    val author: String? = null,

    @Json(name = "urlToImage")
    val urlToImage: String? = null,

    @Json(name = "description")
    val description: String? = null,

    @Json(name = "source")
    val source: Source? = null,

    @Json(name = "title")
    val title: String? = null,

    @Json(name = "url")
    val url: String? = null,

    @Json(name = "content")
    val content: String? = null
): Parcelable