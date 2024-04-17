package com.example.secondhumoproject.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.secondhumoproject.R
import com.example.secondhumoproject.data.item

class AdapterReport(private var list: List<item>) :
    RecyclerView.Adapter<AdapterReport.ReportHolder>() {
    class ReportHolder(view: View) : RecyclerView.ViewHolder(view) {
        var main_txt: TextView = view.findViewById(R.id.main_txt)
        val image: ImageView = view.findViewById(R.id.image)
        val cardView: CardView = view.findViewById(R.id.main_card)
        val image2: ImageView = view.findViewById(R.id.image2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReportHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.reports, parent, false)
        return ReportHolder(itemView)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ReportHolder, position: Int) {
        holder.main_txt.text = list[position].main_txt
        if (list[position].isAstro) {
            holder.image.setImageResource(R.drawable.user__8__1)
            holder.cardView.setCardBackgroundColor(Color.parseColor("#F6F5FB"))
            holder.image2.setImageResource(R.drawable.vector)
        } else if (list[position].isMonthly) {
            holder.image.setImageResource(R.drawable.calendar_1)
            holder.image2.setImageResource(R.drawable.vector)
            holder.cardView.setCardBackgroundColor(Color.parseColor("#F5F9F9"))
            holder.image2.setColorFilter(Color.parseColor("#479696"))
            holder.image.setColorFilter(Color.parseColor("#479696"))
        } else if (list[position].isDaily) {
            holder.image.setImageResource(R.drawable.check_square_1)
            holder.image2.setImageResource(R.drawable.vector)
            holder.cardView.setCardBackgroundColor(Color.parseColor("#FFF4F4"))
            holder.image2.setColorFilter(Color.parseColor("#FF5D50"))
        } else if (list[position].isLove) {

            holder.cardView.setCardBackgroundColor(Color.parseColor("#FDF9FB"))
            holder.image.setImageResource(R.drawable.heart__4__1)
            holder.image2.setImageDrawable(null)
        }

    }
}