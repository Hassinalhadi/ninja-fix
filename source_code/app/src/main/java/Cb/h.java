package Cb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.view.otp.OTPViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ int red;

    public /* synthetic */ h(int i4, int i5, Function0 function0) {
        this.alpha = i5;
        this.purple = function0;
        this.red = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit OTPView$lambda$8;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                num.getClass();
                z.charlie(this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 1:
                num.getClass();
                Zb.g.alpha(this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 2:
                num.getClass();
                Zb.d.delta(this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            default:
                OTPView$lambda$8 = OTPViewKt.OTPView$lambda$8(this.purple, this.red, interfaceC0581m, num.intValue());
                return OTPView$lambda$8;
        }
    }
}
