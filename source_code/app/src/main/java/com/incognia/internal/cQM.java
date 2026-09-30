package com.incognia.internal;

/* loaded from: classes2.dex */
public abstract class cQM extends Exception {

    /* renamed from: W, reason: collision with root package name */
    public final Throwable f10249W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10250b;

    public cQM(String str, Throwable th) {
        super(str);
        this.f10250b = str;
        this.f10249W = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10249W;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f10250b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cQM(String str, Throwable th, int i4) {
        super(str);
        th = (i4 & 8) != 0 ? null : th;
        this.f10250b = str;
        this.f10249W = th;
    }
}
