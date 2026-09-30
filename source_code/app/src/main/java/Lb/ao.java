package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class ao implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ T.p purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ Function1 silver;

    public /* synthetic */ ao(T.p pVar, boolean z2, Function1 function1, int i4, int i5) {
        this.alpha = i5;
        this.purple = pVar;
        this.red = z2;
        this.silver = function1;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                int cyan = C0564b.cyan(1);
                AbstractC0220c.victor(this.purple, this.red, this.silver, interfaceC0581m, cyan);
                return Unit.INSTANCE;
            default:
                int cyan2 = C0564b.cyan(1);
                AbstractC0220c.sierra(this.purple, this.red, this.silver, interfaceC0581m, cyan2);
                return Unit.INSTANCE;
        }
    }
}
