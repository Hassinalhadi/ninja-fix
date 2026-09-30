package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import pe.AbstractC2327c;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1313f implements InterfaceC1355o {
    public final boolean alpha;

    public C1313f(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.alpha = booleanValue;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Double alpha() {
        double d4;
        if (true != this.alpha) {
            d4 = 0.0d;
        } else {
            d4 = 1.0d;
        }
        return Double.valueOf(d4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final String bravo() {
        return Boolean.toString(this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1313f) && this.alpha == ((C1313f) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.alpha).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o hotel(String str, J2.i iVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z2 = this.alpha;
        if (equals) {
            return new r(Boolean.toString(z2));
        }
        throw new IllegalArgumentException(AbstractC2327c.xray(Boolean.toString(z2), ".", str, " is not a function."));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Boolean kilo() {
        return Boolean.valueOf(this.alpha);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Iterator lima() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.alpha);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o zzd() {
        return new C1313f(Boolean.valueOf(this.alpha));
    }
}
