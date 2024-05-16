import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.jetbrains.compose.ui.tooling.preview.Preview

import presentation.screen.home.HomeScreen

val lightYellow = Color(0xFFFFEDBE);
val lightBlue = Color(0xFF0080A8)

@Composable
@Preview
fun App() {
    val lightColors = lightColorScheme(
        primary = lightBlue,
        onPrimary = lightYellow,
        primaryContainer = lightBlue,
        onPrimaryContainer = lightYellow
    )
    val darkColors = darkColorScheme(
        primary = lightBlue,
        onPrimary = lightYellow,
        primaryContainer = lightBlue,
        onPrimaryContainer = lightYellow
    )
    val colors by mutableStateOf(
        if (isSystemInDarkTheme()) darkColors else lightColors
    )
    MaterialTheme(colorScheme = colors) {
        Navigator(HomeScreen()) {
            SlideTransition(it)
        }
    }
}