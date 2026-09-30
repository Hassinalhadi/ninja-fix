package i;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;

/* renamed from: i.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1859h implements Xd.m {
    public final /* synthetic */ P.d alpha;
    public final /* synthetic */ int purple;

    public C1859h(P.d dVar, int i4) {
        this.alpha = dVar;
        this.purple = i4;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        int i4;
        InterfaceC1854c interfaceC1854c = (InterfaceC1854c) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((C0585q) interfaceC0581m).golf(interfaceC1854c)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            intValue |= i4;
        }
        if ((intValue & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            this.alpha.invoke(interfaceC1854c, Integer.valueOf(this.purple), c0585q, Integer.valueOf(intValue & 14));
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
