package me.shashikushwaha.myapplication1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import me.shashikushwaha.myapplication1.R
import me.shashikushwaha.myapplication1.databinding.ActivityMainBinding
import me.shashikushwaha.myapplication1.di.ProductModel
import me.shashikushwaha.myapplication1.di.model.ItemsViewModel
import me.shashikushwaha.myapplication1.di.model.ModelProduct
import me.shashikushwaha.myapplication1.ui.adapter.CustomAdapter
import me.shashikushwaha.myapplication1.ui.adapter.ProductAdapter
import me.shashikushwaha.myapplication1.ui.fragment.ProductFragment
import me.shashikushwaha.myapplication1.ui.fragment.ProfileFragment

class DashboardProductActivity : AppCompatActivity() {


     val productList = ArrayList<ModelProduct>()
    var animals: ArrayList<ProductAdapter> = ArrayList()
    lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_product)
        var productAdapter: ProductAdapter
        // val productButton=findViewById<Button>(R.id.product_btn)
       // binding= ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        Log.d("error","before fragment called ................................")
      //  replacefragment(fragment = ProfileFragment() )
      /*  productButton.setOnClickListener{
            replacefragment(fragment = ProductFragment() )
        }
*/


        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.rec)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.splach, "Item " + i,"10"+i,"100"+i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

        val recyclerView: RecyclerView = findViewById(R.id.rec)
       // productAdapter = ProductAdapter(productList)

        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        //recyclerView.itemAnimator = DefaultItemAnimator()
         recyclerView.adapter = ProductAdapter(animals)
      //  getDummyData()
    }

   /* private fun replacefragment(fragment: ProfileFragment) {

        val fragmeManager=supportFragmentManager
        val fragmentTranscation=fragmeManager.beginTransaction()
        fragmentTranscation.replace(R.id.fragment_container_viw,fragment)
        Log.d("error","fragment called................................")
        Log.d("error","fragment called................................"+fragmentTranscation)
         fragmentTranscation.commit()
        Log.d("error","fragment called................................"+fragmentTranscation)
    }*/

    // private fun getDummyData() {
       // animals.add("sha","102",1000)

// //       animals = ProductModel("Mad Max: Fury Road", "Action & Adventure", 2000)
       // productList.add(animals)
       /* product = ProductModel("Inside Out", "Animation, Kids & Family", 3000)
        productList.add(product)
        product = ProductModel("Inside Out", "Animation, Kids & Family", 4000)
        productList.add(product)
        product = ProductModel("Inside Out", "Animation, Kids & Family", 5000)
        productList.add(product)
        product = ProductModel("Inside Out", "Animation, Kids & Family", 6000)
        productList.add(product)*/


      /*  val list :List<ProductAdapter> = listOf(

            ProductModel("dfgdfg", "title 1",100)*/
            /*DataModelObject("tyuityui", "title 2"),
            DataModelObject("yuti", "title 3"),
            DataModelObject("uY9NOrc-=s180-rw", "title 4"),
            DataModelObject("logo_color_272x92dp.png", "title 5"),
            DataModelObject("NOVtP26EKH", "title 6"),
            DataModelObject("googlelogo_color", "title 7"),
            DataModelObject("sNOVtP26EKHePkwBg-PkuY9NOrc-", "title 8")*/
       // )
      //  var movie = ProductModel()
       // productList.add(movie)
      //  movie = ProductModel("InsideOut", "102",  30)
        //productList.add(movie)

        //productAdapter.notifyDataSetChanged()



        //}
    //}



}