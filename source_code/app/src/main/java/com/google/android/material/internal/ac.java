package com.google.android.material.internal;

import android.view.View;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class ac implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int alpha;

    private final void alpha(View view) {
    }

    private final void bravo(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        z1.g gVar;
        switch (this.alpha) {
            case 0:
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                return;
            default:
                if (view != null) {
                    gVar = (z1.g) view.getTag(R.id.dataBinding);
                } else {
                    gVar = null;
                }
                gVar.alpha.run();
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i4 = this.alpha;
    }
}
