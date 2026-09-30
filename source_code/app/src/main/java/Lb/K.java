package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class K implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ int red;

    public /* synthetic */ K(int i4, String str, int i5) {
        this.alpha = 2;
        this.red = i4;
        this.purple = str;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                num.intValue();
                AbstractC0220c.yankee(this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 1:
                num.intValue();
                db.n.hotel(this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            default:
                num.getClass();
                db.n.bravo(this.red, this.purple, interfaceC0581m, C0564b.cyan(7));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ K(String str, int i4, int i5) {
        this.alpha = i5;
        this.purple = str;
        this.red = i4;
    }
}
