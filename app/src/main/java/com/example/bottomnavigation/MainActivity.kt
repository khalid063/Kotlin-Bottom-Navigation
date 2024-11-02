package com.example.bottomnavigation

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var ivHomeBut: ImageView
    private lateinit var ivChatbut: ImageView
    private lateinit var ivCartBut: ImageView
    private lateinit var ivAccountBut: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize ImageViews
        ivHomeBut = findViewById(R.id.searchImageViewIcon)
        ivChatbut = findViewById(R.id.discassionImageViewIcon)
        ivCartBut = findViewById(R.id.homeImageViewIcon)
        ivAccountBut = findViewById(R.id.chatImageViewIcon)

        // Set click listeners for each button
        ivHomeBut.setOnClickListener(this)
        ivChatbut.setOnClickListener(this)
        ivCartBut.setOnClickListener(this)
        ivAccountBut.setOnClickListener(this)


//        ivHomeBut.setOnClickListener { loadFragment(HomeFragment()) }
//        ivChatbut.setOnClickListener { loadFragment(ChatFragment()) }
//        ivCartBut.setOnClickListener { loadFragment(HomeFragment()) }
//        ivAccountBut.setOnClickListener { loadFragment(AccountFragment()) }
//
        // Load the default fragment when the app starts
        loadFragment(HomeFragment())


    }
    ///---------------------------------------------------- below of "On Create" --------------------------------------------------///


    //--- Fragment change Function ---///
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    ///--- Bottom Navigation on Click Listener ---///
    override fun onClick(v: View?) {
        // Use when statement to handle clicks
        when (v?.id) {
            R.id.searchImageViewIcon -> {
                Toast.makeText(this, "Home button is clicked", Toast.LENGTH_SHORT).show()

                // Change icon colors
                ivHomeBut.setColorFilter(ContextCompat.getColor(this, R.color.teal_200))
                ivChatbut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))
                ivCartBut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))
                ivAccountBut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))

                // Load HomeFragment when Home button is clicked
                loadFragment(HomeFragment())
            }

            R.id.discassionImageViewIcon -> {
                Toast.makeText(this, "Chat button is clicked", Toast.LENGTH_SHORT).show()

                // Change icon colors
                ivHomeBut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))
                ivChatbut.setColorFilter(ContextCompat.getColor(this, R.color.teal_200))
                ivCartBut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))
                ivAccountBut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))

                // Load ChatFragment when Chat button is clicked
                loadFragment(ChatFragment())
            }

            R.id.homeImageViewIcon -> {
                Toast.makeText(this, "Cart button is clicked", Toast.LENGTH_SHORT).show()

                // Change icon colors
                ivHomeBut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))
                ivChatbut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))
                ivCartBut.setColorFilter(ContextCompat.getColor(this, R.color.teal_200))
                ivAccountBut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))

                // Load HomeFragment when Cart button is clicked (change this if you want a different fragment)
                loadFragment(HomeFragment())
            }

            R.id.chatImageViewIcon -> {
                Toast.makeText(this, "Account button is clicked", Toast.LENGTH_SHORT).show()

                // Change icon colors
                ivHomeBut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))
                ivChatbut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))
                ivCartBut.setColorFilter(ContextCompat.getColor(this, R.color.transparent))
                ivAccountBut.setColorFilter(ContextCompat.getColor(this, R.color.teal_200))

                // Load AccountFragment when Account button is clicked
                loadFragment(AccountFragment())
            }
        }
    }




}