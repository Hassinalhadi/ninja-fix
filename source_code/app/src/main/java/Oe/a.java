package Oe;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;

/* loaded from: classes2.dex */
public final class a extends FilterInputStream {
    public final /* synthetic */ int alpha = 1;
    public int purple;

    public a(Y3.e eVar) {
        super(eVar);
        this.purple = RecyclerView.UNDEFINED_DURATION;
    }

    private final synchronized void echo(int i4) {
        super.mark(i4);
        this.purple = i4;
    }

    private final synchronized void foxtrot() {
        super.reset();
        this.purple = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.alpha) {
            case 0:
                return Math.min(super.available(), this.purple);
            default:
                int i4 = this.purple;
                if (i4 == Integer.MIN_VALUE) {
                    return super.available();
                }
                return Math.min(i4, super.available());
        }
    }

    public long charlie(long j5) {
        int i4 = this.purple;
        if (i4 == 0) {
            return -1L;
        }
        if (i4 != Integer.MIN_VALUE && j5 > i4) {
            return i4;
        }
        return j5;
    }

    public void golf(long j5) {
        int i4 = this.purple;
        if (i4 != Integer.MIN_VALUE && j5 != -1) {
            this.purple = (int) (i4 - j5);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        switch (this.alpha) {
            case 1:
                echo(i4);
                return;
            default:
                super.mark(i4);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.alpha) {
            case 0:
                if (this.purple <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read < 0) {
                    return read;
                }
                this.purple--;
                return read;
            default:
                if (charlie(1L) == -1) {
                    return -1;
                }
                int read2 = super.read();
                golf(1L);
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.alpha) {
            case 1:
                foxtrot();
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) {
        switch (this.alpha) {
            case 0:
                long skip = super.skip(Math.min(j5, this.purple));
                if (skip >= 0) {
                    this.purple = (int) (this.purple - skip);
                }
                return skip;
            default:
                long charlie = charlie(j5);
                if (charlie == -1) {
                    return 0L;
                }
                long skip2 = super.skip(charlie);
                golf(skip2);
                return skip2;
        }
    }

    public a(ByteArrayInputStream byteArrayInputStream, int i4) {
        super(byteArrayInputStream);
        this.purple = i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        switch (this.alpha) {
            case 0:
                int i10 = this.purple;
                if (i10 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i4, Math.min(i5, i10));
                if (read < 0) {
                    return read;
                }
                this.purple -= read;
                return read;
            default:
                int charlie = (int) charlie(i5);
                if (charlie == -1) {
                    return -1;
                }
                int read2 = super.read(bArr, i4, charlie);
                golf(read2);
                return read2;
        }
    }
}
