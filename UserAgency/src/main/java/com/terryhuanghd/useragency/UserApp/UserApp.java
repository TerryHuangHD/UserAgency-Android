package com.terryhuanghd.useragency.UserApp;

import com.terryhuanghd.useragency.UserDevice.UserDevice;

public interface UserApp {
    void setUserDevice(UserDevice device);
    String getResultSystemInformation();
    String getResultPlatform();
}
