package t0;

import android.view.View;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref;
import p0.AbstractC2264a;

/* loaded from: classes3.dex */
public final class z0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AbstractC2902a alpha;
    public final /* synthetic */ Ref.ObjectRef purple;

    public z0(AbstractC2902a abstractC2902a, Ref.ObjectRef objectRef) {
        this.alpha = abstractC2902a;
        this.purple = objectRef;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC2902a abstractC2902a = this.alpha;
        androidx.lifecycle.al delta = androidx.lifecycle.T.delta(abstractC2902a);
        if (delta != null) {
            this.purple.alpha = W.bravo(abstractC2902a, delta.getLifecycle());
            abstractC2902a.removeOnAttachStateChangeListener(this);
        } else {
            AbstractC2264a.charlie("View tree for " + abstractC2902a + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
