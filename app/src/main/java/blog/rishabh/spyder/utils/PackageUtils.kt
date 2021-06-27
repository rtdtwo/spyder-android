package blog.rishabh.spyder.utils

import android.content.pm.PackageManager
import blog.rishabh.spyder.SpyderApplication
import blog.rishabh.spyder.models.AppData

object PackageUtils {
    private val packageManager: PackageManager = SpyderApplication.INSTANCE.packageManager

    fun getAllApps(): ArrayList<AppData> {
        val installedPackagesList = ArrayList<AppData>()
        val packages = packageManager.getInstalledPackages(PackageManager.GET_META_DATA or PackageManager.GET_PERMISSIONS)
        for (pack in packages) {
            val packageInfo = packageManager.getApplicationInfo(pack.packageName, PackageManager.GET_META_DATA)
            val permissions = pack.requestedPermissions

            val appData = AppData()
            appData.packageName = pack.packageName
            appData.appName = packageManager.getApplicationLabel(packageInfo).toString()
            appData.appIcon = packageInfo.loadIcon(packageManager)
            if (!permissions.isNullOrEmpty()) {
                appData.permissions.addAll(permissions)
            }
            installedPackagesList.add(appData)
        }
        return installedPackagesList
    }
}