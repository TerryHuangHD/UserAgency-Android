package com.terryhuanghd.useragency.UserDevice;

import com.terryhuanghd.useragency.UserApp.UserApp;

public interface UserDevice {
    void setUserApp(UserApp app);
    String getResultSystemInformation();
}
