package i9;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* renamed from: i9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1906b extends FilterOutputStream implements AutoCloseable {
    public final /* synthetic */ C1907c alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1906b(C1907c c1907c, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.alpha = c1907c;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.alpha.charlie = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.alpha.charlie = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i4) {
        try {
            ((FilterOutputStream) this).out.write(i4);
        } catch (IOException unused) {
            this.alpha.charlie = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i5) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i4, i5);
        } catch (IOException unused) {
            this.alpha.charlie = true;
        }
    }
}
