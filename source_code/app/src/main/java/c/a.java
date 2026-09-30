package c;

import T.p;
import Xd.m;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class a implements m {
    public static final a alpha = new Object();

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        int i4;
        c cVar = (c) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((C0585q) interfaceC0581m).golf(cVar)) {
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
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(V.echo(V.charlie(AbstractC0538d.uniform(p.alpha, 0.0f, f.lima, 1), 1.0f), f.kilo), cVar.charlie, ao.alpha), c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
