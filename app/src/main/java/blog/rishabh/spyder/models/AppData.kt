package blog.rishabh.spyder.models

import android.graphics.drawable.Drawable

class AppData {
    var packageName: String? = null
    var appName: String? = null
    var appIcon: Drawable? = null
    val permissions = ArrayList<String>()
}