package com.example.pertemuan13.service_api

import com.example.pertemuan13.model.Mahasiswa
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface MahasiswaService {
    @Headers(
        "Accept: application/json",
        "Content-Type: application/json",
    )
    @GET("bacamahasiswa.php")
    suspend fun getAllMahasiswa(): List<Mahasiswa>

    @GET("baca1mahasiswa.php/{nim}")
    suspend fun getMahasiswabyNim(@Query("nim")nim:String):Mahasiswa

    @POST("insertmahasiswa.php")
    suspend fun insertMahasiswa(@Body mahasiswa:Mahasiswa)

    @PUT("editmahasiswa.php/{nim}")
    suspend fun updateMahasiswa(@Query("nim")nim: String, @Body mahasiswa:Mahasiswa)

    @DELETE("deletemahasiswa.php/{nim}")
    suspend fun deleteMahasiswa(@Query("nim")nim: String): retrofit2.Response<Void>
}