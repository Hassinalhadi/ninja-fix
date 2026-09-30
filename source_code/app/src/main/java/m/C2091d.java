package m;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2091d implements InterfaceC2089b {
    public final float alpha;

    public C2091d(float f5) {
        this.alpha = f5;
    }

    @Override // m.InterfaceC2089b
    public final float alpha(long j5, Q0.d dVar) {
        return dVar.lavender(this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2091d) || !Q0.g.alpha(this.alpha, ((C2091d) obj).alpha)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.alpha);
    }

    public final String toString() {
        return "CornerSize(size = " + this.alpha + ".dp)";
    }
}
