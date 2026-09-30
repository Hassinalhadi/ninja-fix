package a5;

import F.K1;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.rememberme.Y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import wb.AbstractC3253e;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;

    public /* synthetic */ t(int i4, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                return Y0.a(this.purple, ((Integer) obj).intValue(), (String) obj2);
            default:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    Function1 function1 = this.purple;
                    boolean golf = c0585q.golf(function1);
                    Object jade = c0585q.jade();
                    if (golf || jade == C0580l.alpha) {
                        jade = new Cb.j(7, function1);
                        c0585q.f(jade);
                    }
                    K1.foxtrot((Function0) jade, null, false, null, AbstractC3253e.alpha, c0585q, 196608, 30);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
