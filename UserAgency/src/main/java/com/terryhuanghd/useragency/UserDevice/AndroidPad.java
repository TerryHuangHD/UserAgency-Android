package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.Firefox;
import com.terryhuanghd.useragency.UserApp.UserApp;

import java.lang.ref.WeakReference;

public class AndroidPad implements UserDevice {
    WeakReference<UserApp> userApp;

    String osVersion = "11";

    /*
    // Chrome
    Linux; Android {$osVersion}
    Linux; Android {$osVersion}; {$deviceId}
    // FireFox
    Android {$osVersion}; Mobile;
    Android {$osVersion}; Mobile; {$deviceId};
    // Edge
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

        if (app instanceof Firefox) {
            return String.format("Android %s; Tablet;",
                    osVersion);
        }

        return String.format("Linux; Android %s",
                osVersion);
    }
}

