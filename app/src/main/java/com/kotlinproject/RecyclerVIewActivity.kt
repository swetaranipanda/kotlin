package com.kotlinproject

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

/**
 * Created by Swetarani Panda on 3/20/2018.
 */

class RecyclerVIewActivity : Activity() {
    lateinit var rcv: RecyclerView;
    var list = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        rcv = findViewById(R.id.rcv)
        initList()
        setAdapter()
    }

    fun initList() {
        list.add("MSYS")
        list.add("Digifutura")
        list.add("Trisys")
        list.add("Ninja")
        list.add("Myntra")
        list.add("Flipkart")
        list.add("Amazon")
        list.add("Snapdeal")
    }

    fun setAdapter() {
       var staggeredlayoutmanager=StaggeredGridLayoutManager(1,0)
        rcv.layoutManager=staggeredlayoutmanager
        var adapter = Adapter(list, this)
        rcv.adapter = adapter
    }

    class ViewHolder(itemView: View, list: ArrayList<String>, context: Context) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var contex = context
        var data = list
        var tx: TextView
        init {
            tx = itemView.findViewById(R.id.name_tv)
        }

        override fun onClick(v: View?) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            Toast.makeText(contex, data.get(itemId.toInt()), Toast.LENGTH_SHORT).show()
        }
    }

    class Adapter(list: ArrayList<String>, context: Context) : RecyclerView.Adapter<ViewHolder>() {
        var arraylist = list
        var ctx = context
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            holder.tx.setText(arraylist.get(position))
        }

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            var view = LayoutInflater.from(ctx).inflate(R.layout.list_item, parent, false)
            return ViewHolder(view, arraylist, ctx)
        }

        override fun getItemCount(): Int {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return arraylist.size
        }

    }
}