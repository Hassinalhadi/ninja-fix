package G;

import androidx.compose.foundation.layout.InterfaceC0550p;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class g extends Lambda implements Xd.m {
    public final /* synthetic */ v alpha;
    public final /* synthetic */ boolean purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v vVar, boolean z2) {
        super(3);
        this.alpha = vVar;
        this.purple = z2;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i4;
        InterfaceC0550p interfaceC0550p = (InterfaceC0550p) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((C0585q) interfaceC0581m).golf(interfaceC0550p)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            intValue |= i4;
        }
        if ((intValue & 19) == 18) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        d.alpha.alpha(this.alpha, this.purple, interfaceC0550p.alpha(T.p.alpha, T.d.purple), 0L, 0L, 0.0f, interfaceC0581m, 1572864);
        return Unit.INSTANCE;
    }
}
