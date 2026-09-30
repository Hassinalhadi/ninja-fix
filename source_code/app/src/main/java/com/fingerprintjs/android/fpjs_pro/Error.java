package com.fingerprintjs.android.fpjs_pro;

import android.os.SystemClock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/Error;", "", "Lcom/fingerprintjs/android/fpjs_pro/a;", "Lcom/fingerprintjs/android/fpjs_pro/b;", "Lcom/fingerprintjs/android/fpjs_pro/c;", "Lcom/fingerprintjs/android/fpjs_pro/ClientTimeout;", "Lcom/fingerprintjs/android/fpjs_pro/f;", "Lcom/fingerprintjs/android/fpjs_pro/i;", "Lcom/fingerprintjs/android/fpjs_pro/j;", "Lcom/fingerprintjs/android/fpjs_pro/InvalidProxyIntegrationHeaders;", "Lcom/fingerprintjs/android/fpjs_pro/k;", "Lcom/fingerprintjs/android/fpjs_pro/q;", "Lcom/fingerprintjs/android/fpjs_pro/r;", "Lcom/fingerprintjs/android/fpjs_pro/NotAvailableWithoutUA;", "Lcom/fingerprintjs/android/fpjs_pro/s;", "Lcom/fingerprintjs/android/fpjs_pro/t;", "Lcom/fingerprintjs/android/fpjs_pro/u;", "Lcom/fingerprintjs/android/fpjs_pro/v;", "Lcom/fingerprintjs/android/fpjs_pro/w;", "Lcom/fingerprintjs/android/fpjs_pro/x;", "Lcom/fingerprintjs/android/fpjs_pro/y;", "Lcom/fingerprintjs/android/fpjs_pro/aa;", "Lcom/fingerprintjs/android/fpjs_pro/UnknownError;", "Lcom/fingerprintjs/android/fpjs_pro/ab;", "Lcom/fingerprintjs/android/fpjs_pro/ac;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Error {
    public static int charlie;
    public static int delta;
    public final String alpha;
    public final String bravo;

    public Error(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public static int alpha() {
        int i4 = charlie;
        int i5 = i4 % 6572292;
        charlie = i4 + 1;
        if (i5 != 0) {
            return delta;
        }
        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
        delta = elapsedRealtime;
        return elapsedRealtime;
    }

    public /* synthetic */ Error(String str) {
        this("Unknown", str);
    }
}
