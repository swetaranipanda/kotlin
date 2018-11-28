package com.kotlinproject.rxjava;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import rx.Observable;
import rx.Observer;


/**
 * Created by Swetarani Panda on 3/28/2018.
 */

public class ReactActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Observable.just("1", "2")
                .subscribe();
        Observer<String> stringObserver=new Observer<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {

            }
        };

    }
}
