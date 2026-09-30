package androidx.fragment.app;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class Q implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View alpha;

    public Q(View view) {
        this.alpha = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.alpha;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = s1.au.alpha;
        s1.aj.charlie(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
