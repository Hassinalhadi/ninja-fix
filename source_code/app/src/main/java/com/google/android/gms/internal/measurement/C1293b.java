package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1293b {
    public static final com.google.common.collect.f delta = com.google.common.collect.f.lima(3, "_syn", "_err", "_el");
    public String alpha;
    public final long bravo;
    public final HashMap charlie;

    public C1293b(String str, long j5, HashMap hashMap) {
        this.alpha = str;
        this.bravo = j5;
        HashMap hashMap2 = new HashMap();
        this.charlie = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object bravo(Object obj, Object obj2, String str) {
        if (delta.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final C1293b clone() {
        return new C1293b(this.alpha, this.bravo, new HashMap(this.charlie));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1293b) {
            C1293b c1293b = (C1293b) obj;
            if (this.bravo != c1293b.bravo || !this.alpha.equals(c1293b.alpha)) {
                return false;
            }
            return this.charlie.equals(c1293b.charlie);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        HashMap hashMap = this.charlie;
        long j5 = this.bravo;
        return hashMap.hashCode() + ((hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.alpha;
        String obj = this.charlie.toString();
        StringBuilder victor = Q0.c.victor("Event{name='", str, "', timestamp=");
        victor.append(this.bravo);
        victor.append(", params=");
        victor.append(obj);
        victor.append("}");
        return victor.toString();
    }
}
