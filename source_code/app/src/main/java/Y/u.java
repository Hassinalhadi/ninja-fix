package Y;

/* loaded from: classes3.dex */
public final class u extends T.r implements t {
    public s alpha;

    @Override // T.r
    public final void onAttach() {
        super.onAttach();
        this.alpha.alpha.bravo(this);
    }

    @Override // T.r
    public final void onDetach() {
        this.alpha.alpha.lima(this);
        super.onDetach();
    }
}
