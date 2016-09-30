package qianfeng.broadcastcontext_application;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyReceiver2 receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter();
        filter.addAction("android.456");
        receiver = new MyReceiver2();
        registerReceiver(receiver,filter);
    }

    public void click1(View view) { // 清单文件中注册

        sendBroadcast(new Intent("android.123"));

    }

    public void click2(View view) {  // 动态注册

        sendBroadcast(new Intent("android.456"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}
