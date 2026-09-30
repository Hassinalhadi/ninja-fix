package androidx.compose.foundation;

import N2.ad;
import T.s;
import Vc.i;
import androidx.compose.runtime.aa;
import b.D;
import b.H;
import f.InterfaceC1673j;
import t0.AbstractC2911e0;

/* loaded from: classes3.dex */
public abstract class d {
    public static final aa alpha = new aa(new i(28));

    public static final s alpha(s sVar, InterfaceC1673j interfaceC1673j, D d4) {
        if (d4 == null) {
            return sVar;
        }
        if (d4 instanceof H) {
            return sVar.then(new IndicationModifierElement(interfaceC1673j, (H) d4));
        }
        return T.a.alpha(sVar, AbstractC2911e0.alpha, new ad(1, d4, interfaceC1673j));
    }
}
