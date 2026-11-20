package com.doundupe.fleasionandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                FleasionApp()
            }
        }
    }
}

@Composable
private fun FleasionApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Fleasion",
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = "Roblox asset tools for Android",
                style = MaterialTheme.typography.bodyLarge
            )
            Card {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Setup in progress",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = "The Android shell is ready. The Python backend and networking layer will be connected in later steps.",
                        modifier = Modifier.padding(top = 8.dp),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}
