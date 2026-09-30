package com.google.android.gms.internal.measurement;

import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1347m implements InterfaceC1355o {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Double alpha() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final String bravo() {
        return BuildConfig.TRAVIS;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C1347m;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o hotel(String str, J2.i iVar, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Boolean kilo() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Iterator lima() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o zzd() {
        return InterfaceC1355o.gray;
    }
}
