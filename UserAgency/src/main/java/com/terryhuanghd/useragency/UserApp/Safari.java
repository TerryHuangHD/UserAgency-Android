package com.terryhuanghd.useragency.UserApp;

import com.terryhuanghd.useragency.UserDevice.Mac;
import com.terryhuanghd.useragency.UserDevice.UserDevice;

import java.lang.ref.WeakReference;

public class Safari implements UserApp {
    WeakReference<UserDevice> userDevice;

    String layoutEngine = "605.1.15";
    String softwareVersion = "14.0";
    String build = "15E148";

    /*
    iPhone / iPad
    AppleWebKit/{$layoutEngine} (KHTML, like Gecko) Version/{softwareVersion} Mobile/{$build} Safari/{$layoutEngine}
    Mac
    AppleWebKit/{$layoutEngine} (KHTML, like Gecko) Version/{softwareVersion} Safari/{$layoutEngine}
    */

    @Override
    public void setUserDevice(UserDevice device) {
        userDevice = new WeakReference<>(device);
    }

    @Override
    public String getResultSystemInformation() {
        return "";
    }

    @Override
    public String getResultPlatform() {
        UserDevice device = userDevice.get();

        if (device == null) {
            return String.format("AppleWebKit/%s (KHTML, like Gecko) Version/%s Mobile/%s Safari/%s",
                    layoutEngine,
                    softwareVersion,
                    build,
                    layoutEngine);
        }

        if (device instanceof Mac) {
            return String.format("AppleWebKit/%s (KHTML, like Gecko) Version/%s Safari/%s",
                    layoutEngine,
                    softwareVersion,
                    layoutEngine);
        }

        return String.format("AppleWebKit/%s (KHTML, like Gecko) Version/%s Mobile/%s Safari/%s",
                layoutEngine,
                softwareVersion,
                build,
                layoutEngine);
    }
}
