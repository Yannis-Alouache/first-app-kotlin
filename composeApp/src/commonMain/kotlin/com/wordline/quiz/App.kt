package com.wordline.quiz

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    val adeoExperience = CvData(
        "Développeur Fullstack",
        "Adeo",
        "01/09/2024",
        "01/09/2026",
        listOf(
            "Développement du produit OPUS-PUSH permettant la mise en avant des produits 1P/3P sur les différentes BUs Adeo (Leroy Merlin, BricoMan)",
            "Application du Test Driven Developpement",
            "Mise en place de solutions de tracking pour l'analyse des performances des campagnes marketing (Piano)",
        )
    )

    val falconMarketingExperience = CvData(
        "Développeur Web Fullstack",
        "Falcon Marketing",
        "01/09/2023",
        "28/06/2024",
        listOf(
            "Refonte du site web en nextJs",
            "Développement d'une application mobile de gamification pour optimiser les ventes des commerciaux"
        )
    )

    val esgiFormation = CvData(
        null,
        "ESGI",
        "2023",
        "2026",
        listOf(
            "Master Ingenierie du web",
        )
    )

    val btsFormation = CvData(
        null,
        "Gaston Berger",
        "2021",
        "2023",
        listOf(
            "Bts Sio SLAM",
        )
    )

    MaterialTheme {
        Scaffold(
            topBar = {TopBar()},
            drawerGesturesEnabled = true,
            drawerBackgroundColor = Color.Black,
            drawerContentColor = Color.White,
        ) {
                Column(
                    Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        verticalAlignment = Alignment.Top
                    ) {
                        Box(
                            modifier = Modifier.background(Color.Black)
                                .fillMaxHeight()
                                .width(Dp(30F))
                        ) {}
                        Box(
                            Modifier.fillMaxWidth()
                            .padding(Dp(18F))
                        ) {
                            Column(verticalArrangement = Arrangement.spacedBy(25.dp)) {
                                Text(
                                    text = "Yannis Alouache",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Black
                                )
                                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                                    Box(
                                        modifier = Modifier
                                            .background(Color(0xFF284861))
                                            .padding(8.dp)
                                    ) {
                                        Text(
                                            text = "Expériences",
                                            fontSize = 24.sp,
                                            color = Color.White
                                        )
                                    }
                                    Divider()
                                    CvExperience(adeoExperience)
                                    CvExperience(falconMarketingExperience)
                                }

                                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                                    Box(
                                        modifier = Modifier
                                            .background(Color(0xFF284861))
                                            .padding(8.dp)
                                    ) {
                                        Text(
                                            text = "Formations",
                                            fontSize = 24.sp,
                                            color = Color.White
                                        )
                                    }
                                    Divider()
                                    CvFormation(esgiFormation)
                                    CvFormation(btsFormation)
                                }



                                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                                    Box(
                                        modifier = Modifier
                                            .background(Color(0xFF284861))
                                            .padding(8.dp)
                                    ) {
                                        Text(
                                            text = "Compétences",
                                            fontSize = 24.sp,
                                            color = Color.White
                                        )
                                    }
                                    Divider()
                                    CvCompetence(listOf("NodeJs", "NestJs", "TDD", "Handlebars", "Datadog", "MongoDB"))
                                }
                            }
                        }
                    }
                }
        }
    }
}