package com.incognia.internal;

import android.content.Context;

/* loaded from: classes2.dex */
public final class fpY {

    /* renamed from: b, reason: collision with root package name */
    public final Context f10441b;

    public fpY(Context context) {
        this.f10441b = context;
    }

    public final boolean b() {
        if ((this.f10441b.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }
}
