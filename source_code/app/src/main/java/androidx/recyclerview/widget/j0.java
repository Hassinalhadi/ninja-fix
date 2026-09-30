package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public final class j0 extends Q {
    public boolean alpha = false;
    public final /* synthetic */ au bravo;

    public j0(au auVar) {
        this.bravo = auVar;
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        super.onScrollStateChanged(recyclerView, i4);
        if (i4 == 0 && this.alpha) {
            this.alpha = false;
            this.bravo.foxtrot();
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onScrolled(RecyclerView recyclerView, int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.alpha = true;
    }
}
