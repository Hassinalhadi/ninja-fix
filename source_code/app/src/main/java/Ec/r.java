package Ec;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.AbstractC2787u6;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ int silver;

    public /* synthetic */ r(int i4, int i5, String str, Function0 function0) {
        this.alpha = i5;
        this.purple = str;
        this.red = function0;
        this.silver = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                num.getClass();
                s.alpha(this.purple, this.red, interfaceC0581m, C0564b.cyan(this.silver | 1));
                return Unit.INSTANCE;
            default:
                num.intValue();
                AbstractC2787u6.bronze(this.purple, this.red, interfaceC0581m, C0564b.cyan(this.silver | 1));
                return Unit.INSTANCE;
        }
    }
}
