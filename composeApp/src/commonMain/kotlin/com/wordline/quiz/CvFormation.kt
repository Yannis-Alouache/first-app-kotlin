package com.wordline.quiz

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CvFormation(cvData: CvData) {
    Column(
        modifier = Modifier.padding(start = 10.dp),
        verticalArrangement = Arrangement.spacedBy((-5).dp)
    ) {
        Text(text = "${cvData.company} ${cvData.dateStart} - ${cvData.dateEnd}")
        for (elem in cvData.content) {
            Text(
                text = elem,
                fontSize = 13.sp,
                lineHeight = 13.sp
            )
        }
    }
}