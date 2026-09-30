package com.incognia.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiSsid;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class Rm {
    public Rm(W6 w62) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b(List list, g9B g9b) {
        String str;
        Object obj;
        String str2;
        boolean areEqual;
        boolean z2;
        String str3;
        int i4;
        Object obj2;
        boolean z10;
        String str4;
        Boolean bool;
        WifiSsid wifiSsid;
        String wifiSsid2;
        g9B g9b2 = g9b;
        String str5 = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            if (scanResult != null) {
                int i5 = scanResult.level;
                int i10 = scanResult.frequency;
                long currentTimeMillis = (System.currentTimeMillis() + TimeUnit.MICROSECONDS.toMillis(scanResult.timestamp)) - SystemClock.elapsedRealtime();
                if (g9b2 != null) {
                    str2 = g9b2.sVU;
                } else {
                    str2 = str5;
                }
                if (str2 == null) {
                    areEqual = false;
                } else {
                    areEqual = Intrinsics.areEqual(g9b2.sVU, scanResult.BSSID);
                }
                String str6 = scanResult.capabilities;
                if (str6 != null && Regex.find$default(new Regex("(WPA)|(WEP)"), str6, 0, 2, str5) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                CnH cnH = CnH.f8484b;
                if (CnH.b(cnH, 33, 0, 2)) {
                    wifiSsid = scanResult.getWifiSsid();
                    if (wifiSsid != null) {
                        wifiSsid2 = wifiSsid.toString();
                        str3 = ZY9.b(wifiSsid2);
                    } else {
                        str3 = str5;
                        str = str3;
                        String lowerCase = scanResult.BSSID.toLowerCase(Locale.US);
                        i4 = 0;
                        if (!CnH.b(cnH, 23, 0, 2)) {
                            obj2 = Integer.valueOf(scanResult.channelWidth);
                            i4 = 0;
                        } else {
                            obj2 = str;
                        }
                        if (!CnH.b(cnH, 23, i4, 2)) {
                            z10 = z2;
                            str4 = str3;
                            bool = Boolean.valueOf(scanResult.is80211mcResponder());
                        } else {
                            z10 = z2;
                            str4 = str3;
                            bool = str;
                        }
                        obj = new MM(i5, i10, currentTimeMillis, areEqual, z10, str4, lowerCase, obj2, bool);
                    }
                } else {
                    str3 = scanResult.SSID;
                }
                str = str5;
                String lowerCase2 = scanResult.BSSID.toLowerCase(Locale.US);
                i4 = 0;
                if (!CnH.b(cnH, 23, 0, 2)) {
                }
                if (!CnH.b(cnH, 23, i4, 2)) {
                }
                obj = new MM(i5, i10, currentTimeMillis, areEqual, z10, str4, lowerCase2, obj2, bool);
            } else {
                str = str5;
                obj = str;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            g9b2 = g9b;
            str5 = str;
        }
        return arrayList;
    }
}
