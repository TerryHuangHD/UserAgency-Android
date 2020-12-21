package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.UserApp;

import java.lang.ref.WeakReference;

public class Mac implements UserDevice {
    WeakReference<UserApp> userApp;

    String osVersion = "11_1";

    /*
    Safari
    Macintosh; Intel Mac OS X {$osVersion}
    Chrome
    Macintosh; Intel Mac OS X {$osVersion}
    FireFox
    Macintosh; Intel Mac OS X 11.1 <-
    Edge
    Macintosh; Intel Mac OS X {$osVersion}
    */

    @Override
    public void setUserApp(UserApp app) {
        userApp = new WeakReference<>(app);
    }

    @Override
    public String getResultSystemInformation() {
        UserApp app = userApp.get();

        return String.format("Macintosh; Intel Mac OS X %s",
                osVersion);
    }
}
