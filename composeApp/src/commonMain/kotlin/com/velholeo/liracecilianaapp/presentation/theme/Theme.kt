package com.velholeo.liracecilianaapp.presentation.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LiraCecilianaLightColors = lightColorScheme(
    primary = NavyAccent,
    onPrimary = NavyOnAccent,
    primaryContainer = NavyAccentWash,
    onPrimaryContainer = NavyFg,
    secondary = NavyAccent,
    onSecondary = NavyOnAccent,
    background = NavyCanvas,
    onBackground = NavyFg,
    surface = NavySurface,
    onSurface = NavyFg,
    surfaceVariant = NavyAccentWash,
    onSurfaceVariant = NavyFgSoft,
    outline = NavyBorderStrong,
    outlineVariant = NavyBorder,
    error = NavyDanger,
    onError = NavyOnAccent,
)

@Composable
fun LiraCecilianaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LiraCecilianaLightColors,
        content = content,
    )
}
