package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class z extends MediaDataSource implements AutoCloseable {
    public final /* synthetic */ ByteBuffer alpha;

    public z(ByteBuffer byteBuffer) {
        this.alpha = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.alpha.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j5, byte[] bArr, int i4, int i5) {
        ByteBuffer byteBuffer = this.alpha;
        if (j5 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j5);
        int min = Math.min(i5, byteBuffer.remaining());
        byteBuffer.get(bArr, i4, min);
        return min;
    }
}
