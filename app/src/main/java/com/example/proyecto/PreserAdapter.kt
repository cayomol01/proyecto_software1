package com.example.proyecto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PreserAdapter: RecyclerView.Adapter<PreserAdapter.ViewHolder>() {

    val titles = arrayOf("Pastilla Anticonceptiva",
        "Condón",
        "Diafragma",
        "Inyección Anticonceptiva",
        "Anillo Vaginal",
        "Parche Anticonceptivo",
        "Condón Interno",
        "Esponja Anticonceptiva",
        "Capuchón Cervical",
        "Espermicida y Gel")

    val details = arrayOf ("Efectividad: 91%",
        "Efectividad: 85%",
        "Efectividad: 88%",
        "Efectividad: 94%",
        "Efectividad: 91%",
        "Efectividad: 91%",
        "Efectividad: 85%",
        "Efectividad: 76% a 88%",
        "Efectividad: 71% a 86%",
        "Efectividad: 71% a 86%")

    val images = intArrayOf(R.mipmap.pastillas,
        R.mipmap.condon,
        R.mipmap.diafragma,
        R.mipmap.inyeccion,
        R.mipmap.anillo,
        R.mipmap.parche,
        R.mipmap.cinterno,
        R.mipmap.esponja,
        R.mipmap.capuchon,
        R.mipmap.espermicida)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.preser, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_imagePreser)
            itemTitle = itemView.findViewById(R.id.item_titlePreser)
            itemDetail = itemView.findViewById(R.id.item_detalPreser)
        }
    }
}