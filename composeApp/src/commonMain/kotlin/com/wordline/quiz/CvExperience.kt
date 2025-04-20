package com.wordline.quiz

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CvExperience(cvData: CvData) {
    Column(
        verticalArrangement = Arrangement.spacedBy((-5).dp)
    ) {
        if (cvData.title != null) Text(text = cvData.title)
        Column(verticalArrangement = Arrangement.spacedBy(5f.dp)) {
            Text(text = "${cvData.company} | ${cvData.dateStart} - ${cvData.dateEnd}", fontSize = 15.sp)
            Column(verticalArrangement = Arrangement.spacedBy(3f.dp)) {
                for (elem in cvData.content) {
                    Text(
                        text = "• $elem",
                        fontSize = 14.sp,
                        lineHeight = 14.sp
                    )
                }
            }
        }
    }
}