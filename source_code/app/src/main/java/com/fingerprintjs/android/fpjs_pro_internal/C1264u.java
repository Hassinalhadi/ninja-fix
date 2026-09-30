package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1264u extends i3<String> {
    public static int bravo;
    public static int charlie;
    public final String alpha;

    public C1264u(String str) {
        super(null);
        this.alpha = str;
    }

    public static int bravo() {
        int i4 = bravo;
        int i5 = i4 % 5367566;
        bravo = i4 + 1;
        if (i5 != 0) {
            return charlie;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        charlie = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final Object alpha() {
        return this.alpha;
    }
}
