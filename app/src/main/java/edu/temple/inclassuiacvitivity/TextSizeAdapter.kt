package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(context: Context, numbers: Array<Int>) : BaseAdapter() {
    private val context = context
    private val numbers = numbers

    override fun getCount(): Int {
        return numbers.size
    }

    override fun getItem(position: Int): Any {
        return numbers[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView
        if (convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context)
        }
        textView.textSize = getItem(position).toString().toFloat()
        textView.text = getItem(position).toString()
        return textView
    }

}