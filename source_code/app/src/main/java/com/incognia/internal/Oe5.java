package com.incognia.internal;

/* loaded from: classes2.dex */
public abstract class Oe5 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final String f9322b;

    public Oe5(String str) {
        super(str);
        this.f9322b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f9322b;
    }
}
