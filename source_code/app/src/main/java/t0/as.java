package t0;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class as extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as(int i4, Object obj, Object obj2) {
        super(1);
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    private final Object alpha(Object obj) {
        ay ayVar = (ay) this.purple;
        az azVar = (az) this.red;
        synchronized (ayVar.silver) {
            ayVar.white.remove(azVar);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        w.v vVar;
        boolean z2;
        switch (this.alpha) {
            case 0:
                C2909d0 c2909d0 = (C2909d0) this.purple;
                synchronized (c2909d0.charlie) {
                    try {
                        c2909d0.echo = true;
                        J.e eVar = c2909d0.delta;
                        Object[] objArr = eVar.alpha;
                        int i4 = eVar.red;
                        for (int i5 = 0; i5 < i4; i5++) {
                            I0.o oVar = (I0.o) ((s0.k0) objArr[i5]).get();
                            if (oVar != null && (vVar = oVar.bravo) != null) {
                                oVar.alpha(vVar);
                                oVar.bravo = null;
                            }
                        }
                        c2909d0.delta.india();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                I0.ab abVar = ((au) this.red).purple;
                abVar.bravo.set(null);
                abVar.alpha.echo();
                return Unit.INSTANCE;
            case 1:
                return alpha(obj);
            case 2:
                ((Choreographer) ((androidx.compose.runtime.D) this.purple).purple).removeFrameCallback((az) this.red);
                return Unit.INSTANCE;
            case 3:
                View view = (View) obj;
                Y.m mVar = new Y.m(view.getNextFocusForwardId(), 2);
                View view2 = null;
                View view3 = null;
                while (true) {
                    View golf = W.golf(view, mVar, view3);
                    if (golf == null && view != ((ViewGroup) this.purple)) {
                        Object parent = view.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view4 = (View) parent;
                            view3 = view;
                            view = view4;
                        }
                    }
                }
                if (view2 == ((View) this.red)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                C2926m c2926m = (C2926m) obj;
                T0 t02 = (T0) this.purple;
                if (!t02.red) {
                    androidx.lifecycle.ac lifecycle = c2926m.alpha.getLifecycle();
                    P.d dVar = (P.d) this.red;
                    t02.teal = dVar;
                    if (t02.silver == null) {
                        t02.silver = lifecycle;
                        lifecycle.alpha(t02);
                    } else if (lifecycle.bravo().compareTo(androidx.lifecycle.ab.red) >= 0) {
                        t02.purple.azure(new P.d(new S0(t02, dVar, 1), 1330788943, true));
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
