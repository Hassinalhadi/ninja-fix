package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.raw_signal_providers.file_timestamps.FileTimestamps;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1211g1 {
    public static int bravo = 0;
    public static int charlie = 0;
    public static int delta = 0;
    public static int echo = 1;
    public final C1286z1 alpha;

    public C1211g1(C1286z1 c1286z1) {
        this.alpha = c1286z1;
    }

    public static int alpha() {
        int i4 = bravo;
        int i5 = i4 % 7970297;
        bravo = i4 + 1;
        if (i5 != 0) {
            return charlie;
        }
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        charlie = maxMemory;
        return maxMemory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.fingerprintjs.android.fpjs_pro_internal.X, java.lang.Object] */
    public final N14263A23323 bravo(String str) {
        N14263A23323 n14263a23323;
        delta = (echo + 77) % 128;
        N14263A23323<String, Throwable> component5 = bi.component5(CollectionsKt.listOf(P28427.P1.echo.vD14832N6715(), str));
        if (!(!(component5 instanceof component8))) {
            int i4 = delta;
            echo = ((i4 ^ 125) + ((i4 & 125) << 1)) % 128;
            String str2 = (String) ((component8) component5).component9;
            C1286z1 c1286z1 = this.alpha;
            ?? obj = new Object();
            try {
                n14263a23323 = new component8(new FileTimestamps(((Number) obj.alpha(C1286z1.bravo(c1286z1, str2, P28427.T2.echo.vD14832N6715()))).longValue(), ((Number) obj.alpha(C1286z1.bravo(c1286z1, str2, P28427.C1110p1.echo.vD14832N6715()))).longValue(), ((Number) obj.alpha(C1286z1.bravo(c1286z1, str2, P28427.C1136t.echo.vD14832N6715()))).longValue()));
                C1286z1.alpha = (C1286z1.bravo + 29) % 128;
            } catch (D8871 unused) {
                n14263a23323 = obj.alpha;
                if (n14263a23323 == null) {
                    C1286z1.alpha = (C1286z1.bravo + 65) % 128;
                    n14263a23323 = null;
                }
                int i5 = C1286z1.bravo;
                C1286z1.alpha = ((i5 & 65) + (i5 | 65)) % 128;
            }
            int i10 = echo;
            int i11 = (i10 & 113) + (i10 | 113);
            delta = i11 % 128;
            if (i11 % 2 == 0) {
                return n14263a23323;
            }
            throw null;
        }
        if (!(!(component5 instanceof setTopP6481))) {
            int i12 = echo;
            int i13 = ((i12 & 105) + (i12 | 105)) % 128;
            delta = i13;
            int i14 = ((i13 | 19) << 1) - (i13 ^ 19);
            echo = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 80 / 0;
            }
            return component5;
        }
        throw new NoWhenBranchMatchedException();
    }
}
