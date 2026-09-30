package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class VXt {

    /* renamed from: W, reason: collision with root package name */
    public final int f9779W;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9780b;

    /* renamed from: f9, reason: collision with root package name */
    public final int f9781f9;
    public final boolean sVU;

    public VXt(ArrayList arrayList, int i4, int i5, boolean z2) {
        this.f9780b = arrayList;
        this.f9779W = i4;
        this.f9781f9 = i5;
        this.sVU = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VXt)) {
            return false;
        }
        VXt vXt = (VXt) obj;
        if (Intrinsics.areEqual(this.f9780b, vXt.f9780b) && this.f9779W == vXt.f9779W && this.f9781f9 == vXt.f9781f9 && this.sVU == vXt.sVU) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b2 = ZnG.b(this.f9781f9, ZnG.b(this.f9779W, this.f9780b.hashCode() * 31, 31), 31);
        boolean z2 = this.sVU;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        return b2 + i4;
    }
}
