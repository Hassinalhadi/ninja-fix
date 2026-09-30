package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0658c implements ar {
    public final Object alpha;

    @Override // androidx.recyclerview.widget.ar
    public void onChanged(int i4, int i5, Object obj) {
        ((aq) this.alpha).notifyItemRangeChanged(i4, i5, obj);
    }

    @Override // androidx.recyclerview.widget.ar
    public void onInserted(int i4, int i5) {
        ((aq) this.alpha).notifyItemRangeInserted(i4, i5);
    }

    @Override // androidx.recyclerview.widget.ar
    public void onMoved(int i4, int i5) {
        ((aq) this.alpha).notifyItemMoved(i4, i5);
    }

    @Override // androidx.recyclerview.widget.ar
    public void onRemoved(int i4, int i5) {
        ((aq) this.alpha).notifyItemRangeRemoved(i4, i5);
    }
}
