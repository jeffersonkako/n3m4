package com.example.doma.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun DomaTheme(content: @Composable () -> Unit) {
    MaterialTheme {
        content()
    }
}
