package com.incognia.internal;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class ez extends FilterOutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f10394b;

    public ez(FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f10394b = new AtomicLong(0L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i4) {
        super.write(i4);
        this.f10394b.incrementAndGet();
    }
}
