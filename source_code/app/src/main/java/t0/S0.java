package t0;

import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0575g0;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.C0589v;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import delivery.samurai.android.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class S0 extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ T0 purple;
    public final /* synthetic */ P.d red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S0(T0 t02, P.d dVar, int i4) {
        super(2);
        this.alpha = i4;
        this.purple = t02;
        this.red = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        Set set;
        View view;
        Object obj3;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    AndroidCompositionLocals_androidKt.alpha(this.purple.alpha, this.red, c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Number) obj2).intValue();
                boolean z11 = false;
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    T0 t02 = this.purple;
                    Object tag = t02.alpha.getTag(R.id.inspection_slot_table_set);
                    if ((tag instanceof Set) && (!(tag instanceof Yd.a) || (tag instanceof Yd.f))) {
                        z11 = true;
                    }
                    if (z11) {
                        set = (Set) tag;
                    } else {
                        set = null;
                    }
                    C2946x c2946x = t02.alpha;
                    if (set == null) {
                        Object parent = c2946x.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            obj3 = view.getTag(R.id.inspection_slot_table_set);
                        } else {
                            obj3 = null;
                        }
                        if ((obj3 instanceof Set) && (!(obj3 instanceof Yd.a) || (obj3 instanceof Yd.f))) {
                            set = (Set) obj3;
                        } else {
                            set = null;
                        }
                    }
                    if (set != null) {
                        C0589v c0589v = c0585q2.maroon;
                        if (c0589v == null) {
                            c0589v = new C0589v(c0585q2.hotel);
                            c0585q2.maroon = c0589v;
                        }
                        set.add(c0589v);
                        c0585q2.quebec = true;
                        c0585q2.beige = true;
                        c0585q2.charlie.bravo();
                        c0585q2.crimson.bravo();
                        androidx.compose.runtime.j0 j0Var = c0585q2.cyan;
                        C0575g0 c0575g0 = j0Var.alpha;
                        j0Var.echo = c0575g0.f3005c;
                        j0Var.foxtrot = c0575g0.f3006d;
                    }
                    boolean india = c0585q2.india(t02);
                    Object jade = c0585q2.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    if (india || jade == asVar) {
                        jade = new Q0(t02, null);
                        c0585q2.f(jade);
                    }
                    C0564b.foxtrot((Xd.l) jade, c0585q2, c2946x);
                    boolean india2 = c0585q2.india(t02);
                    Object jade2 = c0585q2.jade();
                    if (india2 || jade2 == asVar) {
                        jade2 = new R0(t02, null);
                        c0585q2.f(jade2);
                    }
                    C0564b.foxtrot((Xd.l) jade2, c0585q2, c2946x);
                    C0564b.alpha(androidx.compose.runtime.tooling.e.alpha.alpha(set), P.e.echo(-280240369, new S0(t02, this.red, 0), c0585q2), c0585q2, 56);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
