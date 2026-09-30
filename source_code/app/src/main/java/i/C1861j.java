package i;

import androidx.compose.foundation.lazy.layout.as;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import j.C1922e;
import j.C1924g;
import j.C1925h;
import kotlin.Unit;

/* renamed from: i.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1861j implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.w red;

    public /* synthetic */ C1861j(androidx.compose.foundation.lazy.layout.w wVar, int i4, int i5) {
        this.alpha = i5;
        this.red = wVar;
        this.purple = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    C1862k c1862k = (C1862k) this.red;
                    as asVar = c1862k.bravo.bravo;
                    int i4 = this.purple;
                    androidx.compose.foundation.lazy.layout.g bravo = asVar.bravo(i4);
                    ((C1858g) bravo.charlie).charlie.invoke(c1862k.charlie, Integer.valueOf(i4 - bravo.alpha), c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    as asVar2 = ((C1924g) this.red).bravo.charlie;
                    int i5 = this.purple;
                    androidx.compose.foundation.lazy.layout.g bravo2 = asVar2.bravo(i5);
                    ((C1922e) bravo2.charlie).charlie.invoke(C1925h.alpha, Integer.valueOf(i5 - bravo2.alpha), c0585q2, 6);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
