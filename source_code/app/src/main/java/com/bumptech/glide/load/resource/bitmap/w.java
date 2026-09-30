package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class w extends FilterInputStream implements AutoCloseable {
    public volatile byte[] alpha;
    public int purple;
    public int red;
    public int silver;
    public int teal;
    public final G3.g white;

    public w(InputStream inputStream, G3.g gVar) {
        super(inputStream);
        this.silver = -1;
        this.white = gVar;
        this.alpha = (byte[]) gVar.echo(65536, byte[].class);
    }

    public static void foxtrot() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.alpha != null && inputStream != null) {
        } else {
            foxtrot();
            throw null;
        }
        return (this.purple - this.teal) + inputStream.available();
    }

    public final int charlie(InputStream inputStream, byte[] bArr) {
        int i4 = this.silver;
        if (i4 != -1) {
            int i5 = this.teal - i4;
            int i10 = this.red;
            if (i5 < i10) {
                if (i4 == 0 && i10 > bArr.length && this.purple == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i10) {
                        i10 = length;
                    }
                    byte[] bArr2 = (byte[]) this.white.echo(i10, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.alpha = bArr2;
                    this.white.juliet(bArr);
                    bArr = bArr2;
                } else if (i4 > 0) {
                    System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                }
                int i11 = this.teal - this.silver;
                this.teal = i11;
                this.silver = 0;
                this.purple = 0;
                int read = inputStream.read(bArr, i11, bArr.length - i11);
                int i12 = this.teal;
                if (read > 0) {
                    i12 += read;
                }
                this.purple = i12;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.silver = -1;
            this.teal = 0;
            this.purple = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.alpha != null) {
            this.white.juliet(this.alpha);
            this.alpha = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void echo() {
        if (this.alpha != null) {
            this.white.juliet(this.alpha);
            this.alpha = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i4) {
        this.red = Math.max(this.red, i4);
        this.silver = this.teal;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.alpha;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.teal >= this.purple && charlie(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.alpha && (bArr = this.alpha) == null) {
                foxtrot();
                throw null;
            }
            int i4 = this.purple;
            int i5 = this.teal;
            if (i4 - i5 <= 0) {
                return -1;
            }
            this.teal = i5 + 1;
            return bArr[i5] & 255;
        }
        foxtrot();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.alpha != null) {
            int i4 = this.silver;
            if (-1 != i4) {
                this.teal = i4;
            } else {
                final String str = "Mark has been invalidated, pos: " + this.teal + " markLimit: " + this.red;
                throw new IOException(str) { // from class: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream$InvalidMarkException
                    private static final long serialVersionUID = -4338378848813561757L;
                };
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j5) {
        if (j5 < 1) {
            return 0L;
        }
        byte[] bArr = this.alpha;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i4 = this.purple;
                int i5 = this.teal;
                if (i4 - i5 >= j5) {
                    this.teal = (int) (i5 + j5);
                    return j5;
                }
                long j6 = i4 - i5;
                this.teal = i4;
                if (this.silver != -1 && j5 <= this.red) {
                    if (charlie(inputStream, bArr) == -1) {
                        return j6;
                    }
                    int i10 = this.purple;
                    int i11 = this.teal;
                    if (i10 - i11 >= j5 - j6) {
                        this.teal = (int) ((i11 + j5) - j6);
                        return j5;
                    }
                    long j7 = (j6 + i10) - i11;
                    this.teal = i10;
                    return j7;
                }
                long skip = inputStream.skip(j5 - j6);
                if (skip > 0) {
                    this.silver = -1;
                }
                return j6 + skip;
            }
            foxtrot();
            throw null;
        }
        foxtrot();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i4, int i5) {
        int i10;
        int i11;
        byte[] bArr2 = this.alpha;
        if (bArr2 == null) {
            foxtrot();
            throw null;
        }
        if (i5 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i12 = this.teal;
            int i13 = this.purple;
            if (i12 < i13) {
                int i14 = i13 - i12;
                if (i14 >= i5) {
                    i14 = i5;
                }
                System.arraycopy(bArr2, i12, bArr, i4, i14);
                this.teal += i14;
                if (i14 == i5 || inputStream.available() == 0) {
                    return i14;
                }
                i4 += i14;
                i10 = i5 - i14;
            } else {
                i10 = i5;
            }
            while (true) {
                if (this.silver == -1 && i10 >= bArr2.length) {
                    i11 = inputStream.read(bArr, i4, i10);
                    if (i11 == -1) {
                        return i10 != i5 ? i5 - i10 : -1;
                    }
                } else {
                    if (charlie(inputStream, bArr2) == -1) {
                        return i10 != i5 ? i5 - i10 : -1;
                    }
                    if (bArr2 != this.alpha && (bArr2 = this.alpha) == null) {
                        foxtrot();
                        throw null;
                    }
                    int i15 = this.purple;
                    int i16 = this.teal;
                    i11 = i15 - i16;
                    if (i11 >= i10) {
                        i11 = i10;
                    }
                    System.arraycopy(bArr2, i16, bArr, i4, i11);
                    this.teal += i11;
                }
                i10 -= i11;
                if (i10 == 0) {
                    return i5;
                }
                if (inputStream.available() == 0) {
                    return i5 - i10;
                }
                i4 += i11;
            }
        } else {
            foxtrot();
            throw null;
        }
    }
}
