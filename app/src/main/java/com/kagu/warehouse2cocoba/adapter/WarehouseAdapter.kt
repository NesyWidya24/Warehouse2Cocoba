package com.kagu.warehouse2cocoba.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.kagu.warehouse2cocoba.R
import com.kagu.warehouse2cocoba.model.Warehouse
import kotlinx.android.synthetic.main.item_list.view.*

class WarehouseAdapter (private val list: ArrayList<Warehouse>):RecyclerView.Adapter<WarehouseAdapter.WarehouseViewHolder>(){
    inner class WarehouseViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(warehouse: Warehouse){
            with(itemView){
                val text = "id: ${warehouse.id}\n" +
                        "kodeGudang: ${warehouse.codeWarehouse}\n" +
                        "kodeBarang: ${warehouse.codeItem}\n" +
                        "namaBarang: ${warehouse.nameItem}\n" +
                        "jenisBarang: ${warehouse.typeOfItem}\n" +
                        "jumlahStok: ${warehouse.totalItems}\n" +
                        "satuan: ${warehouse.unit}\n"

                tvResponse.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WarehouseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return WarehouseViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: WarehouseViewHolder, position: Int) {
        holder.bind(list[position])
    }
}
