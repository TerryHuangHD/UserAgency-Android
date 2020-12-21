package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.UserApp;

import java.lang.ref.WeakReference;

public class iPhone implements UserDevice {
    WeakReference<UserApp> userApp;

    String osVersion = "14_3";

    /*
    Safari
    iPhone; CPU iPhone OS {$osVersion} like Mac OS X
    Chrome
    iPhone; CPU iPhone OS {$osVersion} like Mac OS X
    FireFox
    iPhone; CPU iPhone OS {$osVersion} like Mac OS X
    Edge
    iPhone; CPU iPhone OS {$osVersion} like Mac OS X
    */

    @Override
    public void setUserApp(UserApp app) {
        userApp = new WeakReference<>(app);
    }

    @Override
    public String getResultSystemInformation() {
        UserApp app = userApp.get();

        return String.format("iPhone; CPU iPhone OS %s like Mac OS X",
                osVersion);
    }
}
