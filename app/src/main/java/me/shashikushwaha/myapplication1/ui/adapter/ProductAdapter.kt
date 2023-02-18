package me.shashikushwaha.myapplication1.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import me.shashikushwaha.myapplication1.R

class ProductAdapter (private var productList: List<ProductAdapter>):
   Adapter<ProductAdapter.MyViewHolder>(){

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title= view.findViewById<TextView>(R.id.product_name)
        var code = view.findViewById<TextView>(R.id.product_code)
        var price = view.findViewById<TextView>(R.id.product_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layoutproduct, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
  //      TODO("Not yet implemented")
        val product = productList[position]
       // holder.title.text = product
        //holder.code.text = product.getGenre()
        //holder.price.text = product.getYear()

    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return productList.size
    }

}