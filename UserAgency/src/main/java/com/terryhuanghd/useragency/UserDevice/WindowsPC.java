package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.UserApp;

import java.lang.ref.WeakReference;

public class WindowsPC implements UserDevice {
    WeakReference<UserApp> userApp;

    String osVersion = "10.0";

    /*
    // Chrome / FireFox / Edge / IE
    Windows NT {$osVersion}; Win64; x64
    Windows NT {$osVersion}; WOW64
    Windows NT {$osVersion}
    */

    @Override
    public void setUserApp(UserApp app) {
        userApp = new WeakReference<>(app);
    }

    @Override
    public String getResultSystemInformation() {
        UserApp app = userApp.get();

        if (app == null) {
            return "";
        }

        return String.format("Windows NT %s; Win64; x64",
                osVersion);
    }
}
