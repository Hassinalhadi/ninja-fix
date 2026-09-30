package t0;

import android.view.View;
import android.view.ViewParent;
import delivery.samurai.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;

/* loaded from: classes3.dex */
public final class w0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC2902a purple;

    public /* synthetic */ w0(AbstractC2902a abstractC2902a, int i4) {
        this.alpha = i4;
        this.purple = abstractC2902a;
    }

    private final void alpha(View view) {
    }

    private final void bravo(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i4 = this.alpha;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z2;
        Boolean bool;
        switch (this.alpha) {
            case 0:
                this.purple.delta();
                return;
            default:
                AbstractC2902a abstractC2902a = this.purple;
                Intrinsics.echo(abstractC2902a, "<this>");
                Iterator it = AbstractC2360j.lima(abstractC2902a.getParent(), s1.ay.alpha).iterator();
                while (true) {
                    z2 = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            Intrinsics.echo(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            if (tag instanceof Boolean) {
                                bool = (Boolean) tag;
                            } else {
                                bool = null;
                            }
                            if (bool != null) {
                                z2 = bool.booleanValue();
                            }
                            if (z2) {
                                z2 = true;
                            }
                        }
                    }
                }
                if (!z2) {
                    abstractC2902a.delta();
                    return;
                }
                return;
        }
    }
}
