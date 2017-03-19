package com.example.lsh.xxutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.luoshihai.xxutils.BarUtils;
import com.luoshihai.xxutils.NetworkUtils;
import com.luoshihai.xxutils.ScreenUtils;
import com.luoshihai.xxutils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        BarUtils.hideStatusBar(this);
        setContentView(R.layout.activity_main);
        Utils.init(this);
        int screenWidth = ScreenUtils.getScreenWidth();
        int statusBarHeight = BarUtils.getStatusBarHeight(this);
        BarUtils.setTransparentStatusBar(this);
//        Toast.makeText(this, "statusBarHeight:" + statusBarHeight, Toast.LENGTH_SHORT).show();
//        NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType();
//        Toast.makeText(this, "networkType:" + networkType, Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "screenWidth:" + screenWidth, Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, NetworkUtils.getNetworkOperatorName(), Toast.LENGTH_SHORT).show();
//        NetworkUtils.openWirelessSettings();
        Toast.makeText(this, NetworkUtils.getIPAddress(true), Toast.LENGTH_SHORT).show();
    }
}
