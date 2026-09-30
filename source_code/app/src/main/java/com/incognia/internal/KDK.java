package com.incognia.internal;

import android.content.Context;

/* loaded from: classes2.dex */
public final class KDK {

    /* renamed from: b, reason: collision with root package name */
    public final Context f8999b;

    public KDK(Context context) {
        this.f8999b = context;
    }

    public final boolean b(String str) {
        if (this.f8999b.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }
}
