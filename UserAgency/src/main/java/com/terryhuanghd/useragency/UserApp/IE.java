package com.terryhuanghd.useragency.UserApp;

import com.terryhuanghd.useragency.UserDevice.Mac;
import com.terryhuanghd.useragency.UserDevice.UserDevice;

import java.lang.ref.WeakReference;

public class IE implements UserApp {
    WeakReference<UserDevice> userDevice;

    String layoutEngine = "7.0";
    String softwareVersion = "11.0";

    /*
    // WindowsPC
    ; Trident/{$layoutEngine}; rv:{$softwareVersion}
    like Gecko
    */

    @Override
    public void setUserDevice(UserDevice device) {
        userDevice = new WeakReference<>(device);
    }

    @Override
    public String getResultSystemInformation() {
        return String.format("; Trident/%s; rv:%s",
                layoutEngine,
                softwareVersion);
    }

    @Override
    public String getResultPlatform() {
        UserDevice device = userDevice.get();

        if (device == null) {
            return "";
        }

        return "like Gecko";
    }
}
