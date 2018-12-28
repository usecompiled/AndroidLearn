package com.zhongchen.pic.utils

import android.app.Activity

import java.util.ArrayList

object ActivityCollector {

    var activities: MutableList<Activity> = ArrayList()

    fun addActivity(activity: Activity) {
        activities.add(activity)
    }

    fun removeActivity(activity: Activity) {
        activities.remove(activity)
    }

    fun finshAll() {
        for (activity in activities) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
    }
}
