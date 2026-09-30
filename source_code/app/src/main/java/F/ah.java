package F;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ah extends Lambda implements Xd.l {
    public final /* synthetic */ float alpha;
    public final /* synthetic */ float purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(float f5, float f10) {
        super(2);
        this.alpha = f5;
        this.purple = f10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        AbstractC0547m.alpha(androidx.compose.foundation.layout.V.lima(T.p.alpha, this.alpha, this.purple), interfaceC0581m, 0);
        return Unit.INSTANCE;
    }
}
