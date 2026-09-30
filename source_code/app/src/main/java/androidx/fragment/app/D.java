package androidx.fragment.app;

/* loaded from: classes3.dex */
public final class D implements O {
    public final /* synthetic */ ai alpha;

    public D(ai aiVar) {
        this.alpha = aiVar;
    }

    @Override // androidx.fragment.app.O
    public final void alpha(L l10, ai aiVar) {
        this.alpha.onAttachFragment(aiVar);
    }
}
