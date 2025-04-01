package com.codeboost.android

import android.os.SystemClock
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun  CodeBoostAppScreen(){
    val data = remember { mutableStateListOf("Item 1", "Item 2", "Item 3") }
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        itemsIndexed(data){ _,item->
            Text(
                text = item,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                style = MaterialTheme.typography.headlineSmall
            )

        }

    }
    val startTime = SystemClock.elapsedRealtime()

// Your code block you want to measure
//    performHeavyOperation()

    val endTime = SystemClock.elapsedRealtime()
    val executionTime = endTime - startTime
    println("Execution Time: $executionTime ms")
}

@Composable
@Preview(showBackground = true)
fun  CodeBoostAppScreenPreview(){
    CodeBoostAppScreen()
}