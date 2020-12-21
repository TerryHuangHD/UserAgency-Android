package com.terryhuanghd.useragency.UserApp;

import com.terryhuanghd.useragency.UserDevice.AndroidPhone;
import com.terryhuanghd.useragency.UserDevice.Mac;
import com.terryhuanghd.useragency.UserDevice.PC;
import com.terryhuanghd.useragency.UserDevice.UserDevice;
import com.terryhuanghd.useragency.UserDevice.iPhone;

import java.lang.ref.WeakReference;

public class FireFox implements UserApp {
    WeakReference<UserDevice> userDevice;

    String layoutEngine_iOS = "605.1.15";
    String softwareVersion_iOS = "29.0";
    String build_iOS = "15E148";

    String softwareVersion = "84.0";
    String geckoVersion_PC_Mac = "20100101";

    /*
    // iPhone / iPad
    AppleWebKit/{$layoutEngine_iOS} (KHTML, like Gecko) FxiOS/{$softwareVersion_iOS} Mobile/{$build_iOS} Safari/{$layoutEngine_iOS}
    // Android Phone / Tablet
    ; rv:{$softwareVersion}
    Gecko/{$softwareVersion} Firefox/{$softwareVersion}
    // Mac / PC
    ; rv:{$softwareVersion}
     Gecko/{$geckoVersion_PC_Mac} Firefox/{$softwareVersion}
    */

    @Override
    public void setUserDevice(UserDevice device) {
        userDevice = new WeakReference<>(device);
    }

    @Override
    public String getResultSystemInformation() {
        UserDevice device = userDevice.get();

        if (device == null) {
            return "";
        }

        if (device instanceof AndroidPhone
                || device instanceof Mac
                || device instanceof PC) {
            return String.format("; rv:%s",
                    softwareVersion);
        }

        return "";
    }

    @Override
    public String getResultPlatform() {
        UserDevice device = userDevice.get();

        if (device == null) {
            return "";
        }

        if (device instanceof iPhone) {
            return String.format("AppleWebKit/%s (KHTML, like Gecko) FxiOS/%s Mobile/%s Safari/%s",
                    layoutEngine_iOS,
                    softwareVersion_iOS,
                    build_iOS,
                    layoutEngine_iOS);
        }

        if (device instanceof Mac
                || device instanceof PC) {
            return String.format("Gecko/%s Firefox/%s",
                    geckoVersion_PC_Mac,
                    softwareVersion);

        }

        return String.format("Gecko/%s Firefox/%s",
                softwareVersion,
                softwareVersion);
    }
}
