package com.incognia.internal;

import android.net.wifi.WifiInfo;

/* loaded from: classes2.dex */
public final class VyX {
    public static g9B b(WifiInfo wifiInfo) {
        Integer num;
        int rssi = wifiInfo.getRssi();
        int linkSpeed = wifiInfo.getLinkSpeed();
        String b2 = ZY9.b(wifiInfo.getSSID());
        String bssid = wifiInfo.getBSSID();
        if (CnH.b(CnH.f8484b, 21, 0, 2)) {
            num = Integer.valueOf(wifiInfo.getFrequency());
        } else {
            num = null;
        }
        return new g9B(rssi, linkSpeed, b2, bssid, num);
    }
}
