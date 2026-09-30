package N2;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class r implements Xd.m {
    public static final r alpha = new Object();

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i4;
        aa aaVar = (aa) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            if (((C0585q) interfaceC0581m).golf(aaVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            intValue |= i4;
        }
        if ((intValue & 91) == 18) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        p.golf(aaVar, null, null, null, null, null, 0.0f, false, interfaceC0581m, intValue & 14);
        return Unit.INSTANCE;
    }
}
