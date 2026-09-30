package L0;

import H0.ae;
import H0.af;
import H0.r;
import H0.s;
import H0.v;
import J2.t;
import Xd.n;
import android.graphics.Typeface;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import i.InterfaceC1854c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements n {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ c(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                d dVar = (d) this.purple;
                af bravo = ((H0.l) dVar.teal).bravo((H0.k) obj, (v) obj2, ((r) obj3).alpha, ((s) obj4).alpha);
                if (!(bravo instanceof ae)) {
                    t tVar = new t(bravo, dVar.f1702c);
                    dVar.f1702c = tVar;
                    Object obj5 = tVar.red;
                    Intrinsics.charlie(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                Object obj6 = ((ae) bravo).alpha;
                Intrinsics.charlie(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
            default:
                InterfaceC1854c stickyHeader = (InterfaceC1854c) obj;
                ((Integer) obj2).getClass();
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj3;
                int intValue = ((Integer) obj4).intValue();
                Intrinsics.echo(stickyHeader, "$this$stickyHeader");
                if ((intValue & 129) != 128) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    ((P.d) this.purple).invoke(c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
