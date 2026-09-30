package com.google.android.material.internal;

import android.widget.ImageButton;

/* loaded from: classes2.dex */
public abstract class ad extends ImageButton {
    public int alpha;

    public final void alpha(int i4, boolean z2) {
        super.setVisibility(i4);
        if (z2) {
            this.alpha = i4;
        }
    }

    public final int getUserSetVisibility() {
        return this.alpha;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        alpha(i4, true);
    }
}
