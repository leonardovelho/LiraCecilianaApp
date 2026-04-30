package com.velholeo.liracecilianaapp.presentation.designsystem

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.velholeo.liracecilianaapp.presentation.theme.NavyAccent
import com.velholeo.liracecilianaapp.presentation.theme.NavyFg
import com.velholeo.liracecilianaapp.presentation.theme.NavyFgSoft
import com.velholeo.liracecilianaapp.presentation.theme.NavyMuted
import com.velholeo.liracecilianaapp.presentation.theme.NavyOnAccent

object LiraTextStyles {
    val wordmark = TextStyle(
        color = NavyFg,
        fontSize = 38.sp,
        fontWeight = FontWeight.Medium,
    )

    val titleLarge = TextStyle(
        color = NavyFg,
        fontSize = 28.sp,
        fontWeight = FontWeight.SemiBold,
    )

    val titleMedium = TextStyle(
        color = NavyFg,
        fontSize = 22.sp,
        fontWeight = FontWeight.SemiBold,
    )

    val bodyLarge = TextStyle(
        color = NavyFg,
        fontSize = 17.sp,
    )

    val bodyMedium = TextStyle(
        color = NavyFg,
        fontSize = 14.sp,
    )

    val tagline = TextStyle(
        color = NavyFgSoft,
        fontSize = 17.sp,
        fontStyle = FontStyle.Italic,
    )

    val caption = TextStyle(
        color = NavyFgSoft,
        fontSize = 12.sp,
    )

    val captionItalic = TextStyle(
        color = NavyFgSoft,
        fontSize = 12.sp,
        fontStyle = FontStyle.Italic,
    )

    val metaLabel = TextStyle(
        color = NavyMuted,
        fontSize = 10.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 3.sp,
    )

    val fieldLabel = TextStyle(
        color = NavyMuted,
        fontSize = 11.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 1.4.sp,
    )

    val footerNote = TextStyle(
        color = NavyMuted,
        fontSize = 11.sp,
        fontStyle = FontStyle.Italic,
    )

    val buttonAction = TextStyle(
        color = NavyOnAccent,
        fontSize = 15.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 1.5.sp,
    )

    val buttonInline = TextStyle(
        color = NavyMuted,
        fontSize = 11.sp,
    )

    val link = TextStyle(
        color = NavyAccent,
        fontSize = 12.sp,
        fontStyle = FontStyle.Italic,
    )
}
