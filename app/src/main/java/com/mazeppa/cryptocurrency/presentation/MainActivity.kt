package com.mazeppa.cryptocurrency.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mazeppa.cryptocurrency.presentation.ui.theme.CryptoCurrencyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoCurrencyTheme {

            }
        }
    }
}