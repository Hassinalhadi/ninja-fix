package androidx.compose.runtime;

import kotlin.Unit;

/* renamed from: androidx.compose.runtime.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0576h implements Xd.l {
    public static final C0576h purple = new C0576h(0);
    public static final C0576h red = new C0576h(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C0576h(int i4) {
        this.alpha = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (!c0585q.magenta(intValue & 1, z2)) {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (!c0585q2.magenta(intValue2 & 1, z10)) {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
