package com.caminoalboss

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    val parchment = Brush.verticalGradient(listOf(Color(0xFF5A4A35), Color(0xFF2E251B)))

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(parchment)
            .padding(horizontal = 16.dp, vertical = 20.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFFCFB086))
                .border(3.dp, Color(0xFF4D3721), RoundedCornerShape(20.dp))
                .padding(18.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "⚔️", fontSize = 72.sp)
            Text(
                text = "SALUD DEL JEFE (Nivel 10 - Dragón Ancestral)",
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xFF2B1C11),
                modifier = Modifier.padding(top = 6.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            LinearProgressIndicator(
                progress = { 1f },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(24.dp)
                    .clip(RoundedCornerShape(100.dp)),
                color = Color(0xFF8A0E13),
                trackColor = Color(0xFFC89A9A)
            )

            Text(
                text = "HP: 10.000 / 10.000",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF7D0C0C),
                modifier = Modifier.padding(top = 8.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFFE9D5AF))
                    .border(3.dp, Color(0xFF5A3E27), RoundedCornerShape(8.dp))
                    .padding(vertical = 24.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("PASOS DE HOY", fontSize = 36.sp, color = Color(0xFF2B1C11), fontWeight = FontWeight.SemiBold)
                    Text("1500", fontSize = 62.sp, color = Color(0xFF100D0B), fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.height(26.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                MiniShield("AYER", false)
                MiniShield("HOY", true)
                MiniShield("MAÑANA", false)
            }

            Spacer(modifier = Modifier.height(28.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                BottomTab("COMBATE")
                BottomTab("HOGAR")
                BottomTab("PERFIL")
            }
        }
    }
}

@Composable
private fun MiniShield(label: String, selected: Boolean) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(if (selected) 78.dp else 56.dp)
                .clip(RoundedCornerShape(18.dp))
                .background(if (selected) Color(0xFFC79A1A) else Color(0xFFB4B0A2))
                .border(2.dp, Color(0xFF4D3721), RoundedCornerShape(18.dp))
        )
        Text(
            text = label,
            fontSize = if (selected) 30.sp else 24.sp,
            fontWeight = FontWeight.Black,
            color = Color(0xFF1D120A),
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
private fun BottomTab(label: String) {
    Box(
        modifier = Modifier
            .width(105.dp)
            .height(80.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFD2B37C))
            .border(2.dp, Color(0xFF4D3721), RoundedCornerShape(8.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            fontSize = 16.sp,
            color = Color(0xFF211208),
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, device = "spec:width=411dp,height=891dp")
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
