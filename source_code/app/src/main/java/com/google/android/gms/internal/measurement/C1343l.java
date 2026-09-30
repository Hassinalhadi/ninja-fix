package com.google.android.gms.internal.measurement;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1343l implements InterfaceC1355o, InterfaceC1338k {
    public final HashMap alpha = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Double alpha() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final String bravo() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1338k
    public final boolean delta(String str) {
        return this.alpha.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1343l)) {
            return false;
        }
        return this.alpha.equals(((C1343l) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public InterfaceC1355o hotel(String str, J2.i iVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new r(toString());
        }
        return com.bumptech.glide.c.charlie(this, new r(str), iVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1338k
    public final void india(String str, InterfaceC1355o interfaceC1355o) {
        HashMap hashMap = this.alpha;
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
        return new C1333j(this.alpha.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1338k
    public final InterfaceC1355o mike(String str) {
        HashMap hashMap = this.alpha;
        if (hashMap.containsKey(str)) {
            return (InterfaceC1355o) hashMap.get(str);
        }
        return InterfaceC1355o.gold;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap hashMap = this.alpha;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(Constants.SEPARATOR_COMMA));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o zzd() {
        C1343l c1343l = new C1343l();
        for (Map.Entry entry : this.alpha.entrySet()) {
            boolean z2 = entry.getValue() instanceof InterfaceC1338k;
            HashMap hashMap = c1343l.alpha;
            if (z2) {
                hashMap.put((String) entry.getKey(), (InterfaceC1355o) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((InterfaceC1355o) entry.getValue()).zzd());
            }
        }
        return c1343l;
    }
}
