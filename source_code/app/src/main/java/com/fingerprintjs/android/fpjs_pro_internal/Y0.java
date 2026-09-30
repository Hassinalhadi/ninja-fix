package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import fe.C1713e;
import fe.C1715g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/Y0;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Y0 {

    @NotNull
    public static final Y0 alpha = new Object();
    public static final C1715g bravo = new C1713e(0, 15, 1);
    public static int charlie = 0;
    public static int delta = 1;

    public static String alpha(String str) {
        charlie = (delta + 13) % 128;
        String amber = ao.ad.amber(P28427.a6.echo.vD14832N6715(), "/", str);
        int i4 = delta;
        charlie = (((i4 | 89) << 1) - (i4 ^ 89)) % 128;
        return amber;
    }
}
