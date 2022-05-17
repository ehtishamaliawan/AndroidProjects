package com.freetoreads.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Web_View extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        Button btn = findViewById(R.id.search);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               EditText editText = findViewById(R.id.site);
               String url = editText.getText().toString();
               url = "https://" + url;
               WebView mWebView = findViewById(R.id.webView);
               mWebView.setWebViewClient(new WebViewClient());
               WebSettings webSettings = mWebView.getSettings();
               webSettings.setJavaScriptEnabled(true);
               mWebView.loadUrl(url);
           }
       });

    }
}