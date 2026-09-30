package androidx.appcompat.widget;

import w1.AbstractC3233a;

/* loaded from: classes3.dex */
public final class B0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SearchView purple;

    public /* synthetic */ B0(SearchView searchView, int i4) {
        this.alpha = i4;
        this.purple = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                AbstractC3233a abstractC3233a = this.purple.mSuggestionsAdapter;
                if (abstractC3233a instanceof R0) {
                    abstractC3233a.bravo(null);
                    return;
                }
                return;
            default:
                this.purple.updateFocusedState();
                return;
        }
    }
}
