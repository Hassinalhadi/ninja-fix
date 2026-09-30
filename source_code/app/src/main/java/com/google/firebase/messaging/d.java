package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class d extends FilterInputStream {
    public long alpha;
    public long purple;

    public d(InputStream inputStream) {
        super(inputStream);
        this.purple = -1L;
        this.alpha = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.alpha);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i4) {
        ((FilterInputStream) this).in.mark(i4);
        this.purple = this.alpha;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.alpha == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.alpha--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.purple != -1) {
                ((FilterInputStream) this).in.reset();
                this.alpha = this.purple;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j5, this.alpha));
        this.alpha -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        long j5 = this.alpha;
        if (j5 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i4, (int) Math.min(i5, j5));
        if (read != -1) {
            this.alpha -= read;
        }
        return read;
    }
}
