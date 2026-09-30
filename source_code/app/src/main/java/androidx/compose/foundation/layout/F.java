package androidx.compose.foundation.layout;

/* loaded from: classes3.dex */
public final class F extends T.r implements s0.Z {
    public float alpha;
    public boolean purple;

    @Override // s0.Z
    public final Object tango(Q0.d dVar, Object obj) {
        P p4;
        if (obj instanceof P) {
            p4 = (P) obj;
        } else {
            p4 = null;
        }
        if (p4 == null) {
            p4 = new P();
        }
        p4.alpha = this.alpha;
        p4.bravo = this.purple;
        return p4;
    }
}
