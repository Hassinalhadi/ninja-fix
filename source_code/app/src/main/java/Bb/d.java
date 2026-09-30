package Bb;

import Ec.t;
import T.p;
import Xd.l;
import a0.C0366t;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.R;
import kotlin.Unit;
import s6.AbstractC2781u0;
import t6.AbstractC3086y3;
import t6.W3;
import ub.AbstractC3150c;
import vb.AbstractC3185a;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ String red;

    public /* synthetic */ d(String str, String str2, int i4) {
        this.alpha = i4;
        this.purple = str;
        this.red = str2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2781u0.alpha(this.purple, this.red, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2781u0.alpha(this.purple, this.red, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                t.echo(this.purple, this.red, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 3:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    W3.charlie(AbstractC3086y3.bravo(c0585q, R.string.shift_status), AbstractC3086y3.bravo(c0585q, R.string.upcoming), AbstractC3086y3.bravo(c0585q, R.string.shift_starts_time), this.purple, AbstractC3086y3.bravo(c0585q, R.string.shift_date), this.red, V.charlie(p.alpha, 1.0f), null, C0366t.echo, 0L, 0L, 0.0f, 0L, null, 0L, null, 0L, null, 0L, c0585q, 102236160, 523904);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC3185a.delta(this.purple, this.red, (InterfaceC0581m) obj, C0564b.cyan(391));
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    AbstractC3150c.echo(this.purple, this.red, null, 56, c0585q2, 3072);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(String str, String str2, int i4, int i5) {
        this.alpha = i5;
        this.purple = str;
        this.red = str2;
    }
}
