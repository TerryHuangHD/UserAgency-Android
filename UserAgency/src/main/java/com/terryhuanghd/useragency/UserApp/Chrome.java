package com.terryhuanghd.useragency.UserApp;

import com.terryhuanghd.useragency.UserDevice.AndroidPhone;
import com.terryhuanghd.useragency.UserDevice.UserDevice;
import com.terryhuanghd.useragency.UserDevice.iPhone;

import java.lang.ref.WeakReference;

public class Chrome implements UserApp {
    WeakReference<UserDevice> userDevice;

    String layoutEngine = "537.36";
    String iOSLayoutEngine = "605.1.15";
    String softwareVersion = "87.0.4280.88";
    String build = "15E148";

    /*
    iPhone / iPad
    AppleWebKit/{$iOSLayoutEngine} (KHTML, like Gecko) CriOS/{softwareVersion} Mobile/{$build} Safari/{$iOSLayoutEngine}
    Mac
    AppleWebKit/{$layoutEngine} (KHTML, like Gecko) Chrome/{softwareVersion} Safari/{$layoutEngine}
    Android Phone
    AppleWebKit/{$layoutEngine} (KHTML, like Gecko) Chrome/{softwareVersion} Mobile Safari/{$layoutEngine}
    Android Tablet
    AppleWebKit/{$layoutEngine} (KHTML, like Gecko) Chrome/{softwareVersion} Mobile Safari/{$layoutEngine}
    PC
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
            return String.format("AppleWebKit/%s (KHTML, like Gecko) CriOS/%s Safari/%s",
                    layoutEngine,
                    softwareVersion,
                    layoutEngine);
        }

        if (device instanceof iPhone) {
            return String.format("AppleWebKit/%s (KHTML, like Gecko) CriOS/%s Mobile/%s Safari/%s",
                    iOSLayoutEngine,
                    softwareVersion,
                    build,
                    iOSLayoutEngine);
        }

        if (device instanceof AndroidPhone) {
            return String.format("AppleWebKit/%s (KHTML, like Gecko) CriOS/%s Mobile Safari/%s",
                    iOSLayoutEngine,
                    softwareVersion,
                    iOSLayoutEngine);
        }

        return String.format("AppleWebKit/%s (KHTML, like Gecko) CriOS/%s Safari/%s",
                layoutEngine,
                softwareVersion,
                layoutEngine);

    }
}
