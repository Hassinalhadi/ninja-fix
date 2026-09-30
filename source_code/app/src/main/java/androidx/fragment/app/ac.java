package androidx.fragment.app;

import android.view.View;

/* loaded from: classes3.dex */
public final class ac implements androidx.lifecycle.aj {
    public final /* synthetic */ ai alpha;

    public ac(ai aiVar) {
        this.alpha = aiVar;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar) {
        View view;
        if (aaVar == androidx.lifecycle.aa.ON_STOP && (view = this.alpha.mView) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
