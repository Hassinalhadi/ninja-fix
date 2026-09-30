package y;

import a0.C0352f;
import a0.C0360n;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t6.AbstractC3032n3;

/* renamed from: y.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3368h implements Xd.m {
    public final /* synthetic */ Function0 alpha;
    public final /* synthetic */ boolean purple;

    public C3368h(Function0 function0, boolean z2) {
        this.alpha = function0;
        this.purple = z2;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        T.s sVar = (T.s) obj;
        ((Number) obj3).intValue();
        C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
        c0585q.purple(-196777734);
        final long j5 = ((C3354N) c0585q.kilo(AbstractC3355O.alpha)).alpha;
        boolean foxtrot = c0585q.foxtrot(j5);
        final Function0 function0 = this.alpha;
        boolean golf = foxtrot | c0585q.golf(function0);
        final boolean z2 = this.purple;
        boolean hotel = golf | c0585q.hotel(z2);
        Object jade = c0585q.jade();
        if (hotel || jade == C0580l.alpha) {
            jade = new Function1() { // from class: y.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    X.c cVar = (X.c) obj4;
                    final C0352f delta = AbstractC3032n3.delta(cVar, Float.intBitsToFloat((int) (cVar.alpha.bravo() >> 32)) / 2.0f);
                    final C0360n c0360n = new C0360n(j5, 5);
                    final Function0 function02 = function0;
                    final boolean z10 = z2;
                    return cVar.charlie(new Function1() { // from class: y.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            s0.an anVar = (s0.an) obj5;
                            anVar.charlie();
                            if (!((Boolean) Function0.this.invoke()).booleanValue()) {
                                return Unit.INSTANCE;
                            }
                            C0352f c0352f = delta;
                            C0360n c0360n2 = c0360n;
                            c0.b bVar = anVar.alpha;
                            if (z10) {
                                long orange = bVar.orange();
                                J2.t tVar = bVar.purple;
                                long oscar = tVar.oscar();
                                tVar.mike().golf();
                                try {
                                    ((av.ah) tVar.alpha).purple(-1.0f, 1.0f, orange);
                                    bVar.foxtrot(c0352f, c0360n2);
                                } finally {
                                    ao.ad.coral(tVar, oscar);
                                }
                            } else {
                                bVar.foxtrot(c0352f, c0360n2);
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            };
            c0585q.f(jade);
        }
        T.s bravo = androidx.compose.ui.draw.a.bravo(sVar, (Function1) jade);
        c0585q.quebec(false);
        return bravo;
    }
}
