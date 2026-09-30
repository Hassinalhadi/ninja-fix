package com.incognia.internal;

import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class cxz {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10268b = (String) wGk.f11657U.getValue();

    public static String b() {
        Nk6 nk6 = QHn.sVU;
        String str = f10268b;
        String W5 = nk6.W(str);
        if (W5 == null) {
            String uuid = UUID.randomUUID().toString();
            nk6.b(str, uuid);
            return uuid;
        }
        return W5;
    }
}
