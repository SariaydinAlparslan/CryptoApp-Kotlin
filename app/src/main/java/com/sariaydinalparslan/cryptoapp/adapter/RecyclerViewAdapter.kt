package com.sariaydinalparslan.cryptoapp.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sariaydinalparslan.cryptoapp.R
import com.sariaydinalparslan.cryptoapp.model.CryptoModel
import kotlinx.android.synthetic.main.row_layout.view.*


class RecyclerViewAdapter(private val cryptoList : ArrayList<CryptoModel>,private val listener : Listener) : RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {

    interface Listener {
        fun onItemClick(cryptoModel: CryptoModel)
    }
    //private val colors : Array<String> = arrayOf("#1839F1","#715500","#8E2402","#B68CFF","#FFFFFFFF","#FFBB86FC","#5DB5FB","#B6FFB9")

    class RowHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(cryptoModel: CryptoModel,position: Int,listener: Listener){
            itemView.setOnClickListener {
                listener.onItemClick(cryptoModel)
            }
            //itemView.setBackgroundColor(Color.parseColor(colors[position %8]))
            itemView.currency_text.text = cryptoModel.currency
            itemView.price_text.text = cryptoModel.price
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return RowHolder(view)
    }
    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.bind(cryptoList[position],position, listener)
    }
    override fun getItemCount(): Int {
        return cryptoList.size
    }
}