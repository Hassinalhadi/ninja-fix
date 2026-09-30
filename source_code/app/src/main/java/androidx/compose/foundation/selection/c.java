package androidx.compose.foundation.selection;

import A0.h;
import T.p;
import T.s;
import Xd.m;
import androidx.compose.foundation.d;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import b.D;
import f.InterfaceC1673j;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class c implements m {
    public final /* synthetic */ D alpha;
    public final /* synthetic */ C0.a purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ h silver;
    public final /* synthetic */ Function0 teal;

    public c(h hVar, C0.a aVar, D d4, Function0 function0, boolean z2) {
        this.alpha = d4;
        this.purple = aVar;
        this.red = z2;
        this.silver = hVar;
        this.teal = function0;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
        c0585q.purple(-1525724089);
        Object jade = c0585q.jade();
        if (jade == C0580l.alpha) {
            jade = ad.xray(c0585q);
        }
        InterfaceC1673j interfaceC1673j = (InterfaceC1673j) jade;
        s alpha = d.alpha(p.alpha, interfaceC1673j, this.alpha);
        h hVar = this.silver;
        s then = alpha.then(new TriStateToggleableElement(this.purple, interfaceC1673j, null, this.red, hVar, this.teal));
        c0585q.quebec(false);
        return then;
    }
}
