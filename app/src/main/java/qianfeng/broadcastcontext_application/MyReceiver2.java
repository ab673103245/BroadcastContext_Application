package qianfeng.broadcastcontext_application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver2 extends BroadcastReceiver {
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        context.startActivity(new Intent(context,Main2Activity.class));
    }
}
