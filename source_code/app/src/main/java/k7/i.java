package k7;

import android.view.View;

/* loaded from: classes2.dex */
public final class i implements View.OnLayoutChangeListener {
    public final /* synthetic */ View alpha;
    public final /* synthetic */ j purple;

    public i(j jVar, View view) {
        this.purple = jVar;
        this.alpha = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i5, int i10, int i11, int i12, int i13, int i14, int i15) {
        View view2 = this.alpha;
        if (view2.getVisibility() == 0) {
            this.purple.charlie(view2);
        }
    }
}
