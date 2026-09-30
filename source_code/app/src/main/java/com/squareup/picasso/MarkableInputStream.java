package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class MarkableInputStream extends InputStream implements AutoCloseable {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_LIMIT_INCREMENT = 1024;
    private boolean allowExpire;
    private long defaultMark;
    private final InputStream in;
    private long limit;
    private int limitIncrement;
    private long offset;
    private long reset;

    public MarkableInputStream(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void setLimit(long j5) {
        try {
            long j6 = this.reset;
            long j7 = this.offset;
            if (j6 < j7 && j7 <= this.limit) {
                this.in.reset();
                this.in.mark((int) (j5 - this.reset));
                skip(this.reset, this.offset);
            } else {
                this.reset = j7;
                this.in.mark((int) (j5 - j7));
            }
            this.limit = j5;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    private void skip(long j5, long j6) throws IOException {
        while (j5 < j6) {
            long skip = this.in.skip(j6 - j5);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j5 += skip;
        }
    }

    public void allowMarksToExpire(boolean z2) {
        this.allowExpire = z2;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.defaultMark = savePosition(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.allowExpire) {
            long j5 = this.offset + 1;
            long j6 = this.limit;
            if (j5 > j6) {
                setLimit(j6 + this.limitIncrement);
            }
        }
        int read = this.in.read();
        if (read != -1) {
            this.offset++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        reset(this.defaultMark);
    }

    public long savePosition(int i4) {
        long j5 = this.offset + i4;
        if (this.limit < j5) {
            setLimit(j5);
        }
        return this.offset;
    }

    public MarkableInputStream(InputStream inputStream, int i4) {
        this(inputStream, i4, 1024);
    }

    public void reset(long j5) throws IOException {
        if (this.offset <= this.limit && j5 >= this.reset) {
            this.in.reset();
            skip(this.reset, j5);
            this.offset = j5;
            return;
        }
        throw new IOException("Cannot reset");
    }

    private MarkableInputStream(InputStream inputStream, int i4, int i5) {
        this.defaultMark = -1L;
        this.allowExpire = true;
        this.limitIncrement = -1;
        this.in = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i4);
        this.limitIncrement = i5;
    }

    @Override // java.io.InputStream
    public long skip(long j5) throws IOException {
        if (!this.allowExpire) {
            long j6 = this.offset;
            if (j6 + j5 > this.limit) {
                setLimit(j6 + j5 + this.limitIncrement);
            }
        }
        long skip = this.in.skip(j5);
        this.offset += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.allowExpire) {
            long j5 = this.offset;
            if (bArr.length + j5 > this.limit) {
                setLimit(j5 + bArr.length + this.limitIncrement);
            }
        }
        int read = this.in.read(bArr);
        if (read != -1) {
            this.offset += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (!this.allowExpire) {
            long j5 = this.offset;
            long j6 = i5;
            if (j5 + j6 > this.limit) {
                setLimit(j5 + j6 + this.limitIncrement);
            }
        }
        int read = this.in.read(bArr, i4, i5);
        if (read != -1) {
            this.offset += read;
        }
        return read;
    }
}
