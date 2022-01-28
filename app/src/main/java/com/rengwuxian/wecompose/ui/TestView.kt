package com.rengwuxian.wecompose.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rengwuxian.wecompose.ui.theme.WeComposeTheme

/**
 *
 *
 * @auth xingqiu.zhong
 * @date 2022/1/28
 */

@Composable
fun TestProvider() {
    Column(
        Modifier
            .fillMaxWidth()
            .background(WeComposeTheme.colors.background)
    ) {
        Text(text = "text first", Modifier.padding(5.dp), fontSize = 18.sp)
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text("3 minutes ago", style = MaterialTheme.typography.body2)
        }
        Box(
            Modifier
                .fillMaxWidth(0.8f)
                .background(WeComposeTheme.colors.bottomBar)
                .padding(10.dp)
                .clickable { }
        ) {
            Text(text = "text 2", Modifier.padding(5.dp), fontSize = 18.sp)
            Text(
                text = "text 3223",
                Modifier
                    .padding(5.dp)
                    .align(Alignment.BottomCenter),
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun LayoutsCodelab() {
    Scaffold(
        topBar = {
            Text(
                text = "LayoutsCodelab",
                style = MaterialTheme.typography.h3
            )
        }) { innerPadding ->
        BodyContent(Modifier.padding(innerPadding))
    }
}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hi there!")
        Text(text = "Thanks for going through the Layouts codelab")
    }
}


@Preview
@Composable
fun TestProviderPreview() {
    WeComposeTheme {
        TestProvider()
    }
}

@Preview
@Composable
fun LayoutsCodelabPreview() {
    LayoutsCodelab()
}