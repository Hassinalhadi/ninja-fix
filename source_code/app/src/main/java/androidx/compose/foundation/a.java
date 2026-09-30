package androidx.compose.foundation;

import A0.h;
import T.p;
import T.s;
import a0.C0346af;
import a0.ao;
import a0.as;
import android.view.KeyEvent;
import b.C0704t;
import b.D;
import b.H;
import b.ae;
import b.av;
import d.C1543m;
import d.InterfaceC1532g0;
import d.K;
import f.C1674k;
import f.InterfaceC1673j;
import k0.AbstractC1994a;
import k0.AbstractC1996c;
import kotlin.jvm.functions.Function0;
import t0.AbstractC2911e0;
import t6.AbstractC3087z;

/* loaded from: classes3.dex */
public abstract class a {
    public static s alpha(s sVar, C0346af c0346af) {
        return sVar.then(new BackgroundElement(0L, c0346af, ao.alpha, AbstractC2911e0.alpha, 1));
    }

    public static final s bravo(s sVar, long j5, as asVar) {
        return sVar.then(new BackgroundElement(j5, null, asVar, AbstractC2911e0.alpha, 2));
    }

    public static s charlie(s sVar, InterfaceC1673j interfaceC1673j, D d4, boolean z2, h hVar, Function0 function0, int i4) {
        s alpha;
        if ((i4 & 4) != 0) {
            z2 = true;
        }
        boolean z10 = z2;
        if ((i4 & 16) != 0) {
            hVar = null;
        }
        h hVar2 = hVar;
        if (d4 instanceof H) {
            alpha = new ClickableElement(interfaceC1673j, (H) d4, false, z10, null, hVar2, function0);
        } else if (d4 == null) {
            alpha = new ClickableElement(interfaceC1673j, null, false, z10, null, hVar2, function0);
        } else {
            p pVar = p.alpha;
            if (interfaceC1673j != null) {
                alpha = d.alpha(pVar, interfaceC1673j, d4).then(new ClickableElement(interfaceC1673j, null, false, z10, null, hVar2, function0));
            } else {
                alpha = T.a.alpha(pVar, AbstractC2911e0.alpha, new c(d4, z10, null, hVar2, function0));
            }
        }
        return sVar.then(alpha);
    }

    public static /* synthetic */ s delta(s sVar, boolean z2, String str, h hVar, Function0 function0, int i4) {
        if ((i4 & 1) != 0) {
            z2 = true;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        if ((i4 & 4) != 0) {
            hVar = null;
        }
        return T.a.alpha(sVar, AbstractC2911e0.alpha, new b(z2, str, hVar, function0));
    }

    public static s echo(int i4, s sVar, String str, Function0 function0, boolean z2) {
        if ((i4 & 1) != 0) {
            z2 = true;
        }
        boolean z10 = z2;
        if ((i4 & 2) != 0) {
            str = null;
        }
        return sVar.then(new ClickableElement(null, null, true, z10, str, null, function0));
    }

    public static s foxtrot(s sVar, InterfaceC1673j interfaceC1673j, Function0 function0) {
        return sVar.then(new CombinedClickableElement(interfaceC1673j, function0));
    }

    public static final s golf(s sVar, boolean z2, InterfaceC1673j interfaceC1673j) {
        s sVar2;
        if (z2) {
            sVar2 = new FocusableElement(interfaceC1673j);
        } else {
            sVar2 = p.alpha;
        }
        return sVar.then(sVar2);
    }

    public static s hotel(s sVar, InterfaceC1673j interfaceC1673j) {
        return sVar.then(new HoverableElement(interfaceC1673j));
    }

    public static final boolean india(KeyEvent keyEvent) {
        long delta = AbstractC1996c.delta(keyEvent);
        int i4 = AbstractC1994a.papa;
        if (!AbstractC1994a.alpha(delta, AbstractC1994a.hotel) && !AbstractC1994a.alpha(delta, AbstractC1994a.kilo) && !AbstractC1994a.alpha(delta, AbstractC1994a.oscar) && !AbstractC1994a.alpha(delta, AbstractC1994a.juliet)) {
            return false;
        }
        return true;
    }

    public static s juliet(s sVar, InterfaceC1532g0 interfaceC1532g0, K k6, boolean z2, C1543m c1543m, C1674k c1674k, boolean z10, C0704t c0704t) {
        s alpha;
        float f5 = ae.alpha;
        K k10 = K.alpha;
        p pVar = p.alpha;
        if (k6 == k10) {
            alpha = AbstractC3087z.alpha(pVar, av.charlie);
        } else {
            alpha = AbstractC3087z.alpha(pVar, av.bravo);
        }
        return sVar.then(alpha).then(new ScrollingContainerElement(c0704t, c1543m, k6, interfaceC1532g0, c1674k, z2, z10));
    }
}
