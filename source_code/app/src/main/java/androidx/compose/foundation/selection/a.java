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
public final class a implements m {
    public final /* synthetic */ D alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ h silver;
    public final /* synthetic */ Function0 teal;

    public a(D d4, boolean z2, boolean z10, h hVar, Function0 function0) {
        this.alpha = d4;
        this.purple = z2;
        this.red = z10;
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
        s then = d.alpha(p.alpha, interfaceC1673j, this.alpha).then(new SelectableElement(this.purple, interfaceC1673j, null, this.red, this.silver, this.teal));
        c0585q.quebec(false);
        return then;
    }
}
