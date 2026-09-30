package s0;

/* loaded from: classes3.dex */
public final class g0 extends T.r {
    public boolean alpha;

    @Override // T.r
    public final void onAttach() {
        this.alpha = true;
    }

    @Override // T.r
    public final void onDetach() {
        this.alpha = false;
    }

    public final String toString() {
        return "<tail>";
    }
}
