package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class c extends OutputStream implements AutoCloseable {
    public final FileOutputStream alpha;
    public byte[] purple;
    public final G3.g red;
    public int silver;

    public c(FileOutputStream fileOutputStream, G3.g gVar) {
        this.alpha = fileOutputStream;
        this.red = gVar;
        this.purple = (byte[]) gVar.echo(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.alpha;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.purple;
            if (bArr != null) {
                this.red.juliet(bArr);
                this.purple = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i4 = this.silver;
        FileOutputStream fileOutputStream = this.alpha;
        if (i4 > 0) {
            fileOutputStream.write(this.purple, 0, i4);
            this.silver = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i4) {
        byte[] bArr = this.purple;
        int i5 = this.silver;
        int i10 = i5 + 1;
        this.silver = i10;
        bArr[i5] = (byte) i4;
        if (i10 != bArr.length || i10 <= 0) {
            return;
        }
        this.alpha.write(bArr, 0, i10);
        this.silver = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i5) {
        int i10 = 0;
        do {
            int i11 = i5 - i10;
            int i12 = i4 + i10;
            int i13 = this.silver;
            FileOutputStream fileOutputStream = this.alpha;
            if (i13 == 0 && i11 >= this.purple.length) {
                fileOutputStream.write(bArr, i12, i11);
                return;
            }
            int min = Math.min(i11, this.purple.length - i13);
            System.arraycopy(bArr, i12, this.purple, this.silver, min);
            int i14 = this.silver + min;
            this.silver = i14;
            i10 += min;
            byte[] bArr2 = this.purple;
            if (i14 == bArr2.length && i14 > 0) {
                fileOutputStream.write(bArr2, 0, i14);
                this.silver = 0;
            }
        } while (i10 < i5);
    }
}
