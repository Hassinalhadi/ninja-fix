package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/I1;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class I1 {

    @NotNull
    public static final I1 alpha = new Object();
    public static final String bravo = P28427.v6.echo.vD14832N6715();
    public static int charlie = 0;
    public static int delta = 1;

    public static gF31878 alpha(Long l10) {
        delta = (charlie + 9) % 128;
        String str = bravo;
        if (l10 == null) {
            return new C1278x1(str, null, component2.b.a.foxtrot);
        }
        C1282y1 c1282y1 = new C1282y1(str, l10.toString());
        int i4 = delta;
        int i5 = ((i4 | 105) << 1) - (i4 ^ 105);
        charlie = i5 % 128;
        if (i5 % 2 == 0) {
            return c1282y1;
        }
        throw null;
    }
}
