package com.incognia.internal;

import kotlin.text.a;

/* loaded from: classes2.dex */
public final class gN {

    /* renamed from: W, reason: collision with root package name */
    public final byte[] f10472W;

    /* renamed from: b, reason: collision with root package name */
    public final int f10473b;

    public gN(int i4, byte[] bArr) {
        this.f10473b = i4;
        this.f10472W = bArr;
    }

    public final String W() {
        return new String(this.f10472W, a.alpha).intern();
    }

    public final long b() {
        return xFC.W(this.f10472W).longValue();
    }
}
