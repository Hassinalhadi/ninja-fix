package q0;

/* renamed from: q0.O, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2379O {
    public final InterfaceC2381Q alpha;
    public al bravo;
    public final C2378N charlie = new C2378N(this, 2);
    public final C2378N delta = new C2378N(this, 0);
    public final C2378N echo = new C2378N(this, 1);

    public C2379O(InterfaceC2381Q interfaceC2381Q) {
        this.alpha = interfaceC2381Q;
    }

    public final al alpha() {
        al alVar = this.bravo;
        if (alVar != null) {
            return alVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
