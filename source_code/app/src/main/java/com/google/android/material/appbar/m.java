package com.google.android.material.appbar;

import android.view.View;
import java.util.WeakHashMap;
import s1.au;

/* loaded from: classes2.dex */
public final class m {
    public final View alpha;
    public int bravo;
    public int charlie;
    public int delta;
    public int echo;
    public boolean foxtrot = true;
    public boolean golf = true;

    public m(View view) {
        this.alpha = view;
    }

    public final void alpha() {
        int i4 = this.delta;
        View view = this.alpha;
        int top = i4 - (view.getTop() - this.bravo);
        WeakHashMap weakHashMap = au.alpha;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(this.echo - (view.getLeft() - this.charlie));
    }

    public final boolean bravo(int i4) {
        if (this.foxtrot && this.delta != i4) {
            this.delta = i4;
            alpha();
            return true;
        }
        return false;
    }
}
