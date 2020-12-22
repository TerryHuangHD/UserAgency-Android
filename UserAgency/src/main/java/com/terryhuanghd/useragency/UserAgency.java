package com.terryhuanghd.useragency;

import com.terryhuanghd.useragency.UserApp.Chrome;
import com.terryhuanghd.useragency.UserApp.UserApp;
import com.terryhuanghd.useragency.UserDevice.AndroidPhone;
import com.terryhuanghd.useragency.UserDevice.UserDevice;

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
        if (userDevice == null) userDevice = new AndroidPhone();
        if (userApp == null) userApp = new Chrome();

        userDevice.setUserApp(userApp);
        userApp.setUserDevice(userDevice);

        return String.format("Mozilla/5.0 (%s%s) %s",
                userDevice.getResultSystemInformation(),
                userApp.getResultSystemInformation(),
                userApp.getResultPlatform());
    }
}
