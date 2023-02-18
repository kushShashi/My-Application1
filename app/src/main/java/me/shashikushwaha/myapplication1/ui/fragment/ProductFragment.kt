package me.shashikushwaha.myapplication1.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import me.shashikushwaha.myapplication1.R
import me.shashikushwaha.myapplication1.di.model.ItemsViewModel
import me.shashikushwaha.myapplication1.ui.adapter.CustomAdapter


class ProductFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("error","fragment ................................")
        // getting the recyclerview by its id
       // val recyclerview = findViewById<RecyclerView>(R.id.rec)

        // this creates a vertical layout Manager
        //recyclerview.layoutManager = LinearLayoutManager(this)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("error","fragment called.**************************...............................")
     var view=inflater.inflate(R.layout.fragment_product, container, false)
       // var rec= RecyclerView

      /*  val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.splach, "Item " + i,"10"+i,"100"+i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter*/


        return view
    }


}