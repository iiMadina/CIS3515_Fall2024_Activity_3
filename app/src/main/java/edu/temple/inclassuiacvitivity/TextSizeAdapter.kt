package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _numbers: Array<Integer>) : BaseAdapter() {
    private val context = _context
    private val numbers = _numbers

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
        return textView
    }

}