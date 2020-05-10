package com.example.w1d3_rxjavademo.inject

import com.example.w1d3_rxjavademo.network.model.TicketRepository
import com.example.w1d3_rxjavademo.viewmodel.TicketViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {
    @Provides
    fun providesFactory(ticketRepository: TicketRepository): TicketViewModelFactory {
        return TicketViewModelFactory(ticketRepository)


    }
}