package k9;

import S5.k;
import androidx.recyclerview.widget.B;

/* loaded from: classes2.dex */
public final class c extends B {
    public final /* synthetic */ k alpha;

    public c(k kVar) {
        this.alpha = kVar;
    }

    @Override // androidx.recyclerview.widget.B
    public final void onChanged() {
        k kVar = this.alpha;
        ((d) kVar.silver).notifyDataSetChanged();
        k.alpha(kVar);
    }

    @Override // androidx.recyclerview.widget.B
    public final void onItemRangeChanged(int i4, int i5) {
        k kVar = this.alpha;
        ((d) kVar.silver).notifyItemRangeChanged(i4, i5);
        k.alpha(kVar);
    }

    @Override // androidx.recyclerview.widget.B
    public final void onItemRangeInserted(int i4, int i5) {
        k kVar = this.alpha;
        ((d) kVar.silver).notifyItemRangeInserted(i4, i5);
        k.alpha(kVar);
    }

    @Override // androidx.recyclerview.widget.B
    public final void onItemRangeMoved(int i4, int i5, int i10) {
        k kVar = this.alpha;
        ((d) kVar.silver).notifyItemMoved(i4, i5);
        k.alpha(kVar);
    }

    @Override // androidx.recyclerview.widget.B
    public final void onItemRangeRemoved(int i4, int i5) {
        k kVar = this.alpha;
        ((d) kVar.silver).notifyItemRangeRemoved(i4, i5);
        k.alpha(kVar);
    }

    @Override // androidx.recyclerview.widget.B
    public final void onItemRangeChanged(int i4, int i5, Object obj) {
        k kVar = this.alpha;
        ((d) kVar.silver).notifyItemRangeChanged(i4, i5, obj);
        k.alpha(kVar);
    }
}
