package t6;

import af.AbstractC0436g;
import af.C0440k;
import af.C0441l;
import af.C0442m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.C0593z;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: t6.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3022l3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [ae.ac, java.lang.Object, af.k] */
    public static final void alpha(boolean z2, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-642000585);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(lVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) == 18 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            androidx.compose.runtime.ax black = C0564b.black(lVar, c0585q);
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                C0593z c0593z = new C0593z(C0564b.november(c0585q));
                c0585q.f(c0593z);
                jade = c0593z;
            }
            vf.ab abVar = ((C0593z) jade).alpha;
            Object jade2 = c0585q.jade();
            Object obj = jade2;
            if (jade2 == asVar) {
                Xd.l lVar2 = (Xd.l) black.getValue();
                ?? acVar = new ae.ac(z2);
                acVar.alpha = abVar;
                acVar.bravo = lVar2;
                c0585q.f(acVar);
                obj = acVar;
            }
            C0440k c0440k = (C0440k) obj;
            boolean golf = c0585q.golf((Xd.l) black.getValue()) | c0585q.golf(abVar);
            Object jade3 = c0585q.jade();
            if (golf || jade3 == asVar) {
                c0440k.bravo = (Xd.l) black.getValue();
                c0440k.alpha = abVar;
                c0585q.f(Unit.INSTANCE);
            }
            Boolean valueOf = Boolean.valueOf(z2);
            boolean india = c0585q.india(c0440k);
            if ((i5 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10 | india;
            Object jade4 = c0585q.jade();
            if (z11 || jade4 == asVar) {
                jade4 = new C0441l(c0440k, z2, null);
                c0585q.f(jade4);
            }
            C0564b.foxtrot((Xd.l) jade4, c0585q, valueOf);
            ae.aj alpha = AbstractC0436g.alpha(c0585q);
            if (alpha != null) {
                ae.ai onBackPressedDispatcher = alpha.getOnBackPressedDispatcher();
                androidx.lifecycle.al alVar = (androidx.lifecycle.al) c0585q.kilo(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean india2 = c0585q.india(onBackPressedDispatcher) | c0585q.india(alVar) | c0585q.india(c0440k);
                Object jade5 = c0585q.jade();
                if (india2 || jade5 == asVar) {
                    jade5 = new C1.av(onBackPressedDispatcher, alVar, c0440k, 6);
                    c0585q.f(jade5);
                }
                C0564b.charlie(alVar, onBackPressedDispatcher, (Function1) jade5, c0585q);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0442m(z2, lVar, i4);
        }
    }
}
