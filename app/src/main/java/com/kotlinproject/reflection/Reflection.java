package com.kotlinproject.reflection;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.kotlinproject.R;

/**
 * Created by Swetarani Panda on 3/30/2018.
 */

public class Reflection extends Activity{
    private String name="Sweta";
    TextView txt1,txt3,txt2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflection);
         txt1=findViewById(R.id.textView);
         txt2=findViewById(R.id.textView2);
         txt3=findViewById(R.id.textView3);

    }
        public void method1(int a,String s)  throws Exception {
            Log.i("1",String.valueOf(a) + " " + s);
            txt1.setText(s);
        }
        public void method2() throws Exception {
            Log.i("2",name);
            txt2.setText(name);

        }
        private void method3(int q)   throws Exception{
            Log.i("3",String.valueOf(q));
            txt3.setText(String.valueOf(q));
        }


}
