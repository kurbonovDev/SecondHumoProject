package com.example.secondhumoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.secondhumoproject.adapters.Adapter
import com.example.secondhumoproject.adapters.AdapterReport
import com.example.secondhumoproject.data.item
import com.example.secondhumoproject.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private var strongList = listOf("Analytics","Perfectionism","Analytics","Strong","Analytics","Perfectionism","Analytics")
    private var weakList = listOf("Perfectionism","Analytics","Aggressive","Perfectionism","Analytics","Aggressive",)

    private lateinit var rcViewStrong: RecyclerView
    private lateinit var rcViewWeak: RecyclerView
    private lateinit var adapterStrong: Adapter
    private lateinit var adapterWeak: Adapter

    private lateinit var rcViewReport: RecyclerView
    private lateinit var adapterReport: AdapterReport

    private var reports = listOf<item>(
        item("Astro- psychological report", isAstro = true),
        item("Monthly prediction report", isMonthly = true),
        item("Daily Prediction", isDaily = true),
        item("Love report", isLove = true),
        item("Astro- psychological report", isAstro = true),
        item("Monthly prediction report", isMonthly = true),
        item("Daily Prediction", isDaily = true),
        item("Love report", isLove = true),
        item("Astro- psychological report", isAstro = true),
        item("Monthly prediction report", isMonthly = true),
        item("Daily Prediction", isDaily = true),
        item("Love report", isLove = true),
    )
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



    private fun initRcViewReport(){
        rcViewReport = binding.rcView3
        rcViewReport.layoutManager= GridLayoutManager(this,2)
        adapterReport= AdapterReport(reports)
        rcViewReport.adapter = adapterReport
    }
    override fun onResume() {
        super.onResume()


        initRcViewWeak()
        initRcViewStrong()
        initRcViewReport()



    }
}