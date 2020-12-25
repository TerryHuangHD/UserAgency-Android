package com.terryhuanghd.useragency.UserApp;

import com.terryhuanghd.useragency.UserDevice.Mac;
import com.terryhuanghd.useragency.UserDevice.WindowsPC;
import com.terryhuanghd.useragency.UserDevice.UserDevice;
import com.terryhuanghd.useragency.UserDevice.iPad;
import com.terryhuanghd.useragency.UserDevice.iPhone;

import java.lang.ref.WeakReference;

public class Chrome implements UserApp {
    WeakReference<UserDevice> userDevice;

    String layoutEngine_iOS = "605.1.15";
    String build_iOS = "15E148";

    String layoutEngine = "537.36";
    String softwareVersion = "87.0.4280.88";

    /*
    // iPhone / iPad
    AppleWebKit/{$layoutEngine_iOS} (KHTML, like Gecko) CriOS/{softwareVersion} Mobile/{$build_iOS} Safari/{$layoutEngine_iOS}
    // Android Phone / Tablet
    AppleWebKit/{$layoutEngine} (KHTML, like Gecko) Chrome/{softwareVersion} Mobile Safari/{$layoutEngine}
    // Mac / WindowsPC
    AppleWebKit/{$layoutEngine} (KHTML, like Gecko) Chrome/{softwareVersion} Safari/{$layoutEngine}
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
            return "";
        }

        if (device instanceof iPhone
                || device instanceof iPad) {
            return String.format("AppleWebKit/%s (KHTML, like Gecko) CriOS/%s Mobile/%s Safari/%s",
                    layoutEngine_iOS,
                    softwareVersion,
                    build_iOS,
                    layoutEngine_iOS);
        }

        if (device instanceof Mac
                || device instanceof WindowsPC) {
            return String.format("AppleWebKit/%s (KHTML, like Gecko) Chrome/%s Safari/%s",
                    layoutEngine,
                    softwareVersion,
                    layoutEngine);
        }

        return String.format("AppleWebKit/%s (KHTML, like Gecko) Chrome/%s Mobile Safari/%s",
                layoutEngine,
                softwareVersion,
                layoutEngine);
    }
}
