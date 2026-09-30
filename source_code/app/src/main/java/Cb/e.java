package Cb;

import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.ui.compose.showcase.ComponentShowcaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.I0;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ComponentShowcaseFragment purple;

    public /* synthetic */ e(ComponentShowcaseFragment componentShowcaseFragment, int i4) {
        this.alpha = i4;
        this.purple = componentShowcaseFragment;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
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
                    I0.alpha(P.e.echo(634911132, new e(this.purple, 1), c0585q), c0585q, 48);
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
                    ComponentShowcaseFragment componentShowcaseFragment = this.purple;
                    boolean india = c0585q2.india(componentShowcaseFragment);
                    Object jade = c0585q2.jade();
                    if (india || jade == C0580l.alpha) {
                        jade = new B2.q(3, componentShowcaseFragment);
                        c0585q2.f(jade);
                    }
                    z.charlie((Function0) jade, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
