package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class TOS {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9672b;

    public TOS(ArrayList arrayList) {
        this.f9672b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TOS) && Intrinsics.areEqual(this.f9672b, ((TOS) obj).f9672b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9672b.hashCode();
    }
}
