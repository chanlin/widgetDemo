package com.chanlin.widgetdemo;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViewsService;


@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MyRemoteViewsService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {

        return new MyRemoteViewsFactory(this.getApplicationContext(), intent);
    }

}