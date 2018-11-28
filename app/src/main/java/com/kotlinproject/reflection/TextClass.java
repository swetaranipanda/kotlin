package com.kotlinproject.reflection;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Swetarani Panda on 3/30/2018.
 */

public class TextClass extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            reflect();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            Log.i("exception", String.valueOf(e.getCause()));
        } catch (NoSuchMethodException e) {
            Log.i("exception2", String.valueOf(e.getCause()));

        } catch (IllegalAccessException e) {
            Log.i("exception3", String.valueOf(e.getCause()));

        }
    }

    public void reflect() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Reflection clasObj = new Reflection();
        Class clas = clasObj.getClass();
        Method[] methods = clas.getMethods();
        for (Method method : methods) {
            Log.i("method", method.getName());

        }
        Method field = clas.getDeclaredMethod("method1", int.class, String.class);
        field.invoke(clasObj, 15, "dj");
        Method field2 = clas.getDeclaredMethod("method3", int.class);
        field2.setAccessible(true);
        field2.invoke(clasObj, 20);
        /*Field stringVar = clas.getDeclaredField("name");
        stringVar.setAccessible(true);
        stringVar.set(clasObj, "Sofi");*/
        Method field3 = clas.getDeclaredMethod("method2");
        field3.invoke(clasObj);


    }
}
