package Ec;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ int silver;

    public /* synthetic */ n(int i4, Function0 function0, int i5, int i10) {
        this.alpha = i10;
        this.purple = i4;
        this.red = function0;
        this.silver = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                num.getClass();
                int cyan = C0564b.cyan(this.silver | 1);
                p.alpha(this.red, this.purple, interfaceC0581m, cyan);
                return Unit.INSTANCE;
            case 1:
                num.intValue();
                int cyan2 = C0564b.cyan(this.silver | 1);
                Sb.d.echo(this.red, this.purple, interfaceC0581m, cyan2);
                return Unit.INSTANCE;
            default:
                num.intValue();
                int cyan3 = C0564b.cyan(this.silver | 1);
                Sb.d.juliet(this.red, this.purple, interfaceC0581m, cyan3);
                return Unit.INSTANCE;
        }
    }
}
