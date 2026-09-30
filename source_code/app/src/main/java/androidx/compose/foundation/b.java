package androidx.compose.foundation;

import A0.h;
import T.p;
import T.s;
import Xd.m;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import b.D;
import b.H;
import f.InterfaceC1673j;
import kotlin.jvm.functions.Function0;
import t0.AbstractC2911e0;

/* loaded from: classes3.dex */
public final class b implements m {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ h red;
    public final /* synthetic */ Function0 silver;

    public b(boolean z2, String str, h hVar, Function0 function0) {
        this.alpha = z2;
        this.purple = str;
        this.red = hVar;
        this.silver = function0;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC1673j interfaceC1673j;
        s alpha;
        ((Number) obj3).intValue();
        C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
        c0585q.purple(-756081143);
        D d4 = (D) c0585q.kilo(d.alpha);
        boolean z2 = d4 instanceof H;
        if (z2) {
            c0585q.purple(-1604682242);
            c0585q.quebec(false);
            interfaceC1673j = null;
        } else {
            c0585q.purple(-1604549624);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = ad.xray(c0585q);
            }
            interfaceC1673j = (InterfaceC1673j) jade;
            c0585q.quebec(false);
        }
        InterfaceC1673j interfaceC1673j2 = interfaceC1673j;
        boolean z10 = this.alpha;
        String str = this.purple;
        h hVar = this.red;
        Function0 function0 = this.silver;
        if (z2) {
            alpha = new ClickableElement(interfaceC1673j2, (H) d4, false, z10, str, hVar, function0);
        } else if (d4 == null) {
            alpha = new ClickableElement(interfaceC1673j2, null, false, z10, str, hVar, function0);
        } else {
            p pVar = p.alpha;
            if (interfaceC1673j2 != null) {
                alpha = d.alpha(pVar, interfaceC1673j2, d4).then(new ClickableElement(interfaceC1673j2, null, false, z10, str, hVar, function0));
            } else {
                alpha = T.a.alpha(pVar, AbstractC2911e0.alpha, new c(d4, z10, str, hVar, function0));
            }
        }
        c0585q.quebec(false);
        return alpha;
    }
}
