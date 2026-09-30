package androidx.recyclerview.widget;

import android.database.Observable;

/* loaded from: classes3.dex */
public final class A extends Observable {
    public final boolean alpha() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void bravo() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((B) ((Observable) this).mObservers.get(size)).onChanged();
        }
    }

    public final void charlie(int i4, int i5) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((B) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i4, i5, 1);
        }
    }

    public final void delta(int i4, int i5, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((B) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i4, i5, obj);
        }
    }

    public final void echo(int i4, int i5) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((B) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i4, i5);
        }
    }

    public final void foxtrot(int i4, int i5) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((B) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i4, i5);
        }
    }

    public final void golf() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((B) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
        }
    }
}
