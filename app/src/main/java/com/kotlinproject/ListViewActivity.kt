package com.kotlinproject

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class ListViewActivity : Activity(), View.OnClickListener {

    var rcv: ListView? = null
    var imageButton: Button? = null
    var textBtn: Button? = null
    var textEt: EditText? = null
    var list = ArrayList<String>()
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
        rcv = findViewById(R.id.recyclerview);
        var a = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
        if (a != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(arrayOf(Manifest.permission.CAMERA), 0)
        }
        initUI()
        initList()
        setAdapter()
    }

    fun initList() {
        list.add("SWETA")
        list.add("Dananajay")
        list.add("Rahul")
        list.add("Shiva")
        list.add("Anil")
        list.add("Shruthi")
        list.add("Sandhya")
        list.add("Deekhsya")
        list.add("SWETA")
        list.add("Dananajay")
        list.add("Rahul")
        list.add("Shiva")
        list.add("Anil")
        list.add("Shruthi")
        list.add("Sandhya")
        list.add("Deekhsya")
        list.add("SWETA")
        list.add("Dananajay")
        list.add("Rahul")
        list.add("Shiva")
        list.add("Anil")
        list.add("Shruthi")
        list.add("Sandhya")
        list.add("Deekhsya")
    }

    fun setAdapter() {
        var adapter = Adapter(this, list)
        rcv!!.adapter = adapter
    }

    fun initUI() {
        imageButton = findViewById(R.id.imagebtn)
        textBtn = findViewById(R.id.textbtn)
        textEt = findViewById(R.id.text_et)

        imageButton?.setOnClickListener(this)
        textBtn?.setOnClickListener(this)
    }

    fun sum(): Any {
        var cons = 20
        var text = textEt!!.text.toString()
        var result = cons + Integer.parseInt(text)
        return result
    }

    override fun onClick(v: View) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when (v.id) {
            R.id.imagebtn -> {
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.textbtn -> {
//                var text: String = textEt!!.text.toString()
                var text: Any = sum()
                var intent = Intent(this, TextActivity::class.java)
                intent.putExtra("text", text.toString())
                startActivity(intent)
            }

        }

    }

    class Adapter : BaseAdapter {
        var mContext: Context;
        var list: ArrayList<String>

        constructor(context: Context, list1: ArrayList<String>) {
            this.list = list1
            this.mContext = context
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            var view: View? = convertView;
            if (view == null) {
                var inflater: LayoutInflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                view = inflater.inflate(R.layout.list_item, parent, false)
            }
            var nameTxt: TextView
            nameTxt = view!!.findViewById(R.id.name_tv)
            if (list.get(position).contentEquals("SWETA")) {
                nameTxt.setTextColor(mContext.resources.getColor(R.color.colorAccent))
            } else {
                nameTxt.setTextColor(mContext.resources.getColor(R.color.colorPrimary))

            }
            nameTxt.setText(list.get(position))
            view.setOnClickListener {
                mContext.startActivity(Intent(mContext, RecyclerVIewActivity::class.java))
            }
            return view
        }

        override fun getItem(position: Int): Any {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return list.get(position)
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getCount(): Int {
            return list.size
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}
