package com.example.learnfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val f1:FragmentManager = FragmentManager()

    }

//    override fun onDestroy() {
//        super.onDestroy()
//    }
}