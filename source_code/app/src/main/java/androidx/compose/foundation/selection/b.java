package androidx.compose.foundation.selection;

import A0.h;
import T.n;
import T.p;
import T.s;
import androidx.compose.foundation.d;
import androidx.compose.material3.MinimumInteractiveModifier;
import b.D;
import b.H;
import f.InterfaceC1673j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t0.AbstractC2911e0;

/* loaded from: classes3.dex */
public abstract class b {
    public static final s alpha(s sVar, boolean z2, InterfaceC1673j interfaceC1673j, D d4, boolean z10, h hVar, Function0 function0) {
        s alpha;
        if (d4 instanceof H) {
            alpha = new SelectableElement(z2, interfaceC1673j, (H) d4, z10, hVar, function0);
        } else if (d4 == null) {
            alpha = new SelectableElement(z2, interfaceC1673j, null, z10, hVar, function0);
        } else {
            p pVar = p.alpha;
            if (interfaceC1673j != null) {
                alpha = d.alpha(pVar, interfaceC1673j, d4).then(new SelectableElement(z2, interfaceC1673j, null, z10, hVar, function0));
            } else {
                alpha = T.a.alpha(pVar, AbstractC2911e0.alpha, new a(d4, z2, z10, hVar, function0));
            }
        }
        return sVar.then(alpha);
    }

    public static final s bravo(MinimumInteractiveModifier minimumInteractiveModifier, boolean z2, InterfaceC1673j interfaceC1673j, boolean z10, h hVar, Function1 function1) {
        ToggleableElement toggleableElement = new ToggleableElement(z2, interfaceC1673j, z10, hVar, function1);
        minimumInteractiveModifier.getClass();
        return Q0.c.charlie(minimumInteractiveModifier, toggleableElement);
    }

    public static final s charlie(h hVar, C0.a aVar, D d4, Function0 function0, boolean z2) {
        if (d4 instanceof H) {
            return new TriStateToggleableElement(aVar, null, (H) d4, z2, hVar, function0);
        }
        if (d4 == null) {
            return new TriStateToggleableElement(aVar, null, null, z2, hVar, function0);
        }
        return new n(AbstractC2911e0.alpha, new c(hVar, aVar, d4, function0, z2));
    }
}
