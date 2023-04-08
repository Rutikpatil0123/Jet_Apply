package com.example.jetapply

import android.R
import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.jetapply.ui.theme.JetApplyTheme


class WebActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetApplyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyContent()
                }
            }
        }
    }
}

@Composable
fun MyContent(){

    val context = LocalContext.current

    // Declare a string that contains a url

    val intent = (context as WebActivity).intent
    val mUrl = intent.getStringExtra("Url")


    // Adding a WebView inside AndroidView
    // with layout as full screen
    AndroidView(factory = {
        WebView(it).apply {
            this.clearCache(true)
            this.clearHistory()
            this.settings.javaScriptEnabled = true
            this.settings.javaScriptCanOpenWindowsAutomatically = true
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            webViewClient = WebViewClient()
            if (mUrl != null) {
                loadUrl(mUrl)
            }
        }
    }, update = {
        if (mUrl != null) {
            it.loadUrl(mUrl)
        }
    })
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    JetApplyTheme {
      MyContent()
    }
}