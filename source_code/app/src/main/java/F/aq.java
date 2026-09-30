package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class aq extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ kotlin.e silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq(long j5, Object obj, kotlin.e eVar, int i4) {
        super(2);
        this.alpha = i4;
        this.purple = j5;
        this.red = obj;
        this.silver = eVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                androidx.compose.material3.internal.i.alpha(this.purple, ((S2) ((C0585q) interfaceC0581m).kilo(T2.alpha)).mike, P.e.echo(1327513942, new C0092c(2, (androidx.compose.foundation.layout.M) this.red, (Xd.m) this.silver), interfaceC0581m), interfaceC0581m, 384);
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q2 = (C0585q) interfaceC0581m2;
                    if (c0585q2.bronze()) {
                        c0585q2.ochre();
                        return Unit.INSTANCE;
                    }
                }
                androidx.compose.material3.internal.at.bravo(this.purple, (D0.an) this.red, (Xd.l) this.silver, interfaceC0581m2, 0);
                return Unit.INSTANCE;
        }
    }
}
