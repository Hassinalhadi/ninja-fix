package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class r extends Lambda implements Xd.l {
    public final /* synthetic */ P.d alpha;
    public final /* synthetic */ T.p purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ P.d silver;
    public final /* synthetic */ float teal;
    public final /* synthetic */ androidx.compose.foundation.layout.G white;
    public final /* synthetic */ M2 yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(P.d dVar, T.p pVar, P.d dVar2, P.d dVar3, float f5, androidx.compose.foundation.layout.G g2, M2 m22, int i4) {
        super(2);
        this.alpha = dVar;
        this.purple = pVar;
        this.red = dVar2;
        this.silver = dVar3;
        this.teal = f5;
        this.white = g2;
        this.yellow = m22;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(3463);
        M2 m22 = this.yellow;
        P.d dVar = this.alpha;
        P.d dVar2 = this.red;
        P.d dVar3 = this.silver;
        float f5 = this.teal;
        androidx.compose.foundation.layout.G g2 = this.white;
        ag.alpha(dVar, this.purple, dVar2, dVar3, f5, g2, m22, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
