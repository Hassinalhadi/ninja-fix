package t0;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import p0.AbstractC2264a;

/* loaded from: classes3.dex */
public final class A0 implements B0 {
    public static final A0 alpha = new Object();

    @Override // t0.B0
    public final Function0 bravo(AbstractC2902a abstractC2902a) {
        if (abstractC2902a.isAttachedToWindow()) {
            androidx.lifecycle.al delta = androidx.lifecycle.T.delta(abstractC2902a);
            if (delta != null) {
                return W.bravo(abstractC2902a, delta.getLifecycle());
            }
            AbstractC2264a.charlie("View tree for " + abstractC2902a + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        z0 z0Var = new z0(abstractC2902a, objectRef);
        abstractC2902a.addOnAttachStateChangeListener(z0Var);
        objectRef.alpha = new qa.j(7, abstractC2902a, z0Var);
        return new y0(objectRef);
    }
}
