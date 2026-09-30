package tg;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class i implements ug.b {
    public final h alpha = new h();
    public final b bravo;

    public i() {
        new ConcurrentHashMap();
        this.bravo = new b();
    }

    @Override // ug.b
    public final ug.a alpha() {
        return this.bravo;
    }

    @Override // ug.b
    public final rg.a bravo() {
        return this.alpha;
    }

    @Override // ug.b
    public final String charlie() {
        throw new UnsupportedOperationException();
    }
}
