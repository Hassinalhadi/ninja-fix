package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1306d2 {
    public final Unsafe alpha;

    public AbstractC1306d2(Unsafe unsafe) {
        this.alpha = unsafe;
    }

    public abstract double alpha(long j5, Object obj);

    public abstract float bravo(long j5, Object obj);

    public abstract void charlie(Object obj, long j5, boolean z2);

    public abstract void delta(Object obj, long j5, byte b2);

    public abstract void echo(Object obj, long j5, double d4);

    public abstract void foxtrot(Object obj, long j5, float f5);

    public abstract boolean golf(long j5, Object obj);
}
