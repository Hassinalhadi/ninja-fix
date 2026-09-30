package com.incognia.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class JCm {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8940b;

    public JCm(byte[] bArr) {
        this.f8940b = bArr;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(JCm.class, cls)) {
            return false;
        }
        return Arrays.equals(this.f8940b, ((JCm) obj).f8940b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8940b);
    }
}
