package com.example.secondhumoproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.secondhumoproject.R
import java.lang.Exception

class Adapter(private val list: List<String>, private val side: Boolean= true) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class StrongHolder(view: View) : RecyclerView.ViewHolder(view) {
        var txt: TextView = view.findViewById(R.id.strong_chapter)
    }

    class WeakHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txt: TextView = view.findViewById(R.id.weak_chapter)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return when (viewType) {
            STRONG -> {
                val itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.strong_side, parent, false)
                StrongHolder(itemView)
            }

            WEAK -> {
                val itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.weak_side, parent, false)
                WeakHolder(itemView)
            }

            else -> throw Exception()
        }

    }

    override fun getItemViewType(position: Int): Int = if (side) {
        STRONG
    } else {
        WEAK
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is StrongHolder -> {
                holder.txt.text=list[position]
            }

            is WeakHolder -> {
                holder.txt.text=list[position]
            }
        }
    }

    companion object {
        const val STRONG = 1
        const val WEAK = 2
    }
}