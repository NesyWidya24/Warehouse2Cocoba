package com.kagu.warehouse2cocoba.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kagu.warehouse2cocoba.R
import com.kagu.warehouse2cocoba.adapter.WarehouseAdapter
import com.kagu.warehouse2cocoba.api.RetrofitClient
import com.kagu.warehouse2cocoba.model.Warehouse
import com.kagu.warehouse2cocoba.model.WarehouseResponse
import kotlinx.android.synthetic.main.activity_user.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WarehouseActivity : AppCompatActivity() {
    private var list = ArrayList<Warehouse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        showWarehouses()
    }

    private fun showWarehouses() {
        rvWarehouse.setHasFixedSize(true)
        rvWarehouse.layoutManager = LinearLayoutManager(this)
        RetrofitClient.instances.getWarehouses().enqueue(object : Callback<WarehouseResponse> {
            override fun onResponse(
                call: Call<WarehouseResponse>,
                response: Response<WarehouseResponse>
            ) {
                tvResponseCode.text = response.code().toString()
                val listResponse = response.body()?.data
                listResponse?.let { list.addAll(it) }
                val adapter = WarehouseAdapter(list)
                rvWarehouse.adapter = adapter
            }

            override fun onFailure(call: Call<WarehouseResponse>, t: Throwable) {
                tvResponseCode.text = t.message
            }

        })
    }
}