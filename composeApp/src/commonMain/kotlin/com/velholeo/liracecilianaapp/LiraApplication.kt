package com.velholeo.liracecilianaapp

import androidx.compose.runtime.Composable
import com.velholeo.liracecilianaapp.di.PresentationModules
import com.velholeo.liracecilianaapp.presentation.theme.LiraCecilianaTheme
import org.koin.compose.KoinApplication

@Composable
fun LiraApplication(content: @Composable () -> Unit) {
    KoinApplication(
        application = {
            modules(
                PresentationModules.modules,
            )
        }
    ) {
        LiraCecilianaTheme {
            content()
        }
    }
}