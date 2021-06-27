package blog.rishabh.spyder.features.home

import blog.rishabh.spyder.models.AppData
import blog.rishabh.spyder.utils.PackageUtils

class Presenter(private val view: Contract.View): Contract.Presenter {
    override fun getAppsList(): ArrayList<AppData> {
        view.onGetAppsListStarted()

        return PackageUtils.getAllApps()
    }
}