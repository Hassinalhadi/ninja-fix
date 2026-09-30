package E5;

import java.io.Closeable;

/* loaded from: classes3.dex */
public final class k implements Closeable, AutoCloseable {
    public Kd.a alpha;
    public F5.e purple;
    public Kd.a red;
    public F5.e silver;
    public Kd.a teal;
    public Kd.a white;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((L5.h) ((L5.d) this.teal.get())).close();
    }
}
