package androidx.compose.foundation.layout;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import n.AbstractC2128c;

/* renamed from: androidx.compose.foundation.layout.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0545k implements Xd.l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ int red;

    public /* synthetic */ C0545k(T.s sVar, int i4) {
        this.purple = sVar;
        this.red = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                num.intValue();
                AbstractC0547m.alpha(this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            default:
                num.getClass();
                AbstractC2128c.bravo(this.purple, interfaceC0581m, C0564b.cyan(1), this.red);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0545k(T.s sVar, int i4, int i5) {
        this.purple = sVar;
        this.red = i5;
    }
}
