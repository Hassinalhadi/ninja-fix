package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class XMI {

    /* renamed from: b, reason: collision with root package name */
    public final W f9915b;

    public XMI(W w4) {
        this.f9915b = w4;
    }

    public final boolean b(Ox ox) {
        boolean z2;
        if (ox.W()) {
            S0A s0a = this.f9915b.f9816b;
            String str = W.f9814W;
            String str2 = CnH.DOu;
            if (str2 != null && W.f9815f9.contains(str2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (((JSONObject) s0a.f9574b.get()).optBoolean(str, z2)) {
                return true;
            }
        }
        return false;
    }
}
