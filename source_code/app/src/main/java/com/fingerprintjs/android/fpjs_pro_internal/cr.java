package com.fingerprintjs.android.fpjs_pro_internal;

import com.airbnb.lottie.compose.LottieConstants;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class cr extends FilterInputStream {
    private static final short component9 = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private int C20232;
    private int D8871;
    private int N14263A23323;
    private int Y16199;
    private int cW27173;
    private final int component10;
    private int component13;
    private byte[] component5;
    private int component8;
    private int kC4266;
    private final int rP23717;
    private int sG29839;
    private byte[] setPivotYN16904;
    private int setTopP6481;
    private byte[] vD14832N6715;

    public cr(InputStream inputStream, int[] iArr, int i4, byte[] bArr, int i5, int i10) throws IOException {
        this(inputStream, iArr, i4, bArr, i5, i10, (byte) 0);
    }

    private int component5() throws IOException {
        if (this.component13 == Integer.MAX_VALUE) {
            this.component13 = ((FilterInputStream) this).in.read();
        }
        int i4 = 8;
        if (this.D8871 == 8) {
            byte[] bArr = this.setPivotYN16904;
            int i5 = this.component13;
            bArr[0] = (byte) i5;
            if (i5 >= 0) {
                int i10 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.setPivotYN16904, i10, 8 - i10);
                    if (read <= 0) {
                        break;
                    }
                    i10 += read;
                } while (i10 < 8);
                if (i10 >= 8) {
                    int i11 = this.component10;
                    if (i11 == this.rP23717) {
                        setPivotYN16904();
                    } else {
                        if (this.C20232 <= i11) {
                            setPivotYN16904();
                        }
                        int i12 = this.C20232;
                        if (i12 < this.rP23717) {
                            this.C20232 = i12 + 1;
                        } else {
                            this.C20232 = 1;
                        }
                    }
                    int read2 = ((FilterInputStream) this).in.read();
                    this.component13 = read2;
                    this.D8871 = 0;
                    if (read2 < 0) {
                        i4 = 8 - (this.setPivotYN16904[7] & 255);
                    }
                    this.N14263A23323 = i4;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.N14263A23323;
    }

    private void setPivotYN16904() {
        if (this.setTopP6481 == 3) {
            byte[] bArr = this.setPivotYN16904;
            System.arraycopy(bArr, 0, this.component5, 0, bArr.length);
        }
        byte[] bArr2 = this.setPivotYN16904;
        boolean z2 = true;
        char c3 = 2;
        int i4 = ((bArr2[0] << 24) & ShapeBuilder.DEFAULT_SHAPE_COLOR) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i5 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i10 = 0;
        while (true) {
            int i11 = this.component8;
            if (i10 >= i11) {
                break;
            }
            short s3 = component9;
            i5 -= ((((i11 - i10) * s3) + i4) ^ ((i4 << 4) + this.Y16199)) ^ ((i4 >>> 5) + this.cW27173);
            i4 -= (((i5 << 4) + this.sG29839) ^ (((i11 - i10) * s3) + i5)) ^ ((i5 >>> 5) + this.kC4266);
            i10++;
            c3 = c3;
            z2 = z2;
        }
        byte[] bArr3 = this.setPivotYN16904;
        bArr3[0] = (byte) (i4 >> 24);
        bArr3[z2 ? 1 : 0] = (byte) (i4 >> 16);
        bArr3[c3] = (byte) (i4 >> 8);
        bArr3[3] = (byte) i4;
        bArr3[4] = (byte) (i5 >> 24);
        bArr3[5] = (byte) (i5 >> 16);
        bArr3[6] = (byte) (i5 >> 8);
        bArr3[7] = (byte) i5;
        if (this.setTopP6481 == 3) {
            for (int i12 = 0; i12 < 8; i12++) {
                byte[] bArr4 = this.setPivotYN16904;
                bArr4[i12] = (byte) (bArr4[i12] ^ this.vD14832N6715[i12]);
            }
            byte[] bArr5 = this.component5;
            System.arraycopy(bArr5, 0, this.vD14832N6715, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        component5();
        return this.N14263A23323 - this.D8871;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        component5();
        int i4 = this.D8871;
        if (i4 >= this.N14263A23323) {
            return -1;
        }
        byte[] bArr = this.setPivotYN16904;
        this.D8871 = i4 + 1;
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

    private cr(InputStream inputStream, int[] iArr, int i4, byte[] bArr, int i5, int i10, byte b2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.component13 = LottieConstants.IterateForever;
        this.C20232 = 1;
        this.setPivotYN16904 = new byte[8];
        this.vD14832N6715 = new byte[8];
        this.component5 = new byte[8];
        this.D8871 = 8;
        this.N14263A23323 = 8;
        this.component8 = Math.min(Math.max(i5, 5), 16);
        this.setTopP6481 = i10;
        if (i10 == 3) {
            System.arraycopy(bArr, 0, this.vD14832N6715, 0, 8);
        }
        long j5 = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i4 == 0) {
            this.sG29839 = (int) j5;
            long j6 = j5 >> 3;
            short s3 = component9;
            this.kC4266 = (int) ((s3 * j6) >> 32);
            this.Y16199 = (int) (j5 >> 32);
            this.cW27173 = (int) (j6 + s3);
        } else {
            int i11 = (int) j5;
            this.sG29839 = i11;
            this.kC4266 = i11 * i4;
            this.Y16199 = i4 ^ i11;
            this.cW27173 = (int) (j5 >> 32);
        }
        this.component10 = 100;
        this.rP23717 = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) throws IOException {
        int i10 = i4 + i5;
        for (int i11 = i4; i11 < i10; i11++) {
            component5();
            int i12 = this.D8871;
            if (i12 >= this.N14263A23323) {
                if (i11 == i4) {
                    return -1;
                }
                return i5 - (i10 - i11);
            }
            byte[] bArr2 = this.setPivotYN16904;
            this.D8871 = i12 + 1;
            bArr[i11] = bArr2[i12];
        }
        return i5;
    }
}
