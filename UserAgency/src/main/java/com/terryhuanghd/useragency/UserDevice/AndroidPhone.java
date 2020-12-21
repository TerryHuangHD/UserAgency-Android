package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.UserApp;

import java.lang.ref.WeakReference;

public class AndroidPhone implements UserDevice {
    WeakReference<UserApp> userApp;

    String osVersion = "11";
    String deviceId = "";

    /*
    Chrome
    Linux; Android {$osVersion}
    Linux; Android {$osVersion}; {$deviceId}
    FireFox
    Android {$osVersion}; Mobile;
    Android {$osVersion}; Mobile; {$deviceId};
    Edge
    Linux; Android {$osVersion}
    Linux; Android {$osVersion}; {$deviceId}
    */

    @Override
    public void setUserApp(UserApp app) {
        userApp = new WeakReference<>(app);
    }

    @Override
    public String getResultSystemInformation() {
        UserApp app = userApp.get();

        return String.format("Linux; Android %s%s",
                osVersion,
                deviceId);
    }
}

