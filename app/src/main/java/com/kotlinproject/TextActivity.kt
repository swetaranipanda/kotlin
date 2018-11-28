package com.kotlinproject

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

/**
 * Created by Swetarani Panda on 3/19/2018.
 */
class TextActivity : Activity() {
    var textView :TextView?=null
    var text :String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)
        textView=findViewById(R.id.text)
        text=intent.getStringExtra("text");
        textView?.setText(text)
    }
}