package com.example.bushramohamed.playmysong;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by bushramohamed on 2015-03-16.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(null,MyService.class);
        context.startService(i);
    }
}
