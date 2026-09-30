package androidx.coordinatorlayout.widget;

import android.view.View;
import s1.InterfaceC2587u;
import s1.a0;

/* loaded from: classes3.dex */
public final class a implements InterfaceC2587u {
    public final /* synthetic */ CoordinatorLayout alpha;

    public a(CoordinatorLayout coordinatorLayout) {
        this.alpha = coordinatorLayout;
    }

    @Override // s1.InterfaceC2587u
    public final a0 gold(View view, a0 a0Var) {
        return this.alpha.setWindowInsets(a0Var);
    }
}
