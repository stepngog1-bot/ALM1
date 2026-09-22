package com.m3e.almas.realv5;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
  private WebView webView;
  @Override public void onCreate(Bundle state) {
    super.onCreate(state);
    webView = new WebView(this);
    setContentView(webView);
    WebSettings s = webView.getSettings();
    s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setDatabaseEnabled(true);
    s.setAllowFileAccess(true); s.setAllowContentAccess(true); s.setCacheMode(WebSettings.LOAD_NO_CACHE);
    webView.setWebViewClient(new WebViewClient()); webView.setWebChromeClient(new WebChromeClient());
    WebView.setWebContentsDebuggingEnabled(true); webView.clearCache(true);
    webView.loadUrl("file:///android_asset/www/index.html?v=8-visual");
  }
  @Override public void onBackPressed() {
    if (webView != null) webView.evaluateJavascript("if(window.m3eGoBack){window.m3eGoBack();true}else{false}", null);
    else super.onBackPressed();
  }
  @Override protected void onDestroy() { if (webView != null) { webView.destroy(); webView = null; } super.onDestroy(); }
}
