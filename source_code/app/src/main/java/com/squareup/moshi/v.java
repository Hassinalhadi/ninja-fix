package com.squareup.moshi;

/* loaded from: classes2.dex */
public final class v implements Tf.ao, AutoCloseable {
    public final /* synthetic */ w alpha;

    public v(w wVar) {
        this.alpha = wVar;
    }

    @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.alpha;
        if (wVar.peekScope() == 9) {
            int i4 = wVar.stackSize;
            wVar.stackSize = i4 - 1;
            int[] iArr = wVar.pathIndices;
            int i5 = i4 - 2;
            iArr[i5] = iArr[i5] + 1;
            return;
        }
        throw new AssertionError();
    }

    @Override // Tf.ao, java.io.Flushable
    public final void flush() {
        this.alpha.alpha.flush();
    }

    @Override // Tf.ao
    public final Tf.as timeout() {
        return Tf.as.NONE;
    }

    @Override // Tf.ao
    public final void write(Tf.k kVar, long j5) {
        this.alpha.alpha.write(kVar, j5);
    }
}
