package com.terryhuanghd.useragency.example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.terryhuanghd.useragency.UserAgency;
import com.terryhuanghd.useragency.UserApp.Chrome;
import com.terryhuanghd.useragency.UserApp.Firefox;
import com.terryhuanghd.useragency.UserApp.Safari;
import com.terryhuanghd.useragency.UserDevice.AndroidPhone;
import com.terryhuanghd.useragency.UserDevice.PC;
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
                .setDevice(new PC())
                .setApp(new Firefox())
                .getString());

        Log.e("UA", new UserAgency()
                .setDevice(new AndroidPhone())
                .setApp(new Chrome())
                .getString());

    }
}
