package com.tasnim.chowdhury.hiltnotification.viewModel

import android.annotation.SuppressLint
import android.app.Application
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val notificationBuilder: NotificationCompat.Builder,
    private val notificationManager: NotificationManagerCompat,
    private val application: Application
) : BaseViewModel(application){

    @SuppressLint("MissingPermission")
    fun showSimpleNotification() {
        notificationManager.notify(1, notificationBuilder.build())
    }

    @SuppressLint("MissingPermission")
    fun updateNotification() {
        notificationManager.notify(1, notificationBuilder
            .setContentTitle("New Title")
            .build())
    }

    @SuppressLint("MissingPermission")
    fun cancelNotification() {
        notificationManager.cancel(1)
    }

}