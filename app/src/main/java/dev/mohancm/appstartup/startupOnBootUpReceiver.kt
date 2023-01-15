package dev.mohancm.appstartup

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class startupOnBootUpReceiver : BroadcastReceiver() {

    private val TAG = "AppOnStartup"
    override fun onReceive(context: Context, intent: Intent) {
        Log.v(TAG, "Receive broadcast");
        if (Intent.ACTION_BOOT_COMPLETED == intent.action) {
            Log.d(TAG, "Received boot completed broadcast");
            val activityIntent = Intent(context, MainActivity::class.java)
            activityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(activityIntent)
        }
    }
}