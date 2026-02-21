package org.delcom.pam_p3_ifs23002_suku.ui.theme

import androidx.compose.ui.graphics.Color

/* BRAND COLORS: Tetap gunakan nama asli agar Theme.kt tidak error,
   tapi nilai warnanya kita ubah ke tema Suku (Cokelat & Emas).
*/
val PlantGreen = Color(0xFF5D4037)      // Diubah ke Cokelat Tua
val PlantGreenLight = Color(0xFF8D6E63)  // Diubah ke Cokelat Muda
val PlantGreenDark = Color(0xFF3E2723)   // Diubah ke Cokelat Gelap
val PlantAccent = Color(0xFFD4AF37)      // Diubah ke Emas Nusantara

val DelcomYellow = Color(0xFFD4AF37)
val DelcomYellowSoft = Color(0xFFFFF1C1)

/* =========================
   LIGHT THEME
   ========================= */
val md_theme_light_primary = PlantGreen
val md_theme_light_onPrimary = Color.White
val md_theme_light_primaryContainer = Color(0xFFFFDBCC)
val md_theme_light_onPrimaryContainer = Color(0xFF351000)

val md_theme_light_secondary = DelcomYellow
val md_theme_light_onSecondary = Color(0xFF2A1F00)
val md_theme_light_secondaryContainer = DelcomYellowSoft
val md_theme_light_onSecondaryContainer = Color(0xFF2A1F00)

val md_theme_light_tertiary = PlantGreenDark
val md_theme_light_onTertiary = Color.White

val md_theme_light_error = Color(0xFFBA1A1A)
val md_theme_light_onError = Color.White
val md_theme_light_errorContainer = Color(0xFFFFDAD6)
val md_theme_light_onErrorContainer = Color(0xFF410002)

val md_theme_light_background = Color(0xFFFFF8F6) // Background Krem Hangat
val md_theme_light_onBackground = Color(0xFF231A17)

val md_theme_light_surface = Color(0xFFFFFFFF)
val md_theme_light_onSurface = Color(0xFF231A17)

val md_theme_light_surfaceVariant = Color(0xFFF4DED5)
val md_theme_light_onSurfaceVariant = Color(0xFF53433F)

val md_theme_light_outline = Color(0xFF85736E)
val md_theme_light_inverseOnSurface = Color(0xFFFBEEEB)
val md_theme_light_inverseSurface = Color(0xFF362F2D)
val md_theme_light_inversePrimary = Color(0xFFFFB59D)
val md_theme_light_shadow = Color.Black
val md_theme_light_surfaceTint = PlantGreen

/* =========================
   DARK THEME
   ========================= */
val md_theme_dark_primary = PlantGreenLight
val md_theme_dark_onPrimary = Color.Black
val md_theme_dark_primaryContainer = Color(0xFF442B22)
val md_theme_dark_onPrimaryContainer = Color(0xFFFFDBCC)

val md_theme_dark_secondary = DelcomYellow
val md_theme_dark_onSecondary = Color(0xFF2A1F00)
val md_theme_dark_secondaryContainer = Color(0xFF564500)
val md_theme_dark_onSecondaryContainer = DelcomYellowSoft

val md_theme_dark_tertiary = PlantAccent
val md_theme_dark_onTertiary = Color.Black

val md_theme_dark_error = Color(0xFFFFB4AB)
val md_theme_dark_onError = Color(0xFF690005)
val md_theme_dark_errorContainer = Color(0xFF93000A)
val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)

val md_theme_dark_background = Color(0xFF231A17)
val md_theme_dark_onBackground = Color(0xFFEDE0DD)

val md_theme_dark_surface = Color(0xFF1B110E)
val md_theme_dark_onSurface = Color(0xFFEDE0DD)

val md_theme_dark_surfaceVariant = Color(0xFF53433F)
val md_theme_dark_onSurfaceVariant = Color(0xFFD8C2BB)

val md_theme_dark_outline = Color(0xFFA08D87)
val md_theme_dark_inverseOnSurface = Color(0xFF231A17)
val md_theme_dark_inverseSurface = Color(0xFFEDE0DD)
val md_theme_dark_inversePrimary = PlantGreen
val md_theme_dark_shadow = Color.Black
val md_theme_dark_surfaceTint = PlantGreenLight