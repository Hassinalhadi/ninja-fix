package k;

import T.r;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1991c extends r {
    public C1990b alpha;

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // T.r
    public final void onAttach() {
        C1990b c1990b = this.alpha;
        if (c1990b != null) {
            c1990b.alpha.lima(this);
        }
        if (c1990b != null) {
            c1990b.alpha.bravo(this);
        }
        this.alpha = c1990b;
    }

    @Override // T.r
    public final void onDetach() {
        C1990b c1990b = this.alpha;
        if (c1990b != null) {
            c1990b.alpha.lima(this);
        }
    }
}
