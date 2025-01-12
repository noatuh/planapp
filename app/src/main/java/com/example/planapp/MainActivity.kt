package com.example.planapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.planapp.ui.theme.PlanappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlanappTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LiftSchedule(modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun LiftSchedule(modifier: Modifier = Modifier) {
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Sunday - Chest Supported Rows")
            Text(text = "Monday - Bench Press")
            Text(text = "Tuesday - Pullups")
            Text(text = "Wednesday - Landmine Press")
            Text(text = "Thursday - Chest Supported Rows")
            Text(text = "Friday - Bench Press")
            Text(text = "Saturday - Pullups")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LiftSchedulePreview() {
    PlanappTheme {
        LiftSchedule()
    }
}
