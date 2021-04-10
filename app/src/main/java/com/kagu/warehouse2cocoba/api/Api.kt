package com.kagu.warehouse2cocoba.api

import com.kagu.warehouse2cocoba.model.WarehouseResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("getAllDataGudang.php")
    fun getWarehouses(): Call<WarehouseResponse> //buat objectnya
}