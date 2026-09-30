package com.google.android.material.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class aa implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ View purple;

    public /* synthetic */ aa(int i4, View view) {
        this.alpha = i4;
        this.purple = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                View view = this.purple;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
            default:
                View view2 = this.purple;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                return;
        }
    }
}
