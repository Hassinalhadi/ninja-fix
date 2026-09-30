package s;

import T.s;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import t6.AbstractC3067v;
import t6.AbstractC3072w;

/* renamed from: s.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2529h implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ s purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ int silver;

    public /* synthetic */ C2529h(s sVar, P.d dVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = sVar;
        this.red = dVar;
        this.silver = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                int cyan = C0564b.cyan(this.silver | 1);
                AbstractC3067v.alpha(this.purple, this.red, interfaceC0581m, cyan);
                return Unit.INSTANCE;
            case 1:
                int cyan2 = C0564b.cyan(this.silver | 1);
                AbstractC3067v.bravo(this.purple, this.red, interfaceC0581m, cyan2);
                return Unit.INSTANCE;
            case 2:
                int cyan3 = C0564b.cyan(this.silver | 1);
                AbstractC2534m.delta(this.purple, this.red, interfaceC0581m, cyan3);
                return Unit.INSTANCE;
            case 3:
                int cyan4 = C0564b.cyan(this.silver | 1);
                AbstractC3072w.bravo(this.purple, this.red, interfaceC0581m, cyan4);
                return Unit.INSTANCE;
            default:
                int cyan5 = C0564b.cyan(this.silver | 1);
                AbstractC3072w.alpha(this.purple, this.red, interfaceC0581m, cyan5);
                return Unit.INSTANCE;
        }
    }
}
