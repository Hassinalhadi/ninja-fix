package androidx.appcompat.widget;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class Y implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ViewGroup purple;

    public /* synthetic */ Y(ViewGroup viewGroup, int i4) {
        this.alpha = i4;
        this.purple = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                Z z2 = (Z) this.purple;
                z2.e = null;
                z2.drawableStateChanged();
                return;
            default:
                ((Toolbar) this.purple).uniform();
                return;
        }
    }
}
