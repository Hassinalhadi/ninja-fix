package Tb;

import T.p;
import T.s;
import Xd.l;
import a0.C0366t;
import a0.InterfaceC0342ab;
import a0.ap;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3076w3;
import t6.W3;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;

    public /* synthetic */ a(int i4, boolean z2) {
        this.alpha = i4;
        this.purple = z2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        long j5;
        boolean z10;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    AbstractC1680b charlie = AbstractC3076w3.charlie(R.drawable.blackcheck, c0585q, 6);
                    s kilo = V.kilo(p.alpha, 20);
                    if (this.purple) {
                        j5 = C0366t.echo;
                    } else {
                        j5 = Db.c.beige;
                    }
                    z.s.alpha(charlie, null, kilo, j5, c0585q, 432, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                if (c0585q2.magenta(intValue & 1, z10)) {
                    AbstractC1680b charlie2 = AbstractC3076w3.charlie(R.drawable.chevron_right, c0585q2, 6);
                    s kilo2 = V.kilo(p.alpha, 16);
                    final boolean z11 = this.purple;
                    boolean hotel = c0585q2.hotel(z11);
                    Object jade = c0585q2.jade();
                    if (hotel || jade == C0580l.alpha) {
                        jade = new Function1() { // from class: pa.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                float f5;
                                InterfaceC0342ab graphicsLayer = (InterfaceC0342ab) obj3;
                                Intrinsics.echo(graphicsLayer, "$this$graphicsLayer");
                                if (z11) {
                                    f5 = -1.0f;
                                } else {
                                    f5 = 1.0f;
                                }
                                ((ap) graphicsLayer).hotel(f5);
                                return Unit.INSTANCE;
                            }
                        };
                        c0585q2.f(jade);
                    }
                    W3.alpha(charlie2, null, androidx.compose.ui.graphics.a.alpha(kilo2, (Function1) jade), null, null, 0.0f, null, c0585q2, 48, 120);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
