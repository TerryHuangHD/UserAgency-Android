package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.UserApp;

import java.lang.ref.WeakReference;

public class iPhone implements UserDevice {
    WeakReference<UserApp> userApp;

    String osVersion = "14_3";

    /*
    // Safari / Chrome / FireFox / Edge
    iPhone; CPU iPhone OS {$osVersion} like Mac OS X
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

        return String.format("iPhone; CPU iPhone OS %s like Mac OS X",
                osVersion);
    }
}
