package com.example.w1d3_rxjavademo.inject

import com.example.w1d3_rxjavademo.network.model.TicketRepositoryImpl
import com.example.w1d3_rxjavademo.network.remote.TicketRestService
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepositoryModule(ticketRestService: TicketRestService): TicketRepositoryImpl {
        return TicketRepositoryImpl(ticketRestService)
    }

}