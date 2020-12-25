package com.terryhuanghd.useragency.example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.terryhuanghd.useragency.UserAgency;
import com.terryhuanghd.useragency.UserApp.Chrome;
import com.terryhuanghd.useragency.UserApp.Edge;
import com.terryhuanghd.useragency.UserApp.Firefox;
import com.terryhuanghd.useragency.UserApp.IE;
import com.terryhuanghd.useragency.UserApp.Safari;
import com.terryhuanghd.useragency.UserDevice.AndroidPhone;
import com.terryhuanghd.useragency.UserDevice.WindowsPC;
import com.terryhuanghd.useragency.UserDevice.iPad;
import com.terryhuanghd.useragency.UserDevice.iPhone;

public class UserAgencyExample extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Log.e("UA", new UserAgency()
                .setDevice(new iPhone())
                .setApp(new Safari())
                .getString());

        Log.e("UA", new UserAgency()
                .setDevice(new iPad())
                .setApp(new Edge())
                .getString());

        Log.e("UA", new UserAgency()
                .setDevice(new WindowsPC())
                .setApp(new Firefox())
                .getString());

        Log.e("UA", new UserAgency()
                .setDevice(new AndroidPhone())
                .setApp(new Chrome())
                .getString());

        Log.e("UA", new UserAgency()
                .setDevice(new WindowsPC())
                .setApp(new IE())
                .getString());
    }
}
