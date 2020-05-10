package com.example.w1d3_rxjavademo.inject

import com.example.w1d3_rxjavademo.network.remote.TicketRestService
import dagger.Module
import dagger.Provides

@Module
class RestModule {
    @Provides
    fun restService(): TicketRestService {

        return TicketRestService.instance
    }
}