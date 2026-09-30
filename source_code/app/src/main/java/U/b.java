package U;

import T.s;
import a0.ao;
import android.view.autofill.AutofillManager;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import i.InterfaceC1854c;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.r;
import m.C2093f;
import ob.AbstractC2210c;
import q0.C2391j;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s0.al;
import t6.AbstractC3087z;
import t6.W3;

/* loaded from: classes3.dex */
public final class b extends Lambda implements Xd.n {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, al alVar) {
        super(4);
        this.purple = cVar;
        this.red = alVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.io.File] */
    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i4;
        int i5;
        int i10;
        Object obj5 = this.red;
        Object obj6 = this.purple;
        switch (this.alpha) {
            case 0:
                c cVar = (c) obj6;
                cVar.foxtrot.set(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                ((AutofillManager) cVar.alpha.purple).requestAutofill(cVar.charlie, ((al) obj5).purple, cVar.foxtrot);
                return Unit.INSTANCE;
            default:
                InterfaceC1854c interfaceC1854c = (InterfaceC1854c) obj;
                int intValue = ((Number) obj2).intValue();
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((C0585q) interfaceC0581m).golf(interfaceC1854c)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    i4 = i10 | intValue2;
                } else {
                    i4 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((C0585q) interfaceC0581m).echo(intValue)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    i4 |= i5;
                }
                if ((i4 & 147) == 146) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                String str = (String) ((ArrayList) obj6).get(intValue);
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                c0585q2.purple(1846648521);
                T.p pVar = T.p.alpha;
                float f5 = ob.n.alpha;
                C2093f c2093f = (C2093f) obj5;
                s bravo = androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.kilo(pVar, ob.n.alpha), c2093f), AbstractC2210c.alpha, ao.alpha);
                c0585q2.purple(-1048794762);
                c0585q2.quebec(false);
                s then = bravo.then(pVar);
                ap delta = AbstractC0547m.delta(T.d.alpha, false);
                int romeo = C0564b.romeo(c0585q2);
                I mike = c0585q2.mike();
                s charlie = T.a.charlie(then, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q2, delta);
                C0564b.blue(C2551k.echo, c0585q2, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                    ad.blue(romeo, c0585q2, romeo, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q2, charlie);
                if (!r.quebec(str, "http://", true) && !r.quebec(str, "https://", true)) {
                    str = new File(str);
                }
                W3.alpha(N2.p.juliet(str, c0585q2, 0), null, AbstractC3087z.alpha(V.charlie, c2093f), null, C2391j.alpha, 0.0f, null, c0585q2, 24624, 104);
                c0585q2.quebec(true);
                c0585q2.quebec(false);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArrayList arrayList, C2093f c2093f) {
        super(4);
        float f5 = ob.n.alpha;
        this.purple = arrayList;
        this.red = c2093f;
    }
}
