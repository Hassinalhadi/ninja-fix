package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/b;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1189b {

    @NotNull
    public static final C1189b alpha = new Object();
    public static final String bravo = P28427.C1094n.echo.vD14832N6715();
    public static int charlie = 0;
    public static int delta = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.b, java.lang.Object] */
    static {
        if (123 % 2 != 0) {
        } else {
            throw null;
        }
    }

    public static gF31878 alpha(Long l10) {
        int i4 = charlie;
        delta = (((i4 | 63) << 1) - (i4 ^ 63)) % 128;
        String str = bravo;
        if (l10 == null) {
            C1278x1 c1278x1 = new C1278x1(str, null, component2.b.a.foxtrot);
            int i5 = delta + 87;
            charlie = i5 % 128;
            if (i5 % 2 != 0) {
                int i10 = 92 / 0;
            }
            return c1278x1;
        }
        C1282y1 c1282y1 = new C1282y1(str, l10.toString());
        delta = (charlie + 11) % 128;
        return c1282y1;
    }
}
