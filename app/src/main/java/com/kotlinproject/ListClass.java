package com.kotlinproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Swetarani Panda on 3/23/2018.
 */

public class ListClass extends Activity {
    final ArrayList<String> strings=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        strings.add("dvcdv");
//        strings=new ArrayList<>();
        List<String> lisyt= Collections.unmodifiableList(strings);

        lisyt.add("dv");
    }
}
