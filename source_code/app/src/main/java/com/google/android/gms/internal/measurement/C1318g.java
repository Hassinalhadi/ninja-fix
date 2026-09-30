package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1318g implements InterfaceC1355o {
    public final InterfaceC1355o alpha;
    public final String purple;

    public C1318g(String str) {
        this.alpha = InterfaceC1355o.gold;
        this.purple = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Double alpha() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final String bravo() {
        throw new IllegalStateException("Control is not a String");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1318g)) {
            return false;
        }
        C1318g c1318g = (C1318g) obj;
        if (this.purple.equals(c1318g.purple) && this.alpha.equals(c1318g.alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() + (this.purple.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o hotel(String str, J2.i iVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Boolean kilo() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Iterator lima() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o zzd() {
        return new C1318g(this.purple, this.alpha.zzd());
    }

    public C1318g(String str, InterfaceC1355o interfaceC1355o) {
        this.alpha = interfaceC1355o;
        this.purple = str;
    }
}
