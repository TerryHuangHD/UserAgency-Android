package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.Firefox;
import com.terryhuanghd.useragency.UserApp.UserApp;

import java.lang.ref.WeakReference;

public class Mac implements UserDevice {
    WeakReference<UserApp> userApp;

    String osVersion = "11.1";

    /*
    // Safari / Chrome //Edge
    Macintosh; Intel Mac OS X {$osVersion}
    FireFox
    Macintosh; Intel Mac OS X {$osVersion}
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

        if (app instanceof Firefox) {
            return String.format("Macintosh; Intel Mac OS X %s",
                    osVersion);
        }

        return String.format("Macintosh; Intel Mac OS X %s",
                osVersion.replace(".", "_"));
    }
}
