package com.example.hl.swa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ForecastAdapter(context: SwaForecastActivity) : BaseAdapter() {
//    var forecastData = null
    val forecastData = arrayOf("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen")
    private val mInflator: LayoutInflater

    init {
        this.mInflator = LayoutInflater.from(context)
//        forecastData = data
    }

    override fun getCount(): Int {
        return forecastData.size
    }

    override fun getItem(position: Int): Any {
        return forecastData[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val view: View?
//        val vh: ListRowHolder
//        if (convertView == null) {
            view = this.mInflator.inflate(R.layout.forecast_row, parent, false)
//            vh = ListRowHolder(view)
//            view.tag = vh
//        } else {
//            view = convertView
//            vh = view.tag as ListRowHolder
//        }
//
//        vh.label.text = sList[position]
        return view
    }
}
