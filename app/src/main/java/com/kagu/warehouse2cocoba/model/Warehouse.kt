package com.kagu.warehouse2cocoba.model

import com.google.gson.annotations.SerializedName

data class Warehouse(
    val id: Int, //harus sama dengan nama var d api

    //bila ingin variabel yg berbeda dengan di api maka menggunakan @SerializedName lalu dibawah nya nama yg diinginkan
    @SerializedName("kodeGudang")
    val codeWarehouse: String,

    @SerializedName("kodeBarang")
    val codeItem: String,

    @SerializedName("namaBarang")
    val nameItem: String,

    @SerializedName("jenisBarang")
    val typeOfItem: String,

    @SerializedName("jumlahStok")
    val totalItems: String,

    @SerializedName("satuan")
    val unit: String

)