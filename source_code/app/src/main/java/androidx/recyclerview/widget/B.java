package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public abstract class B {
    public void onChanged() {
    }

    public void onItemRangeChanged(int i4, int i5) {
    }

    public abstract void onItemRangeInserted(int i4, int i5);

    public void onItemRangeMoved(int i4, int i5, int i10) {
    }

    public void onItemRangeRemoved(int i4, int i5) {
    }

    public void onStateRestorationPolicyChanged() {
    }

    public void onItemRangeChanged(int i4, int i5, Object obj) {
        onItemRangeChanged(i4, i5);
    }
}
