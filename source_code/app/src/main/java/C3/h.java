package C3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class h implements Closeable, AutoCloseable {
    public final /* synthetic */ int alpha;
    public final FileInputStream purple;
    public final Charset red;
    public byte[] silver;
    public int teal;
    public int white;

    public h(FileInputStream fileInputStream, Charset charset, int i4) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                if (charset != null) {
                    if (charset.equals(i9.g.alpha)) {
                        this.purple = fileInputStream;
                        this.red = charset;
                        this.silver = new byte[8192];
                        return;
                    }
                    throw new IllegalArgumentException("Unsupported encoding");
                }
                throw null;
            default:
                if (charset != null) {
                    if (charset.equals(i.alpha)) {
                        this.purple = fileInputStream;
                        this.red = charset;
                        this.silver = new byte[8192];
                        return;
                    }
                    throw new IllegalArgumentException("Unsupported encoding");
                }
                throw null;
        }
    }

    private final void charlie() {
        synchronized (this.purple) {
            try {
                if (this.silver != null) {
                    this.silver = null;
                    this.purple.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String foxtrot() {
        int i4;
        synchronized (this.purple) {
            try {
                byte[] bArr = this.silver;
                if (bArr != null) {
                    if (this.teal >= this.white) {
                        int read = this.purple.read(bArr, 0, bArr.length);
                        if (read != -1) {
                            this.teal = 0;
                            this.white = read;
                        } else {
                            throw new EOFException();
                        }
                    }
                    for (int i5 = this.teal; i5 != this.white; i5++) {
                        byte[] bArr2 = this.silver;
                        if (bArr2[i5] == 10) {
                            int i10 = this.teal;
                            if (i5 != i10) {
                                i4 = i5 - 1;
                                if (bArr2[i4] == 13) {
                                    String str = new String(bArr2, i10, i4 - i10, this.red.name());
                                    this.teal = i5 + 1;
                                    return str;
                                }
                            }
                            i4 = i5;
                            String str2 = new String(bArr2, i10, i4 - i10, this.red.name());
                            this.teal = i5 + 1;
                            return str2;
                        }
                    }
                    g gVar = new g(this, (this.white - this.teal) + 80, 0);
                    while (true) {
                        byte[] bArr3 = this.silver;
                        int i11 = this.teal;
                        gVar.write(bArr3, i11, this.white - i11);
                        this.white = -1;
                        byte[] bArr4 = this.silver;
                        int read2 = this.purple.read(bArr4, 0, bArr4.length);
                        if (read2 != -1) {
                            this.teal = 0;
                            this.white = read2;
                            for (int i12 = 0; i12 != this.white; i12++) {
                                byte[] bArr5 = this.silver;
                                if (bArr5[i12] == 10) {
                                    int i13 = this.teal;
                                    if (i12 != i13) {
                                        gVar.write(bArr5, i13, i12 - i13);
                                    }
                                    this.teal = i12 + 1;
                                    return gVar.toString();
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                } else {
                    throw new IOException("LineReader is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.alpha) {
            case 0:
                charlie();
                return;
            default:
                synchronized (this.purple) {
                    try {
                        if (this.silver != null) {
                            this.silver = null;
                            this.purple.close();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final String echo() {
        String gVar;
        int i4;
        switch (this.alpha) {
            case 0:
                return foxtrot();
            default:
                synchronized (this.purple) {
                    try {
                        byte[] bArr = this.silver;
                        if (bArr != null) {
                            if (this.teal >= this.white) {
                                int read = this.purple.read(bArr, 0, bArr.length);
                                if (read != -1) {
                                    this.teal = 0;
                                    this.white = read;
                                } else {
                                    throw new EOFException();
                                }
                            }
                            int i5 = this.teal;
                            while (true) {
                                if (i5 != this.white) {
                                    byte[] bArr2 = this.silver;
                                    if (bArr2[i5] == 10) {
                                        int i10 = this.teal;
                                        if (i5 != i10) {
                                            i4 = i5 - 1;
                                            if (bArr2[i4] == 13) {
                                                gVar = new String(bArr2, i10, i4 - i10, this.red.name());
                                                this.teal = i5 + 1;
                                            }
                                        }
                                        i4 = i5;
                                        gVar = new String(bArr2, i10, i4 - i10, this.red.name());
                                        this.teal = i5 + 1;
                                    } else {
                                        i5++;
                                    }
                                } else {
                                    g gVar2 = new g(this, (this.white - this.teal) + 80, 1);
                                    while (true) {
                                        byte[] bArr3 = this.silver;
                                        int i11 = this.teal;
                                        gVar2.write(bArr3, i11, this.white - i11);
                                        this.white = -1;
                                        byte[] bArr4 = this.silver;
                                        int read2 = this.purple.read(bArr4, 0, bArr4.length);
                                        if (read2 != -1) {
                                            this.teal = 0;
                                            this.white = read2;
                                            for (int i12 = 0; i12 != this.white; i12++) {
                                                byte[] bArr5 = this.silver;
                                                if (bArr5[i12] == 10) {
                                                    int i13 = this.teal;
                                                    if (i12 != i13) {
                                                        gVar2.write(bArr5, i13, i12 - i13);
                                                    }
                                                    this.teal = i12 + 1;
                                                    gVar = gVar2.toString();
                                                }
                                            }
                                        } else {
                                            throw new EOFException();
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IOException("LineReader is closed");
                        }
                    } finally {
                    }
                }
                return gVar;
        }
    }
}
