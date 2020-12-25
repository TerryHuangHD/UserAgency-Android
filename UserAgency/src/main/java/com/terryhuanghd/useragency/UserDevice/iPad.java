package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.UserApp;

import java.lang.ref.WeakReference;

public class iPad implements UserDevice {
    WeakReference<UserApp> userApp;

    String osVersion = "14_3";

    /*
    // Safari / Chrome / FireFox / Edge
    iPad; CPU OS {$osVersion} like Mac OS X
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

        return String.format("iPad; CPU OS %s like Mac OS X",
                osVersion);
    }
}
