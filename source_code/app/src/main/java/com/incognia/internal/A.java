package com.incognia.internal;

/* loaded from: classes2.dex */
public final class A implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final TL f8333W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8334b;

    public A(String str, TL tl) {
        this.f8334b = str;
        this.f8333W = tl;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f8334b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.gmP = this.f8333W;
    }
}
