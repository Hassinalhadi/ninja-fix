package com.incognia.internal;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class Jb extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f8953b;

    public Jb(FileInputStream fileInputStream) {
        super(fileInputStream);
        this.f8953b = new AtomicLong(0L);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f8953b.incrementAndGet();
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) {
        long skip = super.skip(j5);
        if (skip > 0) {
            this.f8953b.addAndGet(skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int read = super.read(bArr, i4, i5);
        if (read > 0) {
            this.f8953b.addAndGet(read);
        }
        return read;
    }
}
