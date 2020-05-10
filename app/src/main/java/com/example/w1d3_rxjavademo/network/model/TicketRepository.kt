package com.example.w1d3_rxjavademo.network.model

import dagger.Provides
import io.reactivex.Single

interface TicketRepository {

    fun getTicketsList(from: String, to: String): Single<MutableList<Ticket>>
    fun getPriceList(flightNumber: String, from: String, to: String): Single<Price>
}