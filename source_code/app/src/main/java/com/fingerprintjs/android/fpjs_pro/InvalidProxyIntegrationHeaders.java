package com.fingerprintjs.android.fpjs_pro;

import android.os.Process;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/InvalidProxyIntegrationHeaders;", "Lcom/fingerprintjs/android/fpjs_pro/Error;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InvalidProxyIntegrationHeaders extends Error {
    public static int echo;
    public static int foxtrot;

    public static int D8871() {
        int i4 = echo;
        int i5 = i4 % 8198851;
        echo = i4 + 1;
        if (i5 != 0) {
            return foxtrot;
        }
        int myTid = Process.myTid();
        foxtrot = myTid;
        return myTid;
    }
}
