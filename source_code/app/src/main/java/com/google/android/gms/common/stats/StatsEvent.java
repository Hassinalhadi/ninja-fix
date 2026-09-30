package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes2.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract String E();

    public abstract long o();

    public final String toString() {
        return o() + "\t" + zza() + "\t-1" + E();
    }

    public abstract int zza();
}
