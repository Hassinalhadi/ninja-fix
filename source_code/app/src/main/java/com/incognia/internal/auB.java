package com.incognia.internal;

/* loaded from: classes2.dex */
public abstract class auB extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final String f10123b;

    public auB(String str) {
        super(str);
        this.f10123b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f10123b;
    }
}
