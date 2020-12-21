package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.UserApp;

import java.lang.ref.WeakReference;

public class PC implements UserDevice {
    WeakReference<UserApp> userApp;

    String osVersion = "10.0";

    /*
    Chrome
    Windows NT {$osVersion}; Win64; x64
    Windows NT {$osVersion}; WOW64
    Windows NT {$osVersion}
    FireFox
    Windows NT {$osVersion}; Win64; x64
    Edge
    Windows NT {$osVersion}; Win64; x64
    IE
    Windows NT {$osVersion}; WOW64;
    */

    @Override
    public void setUserApp(UserApp app) {
        userApp = new WeakReference<>(app);
    }

    @Override
    public String getResultSystemInformation() {
        UserApp app = userApp.get();

        return String.format("Windows NT %s; Win64; x64",
                osVersion);
    }
}
