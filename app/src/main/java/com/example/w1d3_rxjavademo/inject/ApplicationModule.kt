package com.example.w1d3_rxjavademo.inject

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule (val context: Context){
    @Provides
    @Singleton
    fun provideApplicationContext():Context{
        return context
    }
}