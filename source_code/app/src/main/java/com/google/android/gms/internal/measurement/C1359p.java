package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1359p implements InterfaceC1355o {
    public final String alpha;
    public final ArrayList purple;

    public C1359p(String str, ArrayList arrayList) {
        this.alpha = str;
        ArrayList arrayList2 = new ArrayList();
        this.purple = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Double alpha() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final String bravo() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1359p)) {
            return false;
        }
        C1359p c1359p = (C1359p) obj;
        String str = this.alpha;
        if (str == null ? c1359p.alpha != null : !str.equals(c1359p.alpha)) {
            return false;
        }
        return this.purple.equals(c1359p.purple);
    }

    public final int hashCode() {
        int i4;
        String str = this.alpha;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return this.purple.hashCode() + (i4 * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o hotel(String str, J2.i iVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Boolean kilo() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Iterator lima() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o zzd() {
        return this;
    }
}
