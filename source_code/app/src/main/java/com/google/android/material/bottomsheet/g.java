package com.google.android.material.bottomsheet;

import android.view.View;

/* loaded from: classes2.dex */
public final class g implements View.OnClickListener {
    public final /* synthetic */ l alpha;

    public g(l lVar) {
        this.alpha = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.alpha;
        if (lVar.cancelable && lVar.isShowing() && lVar.shouldWindowCloseOnTouchOutside()) {
            lVar.cancel();
        }
    }
}
