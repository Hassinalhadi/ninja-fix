package com.incognia.internal;

import android.content.Context;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class dtP implements M1 {

    /* renamed from: W, reason: collision with root package name */
    public static final String f10335W;

    /* renamed from: b, reason: collision with root package name */
    public static final String f10336b;

    static {
        f10336b = (String) wGk.f11657U.getValue();
        f10335W = (String) wGk.f11635Mf.getValue();
    }

    @Override // com.incognia.internal.M1
    public final boolean W() {
        return true;
    }

    @Override // com.incognia.internal.M1
    public final int b() {
        return 2;
    }

    @Override // com.incognia.internal.M1
    public final void b(Context context) {
        Nk6 nk6 = QHn.sVU;
        String str = f10336b;
        String W5 = nk6.W(str);
        if (W5 != null) {
            String str2 = f10335W;
            if (kotlin.text.r.quebec(W5, str2, false)) {
                nk6.b(str, kotlin.text.r.oscar(W5, str2, "").toLowerCase(Locale.getDefault()));
            }
        }
    }
}
