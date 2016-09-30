package qianfeng.broadcastcontext_application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/*
// 在广播接受者里面给intent添加一个Flag属性，使其设置启动模式为 NEW_TASK,即singleInstance,让Application开一个任务栈
 因为在默认情况下，Application是没有任务栈的，它的上下文是Application，并没有任务栈，而Activity只能在任务中开启另一个Activity，那怎么解决？
 只能是在Application里面开启一个任务栈了，那就用Flag属性，给Application开启一个任务栈，让它可以跳转到Main2Activity（Activity）
 要注意看 Application和Activity的关系，Activity直接继承的父类和Application是兄弟关系。所以
 */
public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Intent intent1 = new Intent(context, Main2Activity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);
    }
}
