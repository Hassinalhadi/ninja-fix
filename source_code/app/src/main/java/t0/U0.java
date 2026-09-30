package t0;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC0587t;
import androidx.compose.runtime.C0590w;
import bx.C0769g;
import com.google.android.gms.internal.measurement.C1298c;
import delivery.samurai.android.R;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3017k3;

/* loaded from: classes3.dex */
public abstract class U0 {
    public static final ViewGroup.LayoutParams alpha = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final T0 alpha(AbstractC2902a abstractC2902a, AbstractC0587t abstractC0587t, P.d dVar) {
        C2946x c2946x;
        Object tag;
        T0 t02 = null;
        if (AbstractC2905b0.alpha.compareAndSet(false, true)) {
            xf.e bravo = AbstractC3017k3.bravo(1, 6, null);
            vf.ad.zulu(vf.ad.charlie((Nd.h) ay.e.getValue()), null, null, new C2903a0(bravo, null), 3);
            C0769g c0769g = new C0769g(21, bravo);
            synchronized (S.n.charlie) {
                S.n.india = CollectionsKt.plus(S.n.india, c0769g);
            }
            S.n.alpha();
        }
        if (abstractC2902a.getChildCount() > 0) {
            View childAt = abstractC2902a.getChildAt(0);
            if (childAt instanceof C2946x) {
                c2946x = (C2946x) childAt;
                if (c2946x == null) {
                    c2946x = new C2946x(abstractC2902a.getContext(), abstractC0587t.juliet());
                    abstractC2902a.addView(c2946x.getView(), alpha);
                }
                C2932p c2932p = AbstractC2911e0.alpha;
                tag = c2946x.getView().getTag(R.id.wrapped_composition_tag);
                if (tag instanceof T0) {
                    t02 = (T0) tag;
                }
                if (t02 == null) {
                    t02 = new T0(c2946x, new C0590w(abstractC0587t, new C1298c(c2946x.getRoot())));
                    c2946x.getView().setTag(R.id.wrapped_composition_tag, t02);
                }
                t02.bravo(dVar);
                if (!Intrinsics.areEqual(c2946x.getCoroutineContext(), abstractC0587t.juliet())) {
                    c2946x.setCoroutineContext(abstractC0587t.juliet());
                }
                return t02;
            }
        } else {
            abstractC2902a.removeAllViews();
        }
        c2946x = null;
        if (c2946x == null) {
        }
        C2932p c2932p2 = AbstractC2911e0.alpha;
        tag = c2946x.getView().getTag(R.id.wrapped_composition_tag);
        if (tag instanceof T0) {
        }
        if (t02 == null) {
        }
        t02.bravo(dVar);
        if (!Intrinsics.areEqual(c2946x.getCoroutineContext(), abstractC0587t.juliet())) {
        }
        return t02;
    }
}
