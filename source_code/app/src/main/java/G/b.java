package G;

import F.G1;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class b extends Lambda implements Xd.m {
    public final /* synthetic */ long alpha;
    public final /* synthetic */ v purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j5, v vVar) {
        super(3);
        this.alpha = j5;
        this.purple = vVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i4;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((C0585q) interfaceC0581m).hotel(booleanValue)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            intValue |= i4;
        }
        if ((intValue & 19) == 18) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        if (booleanValue) {
            C0585q c0585q2 = (C0585q) interfaceC0581m;
            c0585q2.purple(576835739);
            G1.bravo(V.kilo(T.p.alpha, l.charlie), this.alpha, l.alpha, 0L, 0, c0585q2, 390, 24);
            c0585q2.quebec(false);
        } else {
            C0585q c0585q3 = (C0585q) interfaceC0581m;
            c0585q3.purple(577079337);
            v vVar = this.purple;
            boolean golf = c0585q3.golf(vVar);
            Object jade = c0585q3.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new Aa.g(17, vVar);
                c0585q3.f(jade);
            }
            l.bravo((Function0) jade, this.alpha, c0585q3, 0);
            c0585q3.quebec(false);
        }
        return Unit.INSTANCE;
    }
}
