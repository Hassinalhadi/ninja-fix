package com.fingerprintjs.android.fpjs_pro_internal;

import com.airbnb.lottie.compose.LottieConstants;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class co extends FilterInputStream {
    private final int D8871;
    private long[] N14263A23323;
    private int cW27173;
    private byte[] component13;
    private int component5;
    private short component8;
    private final int component9;
    private int sG29839;
    private long[] setPivotYN16904;
    private int setTopP6481;
    private final int vD14832N6715;

    public co(InputStream inputStream, int i4, int i5, short s3, int i10, int i11) throws IOException {
        this(inputStream, i4, i5, s3, i10, i11, (byte) 0);
    }

    private void D8871() {
        long[] jArr = this.setPivotYN16904;
        long[] jArr2 = this.N14263A23323;
        short s3 = this.component8;
        long j5 = jArr[s3 % 4] * 2147483085;
        long j6 = jArr2[(s3 + 2) % 4];
        int i4 = (s3 + 3) % 4;
        jArr2[i4] = ((jArr[i4] * 2147483085) + j6) / 2147483647L;
        jArr[i4] = (j5 + j6) % 2147483647L;
        for (int i5 = 0; i5 < this.component9; i5++) {
            this.component13[i5] = (byte) (r1[i5] ^ ((this.setPivotYN16904[this.component8] >> (i5 << 3)) & 255));
        }
        this.component8 = (short) ((this.component8 + 1) % 4);
    }

    private int component5() throws IOException {
        int i4;
        if (this.sG29839 == Integer.MAX_VALUE) {
            this.sG29839 = ((FilterInputStream) this).in.read();
        }
        if (this.setTopP6481 == this.component9) {
            byte[] bArr = this.component13;
            int i5 = this.sG29839;
            bArr[0] = (byte) i5;
            if (i5 >= 0) {
                int i10 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.component13, i10, this.component9 - i10);
                    if (read <= 0) {
                        break;
                    }
                    i10 += read;
                } while (i10 < this.component9);
                if (i10 >= this.component9) {
                    int i11 = this.D8871;
                    if (i11 == this.vD14832N6715) {
                        D8871();
                    } else {
                        if (this.component5 <= i11) {
                            D8871();
                        }
                        int i12 = this.component5;
                        if (i12 < this.vD14832N6715) {
                            this.component5 = i12 + 1;
                        } else {
                            this.component5 = 1;
                        }
                    }
                    int read2 = ((FilterInputStream) this).in.read();
                    this.sG29839 = read2;
                    this.setTopP6481 = 0;
                    if (read2 < 0) {
                        int i13 = this.component9;
                        i4 = i13 - (this.component13[i13 - 1] & 255);
                    } else {
                        i4 = this.component9;
                    }
                    this.cW27173 = i4;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.cW27173;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        component5();
        return this.cW27173 - this.setTopP6481;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        component5();
        int i4 = this.setTopP6481;
        if (i4 >= this.cW27173) {
            return -1;
        }
        byte[] bArr = this.component13;
        this.setTopP6481 = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) throws IOException {
        long j6 = 0;
        while (j6 < j5 && read() != -1) {
            j6++;
        }
        return j6;
    }

    private co(InputStream inputStream, int i4, int i5, short s3, int i10, int i11, byte b2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.component5 = 1;
        this.sG29839 = LottieConstants.IterateForever;
        int min = Math.min(Math.max((int) s3, 4), 8);
        this.component9 = min;
        this.component13 = new byte[min];
        this.setPivotYN16904 = new long[4];
        this.N14263A23323 = new long[4];
        this.setTopP6481 = min;
        this.cW27173 = min;
        this.setPivotYN16904 = I0.hotel(i4 ^ i11, min ^ i11);
        this.N14263A23323 = I0.hotel(i5 ^ i11, i10 ^ i11);
        this.D8871 = 100;
        this.vD14832N6715 = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) throws IOException {
        int i10 = i4 + i5;
        for (int i11 = i4; i11 < i10; i11++) {
            component5();
            int i12 = this.setTopP6481;
            if (i12 >= this.cW27173) {
                if (i11 == i4) {
                    return -1;
                }
                return i5 - (i10 - i11);
            }
            byte[] bArr2 = this.component13;
            this.setTopP6481 = i12 + 1;
            bArr[i11] = bArr2[i12];
        }
        return i5;
    }
}
