package c;

import T.p;
import Xd.l;
import Xd.m;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import g.AbstractC1719b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class d implements m {
    public final /* synthetic */ l alpha;
    public final /* synthetic */ m purple;
    public final /* synthetic */ Function0 red;

    public d(l lVar, m mVar, Function0 function0) {
        this.alpha = lVar;
        this.purple = mVar;
        this.red = function0;
    }

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
            String str = (String) this.alpha.invoke(c0585q, 0);
            if (StringsKt.gray(str)) {
                AbstractC1719b.charlie("Label must not be blank");
            }
            g.charlie(str, cVar, p.alpha, this.purple, this.red, c0585q, (intValue << 6) & 896);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
