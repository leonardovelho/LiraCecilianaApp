package com.velholeo.liracecilianaapp.di

import com.velholeo.liracecilianaapp.presentation.screens.login.LoginViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

object PresentationModules {
    val modules = listOf(
        module(createdAtStart = false) {
            viewModelOf(::LoginViewModel)
        }
    )
}