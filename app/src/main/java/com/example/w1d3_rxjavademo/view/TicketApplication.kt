package com.example.w1d3_rxjavademo.view

import android.app.Application
import com.example.w1d3_rxjavademo.inject.*


class TicketApplication:Application() {

    // Instance of the AppComponent that will be used by all the Activities in the project
    val appComponent by lazy {
        // Creates an instance of AppComponent using its Factory constructor
        // We pass the applicationContext that will be used as Context in the graph
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .viewModelModule(ViewModelModule())
            .restModule(RestModule())
            .repositoryModule(RepositoryModule())
            .build()

    }

/*    override fun onCreate() {
        super.onCreate()
        //todo init dagger graph
        component =  DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .repositoryModule(RepositoryModule())
            .restModule(RestModule())
            .viewModelModule(ViewModelModule())
            .build()
    }
    companion object {
        lateinit var component: TicketApplication
    }*/


}