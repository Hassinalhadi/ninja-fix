package Ac;

import Ec.x;
import F.O;
import F.P2;
import F.Q;
import F.ag;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.address.model.ButtonViewItem;
import com.checkout.components.address.AbstractC0870k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import xb.AbstractC3318b;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Xd.l {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ Function0 silver;

    public /* synthetic */ f(String str, boolean z2, Function0 function0) {
        this.purple = str;
        this.red = z2;
        this.silver = function0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        Function0 function0 = this.silver;
        Object obj3 = this.purple;
        boolean z10 = this.red;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                q.alpha((String) obj3, z10, function0, (InterfaceC0581m) obj, C0564b.cyan(1));
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
                if (c0585q.magenta(1 & intValue, z2)) {
                    P.d echo = P.e.echo(178574768, new i((String) obj3, 22), c0585q);
                    P.d echo2 = P.e.echo(-163104146, new x(z10, function0, 4), c0585q);
                    float f5 = P2.alpha;
                    E0 e02 = Q.alpha;
                    ag.delta(echo, null, echo2, AbstractC3318b.delta, 0.0f, null, P2.delta(((O) c0585q.kilo(e02)).papa, 0L, ((O) c0585q.kilo(e02)).quebec, c0585q, 22), c0585q, 390, 178);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                return AbstractC0870k.a(z10, (ButtonViewItem) obj3, function0, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ f(String str, boolean z2, Function0 function0, int i4) {
        this.purple = str;
        this.red = z2;
        this.silver = function0;
    }

    public /* synthetic */ f(boolean z2, ButtonViewItem buttonViewItem, Function0 function0) {
        this.red = z2;
        this.purple = buttonViewItem;
        this.silver = function0;
    }
}
