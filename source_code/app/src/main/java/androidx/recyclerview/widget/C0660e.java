package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0660e extends AbstractC0674t {
    public final /* synthetic */ androidx.fragment.app.c0 alpha;

    public C0660e(androidx.fragment.app.c0 c0Var) {
        this.alpha = c0Var;
    }

    @Override // androidx.recyclerview.widget.AbstractC0674t
    public final boolean areContentsTheSame(int i4, int i5) {
        androidx.fragment.app.c0 c0Var = this.alpha;
        Object obj = c0Var.red.get(i4);
        Object obj2 = c0Var.silver.get(i5);
        if (obj != null && obj2 != null) {
            return ((AbstractC0677w) ((C0663h) c0Var.white).bravo.bravo).areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.AbstractC0674t
    public final boolean areItemsTheSame(int i4, int i5) {
        androidx.fragment.app.c0 c0Var = this.alpha;
        Object obj = c0Var.red.get(i4);
        Object obj2 = c0Var.silver.get(i5);
        if (obj != null && obj2 != null) {
            return ((AbstractC0677w) ((C0663h) c0Var.white).bravo.bravo).areItemsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC0674t
    public final Object getChangePayload(int i4, int i5) {
        androidx.fragment.app.c0 c0Var = this.alpha;
        Object obj = c0Var.red.get(i4);
        Object obj2 = c0Var.silver.get(i5);
        if (obj != null && obj2 != null) {
            return ((AbstractC0677w) ((C0663h) c0Var.white).bravo.bravo).getChangePayload(obj, obj2);
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.AbstractC0674t
    public final int getNewListSize() {
        return this.alpha.silver.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC0674t
    public final int getOldListSize() {
        return this.alpha.red.size();
    }
}
