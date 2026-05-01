package com.velholeo.liracecilianaapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.serialization.SavedStateConfiguration
import com.velholeo.liracecilianaapp.presentation.navigation.AppRoute
import com.velholeo.liracecilianaapp.presentation.screens.login.LoginScreen
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

private val navConfig = SavedStateConfiguration {
    serializersModule = SerializersModule {
        polymorphic(NavKey::class) {
            subclass(AppRoute.LoginRoute::class, AppRoute.LoginRoute.serializer())
        }
    }
}

@Composable
@Preview
fun App() {
    LiraApplication {
        val backStack = rememberNavBackStack(navConfig, AppRoute.LoginRoute)
        NavDisplay(
            backStack = backStack,
            onBack = { backStack.removeLastOrNull() },
            entryProvider = entryProvider {
                entry<AppRoute.LoginRoute> {
                    LoginScreen(
                        onLogin = { /* TODO: navigate to home destination */ },
                    )
                }
            },
        )
    }
}
