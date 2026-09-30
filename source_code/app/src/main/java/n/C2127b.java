package n;

import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y.AbstractC3355O;
import y.C3354N;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2127b implements Xd.m {
    public static final C2127b purple = new C2127b(0);
    public static final C2127b red = new C2127b(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C2127b(int i4) {
        this.alpha = i4;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        int i4;
        switch (this.alpha) {
            case 0:
                T.s sVar = (T.s) obj;
                ((Number) obj3).intValue();
                C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
                c0585q.purple(-2126899193);
                long j5 = ((C3354N) c0585q.kilo(AbstractC3355O.alpha)).alpha;
                T.p pVar = T.p.alpha;
                boolean foxtrot = c0585q.foxtrot(j5);
                Object jade = c0585q.jade();
                if (foxtrot || jade == C0580l.alpha) {
                    jade = new com.clevertap.android.sdk.inapp.evaluation.a(j5, 1);
                    c0585q.f(jade);
                }
                T.s then = sVar.then(androidx.compose.ui.draw.a.bravo(pVar, (Function1) jade));
                c0585q.quebec(false);
                return then;
            default:
                Xd.l lVar = (Xd.l) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((C0585q) interfaceC0581m).india(lVar)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue |= i4;
                }
                if ((intValue & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                if (c0585q2.magenta(intValue & 1, z2)) {
                    lVar.invoke(c0585q2, Integer.valueOf(intValue & 14));
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
