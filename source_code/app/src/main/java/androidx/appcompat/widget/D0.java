package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes3.dex */
public final class D0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchView alpha;

    public D0(SearchView searchView) {
        this.alpha = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i5, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.alpha.adjustDropDownSizeAndPosition();
    }
}
