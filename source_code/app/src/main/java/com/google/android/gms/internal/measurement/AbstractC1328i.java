package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1328i implements InterfaceC1355o, InterfaceC1338k {
    public final String alpha;
    public final HashMap purple = new HashMap();

    public AbstractC1328i(String str) {
        this.alpha = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Double alpha() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final String bravo() {
        return this.alpha;
    }

    public abstract InterfaceC1355o charlie(J2.i iVar, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1338k
    public final boolean delta(String str) {
        return this.purple.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1328i)) {
            return false;
        }
        AbstractC1328i abstractC1328i = (AbstractC1328i) obj;
        String str = this.alpha;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC1328i.alpha);
    }

    public final int hashCode() {
        String str = this.alpha;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o hotel(String str, J2.i iVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new r(this.alpha);
        }
        return com.bumptech.glide.c.charlie(this, new r(str), iVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1338k
    public final void india(String str, InterfaceC1355o interfaceC1355o) {
        HashMap hashMap = this.purple;
        if (interfaceC1355o == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC1355o);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Boolean kilo() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Iterator lima() {
        return new C1333j(this.purple.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1338k
    public final InterfaceC1355o mike(String str) {
        HashMap hashMap = this.purple;
        if (hashMap.containsKey(str)) {
            return (InterfaceC1355o) hashMap.get(str);
        }
        return InterfaceC1355o.gold;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public InterfaceC1355o zzd() {
        return this;
    }
}
