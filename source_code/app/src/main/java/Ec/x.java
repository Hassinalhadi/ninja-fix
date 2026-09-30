package Ec;

import F.AbstractC0127k2;
import F.K1;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m.AbstractC2094g;
import xb.AbstractC3318b;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Function0 red;

    public /* synthetic */ x(boolean z2, Function0 function0, int i4) {
        this.alpha = i4;
        this.purple = z2;
        this.red = function0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                ap.hotel(this.purple, this.red, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    AbstractC0127k2.alpha(null, AbstractC2094g.bravo(16), 0L, 0L, 0.0f, 0.0f, null, P.e.echo(1410077101, new x(this.purple, this.red, 3), c0585q), c0585q, 12582912, 125);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                Vc.c.charlie(this.purple, this.red, (InterfaceC0581m) obj, C0564b.cyan(7));
                return Unit.INSTANCE;
            case 3:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    Uc.b.alpha(0, null, c0585q2, this.red, this.purple);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    if (this.purple) {
                        c0585q3.purple(-1427549535);
                        K1.foxtrot(this.red, null, false, null, AbstractC3318b.echo, c0585q3, 196608, 30);
                    } else {
                        c0585q3.purple(-1430702700);
                    }
                    c0585q3.quebec(false);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ x(boolean z2, Function0 function0, int i4, int i5) {
        this.alpha = i5;
        this.purple = z2;
        this.red = function0;
    }
}
