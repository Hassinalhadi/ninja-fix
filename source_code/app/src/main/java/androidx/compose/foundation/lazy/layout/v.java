package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class v implements Xd.l {
    public final /* synthetic */ w alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;

    public v(int i4, w wVar, Object obj) {
        this.alpha = wVar;
        this.purple = i4;
        this.red = obj;
    }

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
        if (c0585q.magenta(intValue & 1, z2)) {
            this.alpha.delta(this.purple, this.red, c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
