package com.terryhuanghd.useragency;

import com.terryhuanghd.useragency.UserApp.Safari;
import com.terryhuanghd.useragency.UserApp.UserApp;
import com.terryhuanghd.useragency.UserDevice.UserDevice;
import com.terryhuanghd.useragency.UserDevice.iPhone;

public class UserAgency {
    UserApp userApp = null;
    UserDevice userDevice = null;

    public UserAgency setDevice(UserDevice device) {
        this.userDevice = device;
        return this;
    }

    public UserAgency setApp(UserApp app) {
        this.userApp = app;
        return this;
    }

    public String getString() {
        if (userDevice == null) userDevice = new iPhone();
        if (userApp == null) userApp = new Safari();

        userDevice.setUserApp(userApp);
        userApp.setUserDevice(userDevice);

        return String.format("Mozilla/5.0 (%s%s) %s",
                userDevice.getResultSystemInformation(),
                userApp.getResultSystemInformation(),
                userApp.getResultPlatform());
    }
}
