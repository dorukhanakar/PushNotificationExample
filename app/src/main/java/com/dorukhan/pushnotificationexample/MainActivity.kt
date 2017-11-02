package com.dorukhan.pushnotificationexample

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notificationbutton.setOnClickListener {

            val NotificationIntent = Intent()
            val pendingIntent = PendingIntent.getActivity(this@MainActivity, 0, intent, 0)

            val notification = Notification.Builder(this@MainActivity)
                    .setTicker("")
                    .setContentTitle("Notification")
                    .setContentText("Hello World")
                    .setSmallIcon(R.drawable.notification_icon_background)
                    .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0, notification)

        }
    }
}
