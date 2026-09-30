package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/m;", "", "charlie", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C1233m {
    public final long alpha;
    public final long bravo;

    public C1233m(long j5, long j6) {
        this.alpha = j5;
        this.bravo = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1233m)) {
            return false;
        }
        C1233m c1233m = (C1233m) obj;
        if (this.alpha == c1233m.alpha && this.bravo == c1233m.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        int i4 = ((int) (j5 ^ (j5 >>> 32))) * 31;
        long j6 = this.bravo;
        return i4 + ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        return "";
    }
}
