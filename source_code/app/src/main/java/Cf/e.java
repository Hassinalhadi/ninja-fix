package Cf;

import vf.AbstractC3220y;

/* loaded from: classes2.dex */
public final class e extends h {
    public static final e red;

    /* JADX WARN: Type inference failed for: r0v0, types: [Cf.h, Cf.e, vf.y] */
    static {
        int i4 = k.charlie;
        int i5 = k.delta;
        long j5 = k.echo;
        String str = k.alpha;
        ?? abstractC3220y = new AbstractC3220y();
        abstractC3220y.purple = new c(str, j5, i4, i5);
        red = abstractC3220y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // vf.AbstractC3220y
    public final AbstractC3220y jade(int i4) {
        Af.f.alpha(i4);
        if (i4 >= k.charlie) {
            return this;
        }
        return super.jade(i4);
    }

    @Override // vf.AbstractC3220y
    public final String toString() {
        return "Dispatchers.Default";
    }
}
