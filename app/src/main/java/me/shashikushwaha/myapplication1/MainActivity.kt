package me.shashikushwaha.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import me.shashikushwaha.myapplication1.ui.DashboardProductActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener{
            val intent=Intent(this,DashboardProductActivity::class.java)
            startActivity(intent)
        }
    }
}