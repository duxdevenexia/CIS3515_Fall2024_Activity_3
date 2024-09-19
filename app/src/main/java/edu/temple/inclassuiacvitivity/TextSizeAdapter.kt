package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView



class TextSizeAdapter(private val context: Context, private val numbers: Array<Int>) : BaseAdapter() {

    /*
    // initial ary
    private val ary: List<Int> = mutableListOf()
     */

    override fun getCount(): Int {

        return numbers.size
    }

    override fun getItem(position: Int): Any {
        return numbers[position]
    }

    override fun getItemId(position: Int): Long = numbers[position].toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
        val view: View = convertView ?: LayoutInflater.from(parent?.context)
            .inflate(android.R.layout.simple_spinner_item, parent, false)

        val item = getItem(position)

        val textView = view


        return view
    }

}