package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0112h extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ P.d red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0112h(P.d dVar, P.d dVar2, int i4) {
        super(2);
        this.alpha = i4;
        this.purple = dVar;
        this.red = dVar2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = 0;
        P.d dVar = this.purple;
        P.d dVar2 = this.red;
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
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                c0585q2.purple(1497073862);
                if (dVar != null) {
                    dVar.invoke(c0585q2, 0);
                }
                c0585q2.quebec(false);
                dVar2.invoke(c0585q2, 0);
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                    if (c0585q3.bronze()) {
                        c0585q3.ochre();
                        return Unit.INSTANCE;
                    }
                }
                float f5 = AbstractC0128l.alpha;
                AbstractC0128l.bravo(P.e.echo(1887135077, new C0112h(dVar, dVar2, i4), interfaceC0581m2), interfaceC0581m2, 438);
                return Unit.INSTANCE;
        }
    }
}
