package com.example.w1d3_rxjavademo.inject

import com.example.w1d3_rxjavademo.network.model.TicketRepositoryImpl
import com.example.w1d3_rxjavademo.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules=[RepositoryModule::class, RestModule::class, ViewModelModule::class,ApplicationModule::class])
interface AppComponent {

   fun inject(mainActivity: MainActivity)

    //fun ticketRepositoryImpl(): TicketRepositoryImpl


}