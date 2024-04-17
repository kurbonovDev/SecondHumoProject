package com.example.secondhumoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.secondhumoproject.adapters.Adapter
import com.example.secondhumoproject.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private var strongList = listOf("Smart","Strong","Smart","Strong","Smart","Strong","Smart","Strong")
    private var weakList = listOf("Dumb","weak","Dumb","weak","Dumb","weak","Dumb","weak","Dumb","weak","Dumb","weak")

    private lateinit var rcViewStrong: RecyclerView
    private lateinit var rcViewWeak: RecyclerView
    private lateinit var adapterStrong: Adapter
    private lateinit var adapterWeak: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    private fun initRcViewStrong(){
        rcViewStrong = binding.rcView1
        rcViewStrong.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        adapterStrong= Adapter(strongList)
        rcViewStrong.adapter=adapterStrong
    }

    private fun initRcViewWeak(){
        rcViewWeak = binding.rcView2
        rcViewWeak.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        adapterWeak= Adapter(weakList,false)
        rcViewWeak.adapter=adapterWeak
    }
    override fun onResume() {
        super.onResume()


        initRcViewWeak()
        initRcViewStrong()



    }
}