package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class ai implements Xd.l {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ int purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ T.s silver;

    public /* synthetic */ ai(int i4, int i5, T.s sVar, int i10) {
        this.purple = i4;
        this.red = i5;
        this.silver = sVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                AbstractC0220c.november(this.silver, interfaceC0581m, C0564b.cyan(this.purple | 1), this.red);
                return Unit.INSTANCE;
            default:
                int cyan = C0564b.cyan(1);
                cc.g.juliet(this.purple, this.red, this.silver, interfaceC0581m, cyan);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ai(T.s sVar, int i4, int i5) {
        this.silver = sVar;
        this.purple = i4;
        this.red = i5;
    }
}
