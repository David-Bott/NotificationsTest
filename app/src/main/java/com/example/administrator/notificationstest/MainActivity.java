package com.example.administrator.notificationstest;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnNotTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNotTest = (Button)findViewById(R.id.btnNotific);
        btnNotTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createNotifications();
            }
        });
    }
    private void createNotifications() {
        //如果需要為通知加入震動的效果，一定要在應用程式設定檔中加入震動的授權設定

        final int notifyID = 1; // 通知的識別號碼
        final NotificationManager notificationManager = (NotificationManager)
                getSystemService(Context.NOTIFICATION_SERVICE); // 取得系統的通知服務
        //小圖示、標題、內文一定要設定 否則通知無法顯示
        final Notification notification = new Notification.Builder(getApplicationContext())
                .setSmallIcon(R.drawable.ic_stat_name)
                .setContentTitle("內容標題")
                .setContentText("內容文字")
                .build(); // 建立通知
        notificationManager.notify(notifyID, notification); // 發送通知
    }
}

