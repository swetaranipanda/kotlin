package com.kotlinproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import java.io.IOException

class MainActivity : AppCompatActivity() {
    var a = 11;
    var convertString = "sweta";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        println("oncreate method");
        a.plus(11);
        a = Integer.parseInt("788");
//        print(a)
        var s1 = "Sweta is good"
        val s2 = "${s1.replace("is", "was")},but now  is $a"

//                s1="${s1.replace("is", "was")}, but now is $a"

        Log.i("a", s2);
//        print(s2)
        /*var sum = max(5, 6)
        print(sum);*/
        var nu = null;
        var re = nu + "dhb"

        /*   println(nu)
           Log.i("a", nu);

           print(re)
           Log.i("a", re);*/
        /* var  resu=nullCheck(null)
         Log.i("a",resu)*/
        var length = length("Sweta");
        var length2 = length(123);
//        Log.i("resulta", length.toString());
//        Log.i("resulta", (length2 as Int?).toString())
        //
        val items = listOf(2, "sandhya", 1, "sweta", "dananjay", "Anil", "Deekhshya", "Shruthi", "Rahul")
        for (item in items) {
            Log.i("item", item.toString())
//            println(item.toString() + "prnt");
            var ss = desc(item);
//            println(ss)
        }
        for (index in items.indices) {
            println("index : is $index ${items[index]}")
        }
//        inRange(3)
//        inRange(10)
        printloop(3)
        printloop(1)
//        val rectangle=Rectangle()
    }

    //if condition
    fun inRange(sw: Int) {
        if (sw in 1..5) {
            println("In range")
        }
    }

    //for loop
    fun printloop(range: Int) {
        for (range in 1..6 step 3) {
//         println(range)
        }
    }
    //extensions in Kotlin
/*
//before
Picasso.with(imageView.context).load(url).into(imageView)

//after extension function
fun ImageView.loadUrl(url: String) {
    Picasso.with(context).load(url).into(this)
}
imageView.loadUrl(url)

* */


    //use of Any super class
    fun length(obj: Any): Any? {
        if (obj is String) {
            return obj.length
        }
        if (obj is Int) {
            return 1;
        }
        return null
    }

    //Switch-case statement
    fun desc(item: Any) =
            when (item) {
                1 -> "integer"
                "Sandhya" -> "Tester"
                "Anil" -> "Oracle"
                "Dananjay" -> 5
                2 -> "Shruthi"
                else -> "donot know"

            }

    fun max(s: Int, t: Int): Int {
        return s + t
    }

    fun nullCheck(nullablestr: String?): String? {
        return nullablestr;
    }

    fun main(args: Array<String>) {
        println("main method");
    }

    //Try-catch  block
    fun blockCheck(): Any {
        var result: Any =
                try {
                    desc("string")
                } catch (e : IOException) {
                }
        return result;
    }

    //if statement
    fun ifClause(input: Any): Int {
        val result =
                if (input == "Sweta") {
                    return 1
                } else {
                    return 0
                }

    }

}
