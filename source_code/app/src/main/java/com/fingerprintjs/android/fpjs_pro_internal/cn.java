package com.fingerprintjs.android.fpjs_pro_internal;

import com.airbnb.lottie.compose.LottieConstants;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class cn extends FilterInputStream {
    private int D8871;
    private int N14263A23323;
    private int cW27173;
    private int component10;
    private int[] component13;
    private final int component5;
    private byte[] component8;
    private C1235m1 component9;
    private int rP23717;
    private byte[] sG29839;
    private final int setPivotYN16904;
    private byte[] setTopP6481;
    private final int vD14832N6715;

    public cn(InputStream inputStream, int[] iArr, byte[] bArr, int i4, boolean z2, int i5) throws IOException {
        this(inputStream, iArr, bArr, i4, false, i5, (byte) 0);
    }

    private void D8871() {
        if (this.component10 == 2) {
            byte[] bArr = this.sG29839;
            System.arraycopy(bArr, 0, this.component8, 0, bArr.length);
        }
        byte[] bArr2 = this.sG29839;
        int i4 = ((bArr2[0] << 24) & ShapeBuilder.DEFAULT_SHAPE_COLOR) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i5 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i10 = this.setPivotYN16904;
        C1235m1 c1235m1 = this.component9;
        I0.kilo(i4, i5, false, i10, c1235m1.bravo, c1235m1.alpha, this.component13);
        int[] iArr = this.component13;
        int i11 = iArr[0];
        int i12 = iArr[1];
        byte[] bArr3 = this.sG29839;
        bArr3[0] = (byte) (i11 >> 24);
        bArr3[1] = (byte) (i11 >> 16);
        bArr3[2] = (byte) (i11 >> 8);
        bArr3[3] = (byte) i11;
        bArr3[4] = (byte) (i12 >> 24);
        bArr3[5] = (byte) (i12 >> 16);
        bArr3[6] = (byte) (i12 >> 8);
        bArr3[7] = (byte) i12;
        if (this.component10 == 2) {
            for (int i13 = 0; i13 < 8; i13++) {
                byte[] bArr4 = this.sG29839;
                bArr4[i13] = (byte) (bArr4[i13] ^ this.setTopP6481[i13]);
            }
            byte[] bArr5 = this.component8;
            System.arraycopy(bArr5, 0, this.setTopP6481, 0, bArr5.length);
        }
    }

    private int setPivotYN16904() throws IOException {
        if (this.cW27173 == Integer.MAX_VALUE) {
            this.cW27173 = ((FilterInputStream) this).in.read();
        }
        int i4 = 8;
        if (this.N14263A23323 == 8) {
            byte[] bArr = this.sG29839;
            int i5 = this.cW27173;
            bArr[0] = (byte) i5;
            if (i5 >= 0) {
                int i10 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.sG29839, i10, 8 - i10);
                    if (read <= 0) {
                        break;
                    }
                    i10 += read;
                } while (i10 < 8);
                if (i10 >= 8) {
                    int i11 = this.component5;
                    if (i11 == this.vD14832N6715) {
                        D8871();
                    } else {
                        if (this.D8871 <= i11) {
                            D8871();
                        }
                        int i12 = this.D8871;
                        if (i12 < this.vD14832N6715) {
                            this.D8871 = i12 + 1;
                        } else {
                            this.D8871 = 1;
                        }
                    }
                    int read2 = ((FilterInputStream) this).in.read();
                    this.cW27173 = read2;
                    this.N14263A23323 = 0;
                    if (read2 < 0) {
                        i4 = 8 - (this.sG29839[7] & 255);
                    }
                    this.rP23717 = i4;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.rP23717;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        setPivotYN16904();
        return this.rP23717 - this.N14263A23323;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        setPivotYN16904();
        int i4 = this.N14263A23323;
        if (i4 >= this.rP23717) {
            return -1;
        }
        byte[] bArr = this.sG29839;
        this.N14263A23323 = i4 + 1;
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

    private cn(InputStream inputStream, int[] iArr, byte[] bArr, int i4, boolean z2, int i5, byte b2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.D8871 = 1;
        this.cW27173 = LottieConstants.IterateForever;
        int min = Math.min(Math.max(i4, 3), 16);
        this.setPivotYN16904 = min;
        this.sG29839 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.setTopP6481 = bArr2;
        this.component8 = new byte[8];
        this.component13 = new int[2];
        this.N14263A23323 = 8;
        this.rP23717 = 8;
        this.component10 = i5;
        if (i5 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.component9 = new C1235m1(iArr, min, true);
        this.component5 = 100;
        this.vD14832N6715 = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) throws IOException {
        int i10 = i4 + i5;
        for (int i11 = i4; i11 < i10; i11++) {
            setPivotYN16904();
            int i12 = this.N14263A23323;
            if (i12 >= this.rP23717) {
                if (i11 == i4) {
                    return -1;
                }
                return i5 - (i10 - i11);
            }
            byte[] bArr2 = this.sG29839;
            this.N14263A23323 = i12 + 1;
            bArr[i11] = bArr2[i12];
        }
        return i5;
    }
}
