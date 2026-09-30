package Zb;

import F.P2;
import F.ag;
import Lb.H;
import Xd.l;
import a0.C0366t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ Function0 silver;

    public /* synthetic */ f(Function0 function0, boolean z2, Function0 function02) {
        this.alpha = 4;
        this.red = function0;
        this.purple = z2;
        this.silver = function02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        Function0 function0 = this.silver;
        boolean z10 = this.purple;
        Function0 function02 = this.red;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                g.delta(z10, function02, function0, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                g.delta(z10, function02, function0, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                d.echo(z10, function02, function0, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                d.echo(z10, function02, function0, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(1 & intValue, z2)) {
                    P.d dVar = d.delta;
                    P.d echo = P.e.echo(1464485232, new Ec.l(function02, 8), c0585q);
                    P.d echo2 = P.e.echo(-1790536217, new H(function0, 3, z10), c0585q);
                    float f5 = P2.alpha;
                    long j5 = C0366t.bravo;
                    long j6 = C0366t.echo;
                    ag.alpha(dVar, null, echo, echo2, 0.0f, null, P2.alpha(j5, j6, j6, j6, c0585q), c0585q, 3462);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(boolean z2, Function0 function0, Function0 function02, int i4, int i5) {
        this.alpha = i5;
        this.purple = z2;
        this.red = function0;
        this.silver = function02;
    }
}
