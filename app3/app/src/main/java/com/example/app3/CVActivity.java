package com.example.app3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CVActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //webView.clearCache(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);

        String url = getIntent().getStringExtra("url");

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}
