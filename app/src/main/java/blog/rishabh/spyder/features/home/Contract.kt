package blog.rishabh.spyder.features.home

import blog.rishabh.spyder.models.AppData
import blog.rishabh.spyder.models.Error

interface Contract {
    interface Presenter {
        fun getAppsList(): ArrayList<AppData>
    }

    interface View {
        fun onGetAppsListStarted()
        fun onGetAppsListCompleted(apps: ArrayList<AppData>)
        fun onGetAppsListFailed(error: Error)
    }
}