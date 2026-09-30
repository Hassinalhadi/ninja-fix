package q0;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: q0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2389h extends Lambda implements Xd.l {
    public static final C2389h alpha = new Lambda(2);

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
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
    }
}
