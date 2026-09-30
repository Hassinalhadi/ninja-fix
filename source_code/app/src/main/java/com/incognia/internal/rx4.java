package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rx4 {

    /* renamed from: b, reason: collision with root package name */
    public final Integer f11251b;

    public rx4(Integer num) {
        this.f11251b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rx4) && Intrinsics.areEqual(this.f11251b, ((rx4) obj).f11251b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f11251b;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "GooglePlayServicesInfo(googlePlayServicesVersion=" + this.f11251b + ')';
    }
}
