package com.example.pertemuan13.model


import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*


@Serializable
data class Mahasiswa (
    val nim: String,
    val nama: String,
    val alamat: String,

    @SerialName("jenis_kelamin")
    val jenisKelamin: String,

    val kelas: String,
    val angkatan: String
)
