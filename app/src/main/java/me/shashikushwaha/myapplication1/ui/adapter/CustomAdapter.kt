package me.shashikushwaha.myapplication1.ui.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import me.shashikushwaha.myapplication1.R
import me.shashikushwaha.myapplication1.di.model.ItemsViewModel

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layoutproduct, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.textView1.text = ItemsViewModel.text
        holder.textView2.text = ItemsViewModel.code
        holder.textView3.text = ItemsViewModel.price

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.product_image)
        val textView1= itemView.findViewById<TextView>(R.id.product_name)
        val textView2= itemView.findViewById<TextView>(R.id.product_code)
        val textView3= itemView.findViewById<TextView>(R.id.product_price)
    }
}