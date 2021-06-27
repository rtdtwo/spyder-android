package blog.rishabh.spyder

import android.app.Application

class SpyderApplication : Application() {
    companion object {
        lateinit var INSTANCE: SpyderApplication
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}