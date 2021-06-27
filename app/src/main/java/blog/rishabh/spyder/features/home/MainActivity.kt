package blog.rishabh.spyder.features.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import blog.rishabh.spyder.R
import blog.rishabh.spyder.models.AppData
import blog.rishabh.spyder.models.Error
import blog.rishabh.spyder.utils.PackageUtils

class MainActivity : AppCompatActivity(), Contract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onGetAppsListStarted() {

    }

    override fun onGetAppsListCompleted(apps: ArrayList<AppData>) {

    }

    override fun onGetAppsListFailed(error: Error) {

    }
}