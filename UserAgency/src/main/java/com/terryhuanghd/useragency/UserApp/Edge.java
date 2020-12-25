package com.terryhuanghd.useragency.UserApp;

import com.terryhuanghd.useragency.UserDevice.Mac;
import com.terryhuanghd.useragency.UserDevice.UserDevice;
import com.terryhuanghd.useragency.UserDevice.WindowsPC;
import com.terryhuanghd.useragency.UserDevice.iPad;
import com.terryhuanghd.useragency.UserDevice.iPhone;

import java.lang.ref.WeakReference;

public class Edge implements UserApp {
    WeakReference<UserDevice> userDevice;

    String layoutEngine_iOS = "605.1.15";
    String version_iOS = "14.0";
    String build_iOS = "15E148";

    String softwareVersion_Chrome = "87.0.4280.101";

    String layoutEngine = "537.36";
    String softwareVersion = "45.12.24.5121";

    /*
    // iPhone / iPad
    AppleWebKit/{$layoutEngine_iOS} (KHTML, like Gecko) Version/{$version_iOS} EdgiOS/{$softwareVersion} Mobile/{$build_iOS} Safari/{$layoutEngine_iOS}
    // Android Phone / Tablet
    AppleWebKit/{$layoutEngine} (KHTML, like Gecko) Chrome/{$softwareVersion_Chrome} Mobile Safari/{$layoutEngine_iOS} EdgA/{$softwareVersion}
    // Mac / WindowsPC
    AppleWebKit/{$layoutEngine} (KHTML, like Gecko) Chrome/{$softwareVersion_Chrome} Safari/{$layoutEngine} Edg/{$softwareVersion_Chrome}
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
            return String.format("AppleWebKit/%s (KHTML, like Gecko) Version/%s EdgiOS/%s Mobile/%s Safari/%s",
                    layoutEngine_iOS,
                    version_iOS,
                    softwareVersion,
                    build_iOS,
                    layoutEngine_iOS);
        }

        if (device instanceof Mac
                || device instanceof WindowsPC) {
            return String.format("AppleWebKit/%s (KHTML, like Gecko) Chrome/%s Safari/%s Edg/%s",
                    layoutEngine,
                    softwareVersion_Chrome,
                    layoutEngine,
                    softwareVersion_Chrome);
        }

        return String.format("AppleWebKit/%s (KHTML, like Gecko) Chrome/%s Mobile Safari/%s EdgA/%s",
                layoutEngine,
                softwareVersion_Chrome,
                layoutEngine_iOS,
                softwareVersion);
    }
}
