package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.FireFox;
import com.terryhuanghd.useragency.UserApp.UserApp;

import java.lang.ref.WeakReference;

public class AndroidPhone implements UserDevice {
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

        if (app instanceof FireFox) {
            return String.format("Android %s; Mobile;",
                    osVersion);
        }

        return String.format("Linux; Android %s",
                osVersion);
    }
}

