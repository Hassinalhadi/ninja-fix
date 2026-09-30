package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes3.dex */
public final class C0 implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView alpha;

    public C0(SearchView searchView) {
        this.alpha = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        SearchView searchView = this.alpha;
        View.OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
