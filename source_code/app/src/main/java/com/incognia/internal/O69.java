package com.incognia.internal;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class O69 {

    /* renamed from: W, reason: collision with root package name */
    public static final Cu f9285W;

    /* renamed from: b, reason: collision with root package name */
    public static final String f9286b;

    /* renamed from: f9, reason: collision with root package name */
    public static final AtomicLong f9287f9;

    static {
        long j5;
        String str = (String) wGk.e.getValue();
        f9286b = str;
        f9285W = new Cu();
        Long sVU = QHn.f9493f9.sVU(str);
        if (sVU != null) {
            j5 = sVU.longValue();
        } else {
            j5 = 0;
        }
        f9287f9 = new AtomicLong(j5);
    }
}
