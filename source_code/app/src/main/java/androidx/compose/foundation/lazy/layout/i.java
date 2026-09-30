package androidx.compose.foundation.lazy.layout;

import d.C1527e;
import fe.C1715g;
import g.AbstractC1719b;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import s6.J4;
import vf.InterfaceC3206j;

/* loaded from: classes3.dex */
public final class i {
    public final J.e alpha;

    public i(int i4) {
        switch (i4) {
            case 1:
                this.alpha = new J.e(new C1527e[16]);
                return;
            default:
                this.alpha = new J.e(new h[16]);
                return;
        }
    }

    public void alpha(CancellationException cancellationException) {
        J.e eVar = this.alpha;
        int i4 = eVar.red;
        InterfaceC3206j[] interfaceC3206jArr = new InterfaceC3206j[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            interfaceC3206jArr[i5] = ((C1527e) eVar.alpha[i5]).bravo;
        }
        for (int i10 = 0; i10 < i4; i10++) {
            interfaceC3206jArr[i10].delta(cancellationException);
        }
        if (eVar.red == 0) {
            return;
        }
        AbstractC1719b.charlie("uncancelled requests present");
    }

    public void bravo() {
        J.e eVar = this.alpha;
        C1715g hotel = J4.hotel(0, eVar.red);
        int i4 = hotel.alpha;
        int i5 = hotel.purple;
        if (i4 <= i5) {
            while (true) {
                ((C1527e) eVar.alpha[i4]).bravo.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                if (i4 == i5) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        eVar.india();
    }
}
