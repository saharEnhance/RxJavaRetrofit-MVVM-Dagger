package com.example.w1d3_rxjavademo.network.model

import com.example.w1d3_rxjavademo.network.remote.TicketRestService
import dagger.Provides
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

open class TicketRepositoryImpl @Inject constructor(private val ticketRestService: TicketRestService) :
    TicketRepository {
    override fun getTicketsList(from: String, to: String): Single<MutableList<Ticket>> {
        return ticketRestService
            .getTickets(from, to)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
    override fun getPriceList(
        flightNumber: String,
        from: String,
        to: String
    ): Single<Price> {
        return ticketRestService
            .getPrice(flightNumber, from, to)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}

