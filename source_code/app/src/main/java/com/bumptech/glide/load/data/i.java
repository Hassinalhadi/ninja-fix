package com.bumptech.glide.load.data;

import ao.ad;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class i extends FilterInputStream {
    public static final byte[] red = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public static final int silver = 31;
    public final byte alpha;
    public int purple;

    public i(InputStream inputStream, int i4) {
        super(inputStream);
        if (i4 >= -1 && i4 <= 8) {
            this.alpha = (byte) i4;
            return;
        }
        throw new IllegalArgumentException(ad.zulu(i4, "Cannot add invalid orientation: "));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read;
        int i4;
        int i5 = this.purple;
        if (i5 < 2 || i5 > (i4 = silver)) {
            read = super.read();
        } else if (i5 == i4) {
            read = this.alpha;
        } else {
            read = red[i5 - 2] & 255;
        }
        if (read != -1) {
            this.purple++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) {
        long skip = super.skip(j5);
        if (skip > 0) {
            this.purple = (int) (this.purple + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int i10;
        int i11 = this.purple;
        int i12 = silver;
        if (i11 > i12) {
            i10 = super.read(bArr, i4, i5);
        } else if (i11 == i12) {
            bArr[i4] = this.alpha;
            i10 = 1;
        } else if (i11 < 2) {
            i10 = super.read(bArr, i4, 2 - i11);
        } else {
            int min = Math.min(i12 - i11, i5);
            System.arraycopy(red, this.purple - 2, bArr, i4, min);
            i10 = min;
        }
        if (i10 > 0) {
            this.purple += i10;
        }
        return i10;
    }
}
