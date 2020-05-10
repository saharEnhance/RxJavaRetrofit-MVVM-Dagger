package com.example.w1d3_rxjavademo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.w1d3_rxjavademo.network.model.TicketRepository
import com.example.w1d3_rxjavademo.network.model.TicketRepositoryImpl

class TicketViewModelFactory(private val ticketRepository: TicketRepositoryImpl):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TicketViewModel(ticketRepository) as T
    }
}