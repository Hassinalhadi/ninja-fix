package k9;

import F8.q;

/* loaded from: classes2.dex */
public final class e extends K3.b {
    public final K3.b silver;
    public final q teal;
    public final d white;

    public e(K3.b bVar, q qVar, d dVar) {
        super((byte) 0, 2);
        this.silver = bVar;
        this.teal = qVar;
        this.white = dVar;
    }

    @Override // K3.b
    public final int mike(int i4) {
        if (this.white.alpha(i4)) {
            return this.teal.alpha;
        }
        return this.silver.mike(i4);
    }
}
