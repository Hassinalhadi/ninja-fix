package bx;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class x extends Lambda implements Xd.l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ T.p purple;
    public final /* synthetic */ ay red;
    public final /* synthetic */ A silver;
    public final /* synthetic */ String teal;
    public final /* synthetic */ P.d white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z2, T.p pVar, ay ayVar, A a6, String str, P.d dVar, int i4) {
        super(2);
        this.alpha = z2;
        this.purple = pVar;
        this.red = ayVar;
        this.silver = a6;
        this.teal = str;
        this.white = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(196609);
        P.d dVar = this.white;
        ay ayVar = this.red;
        A a6 = this.silver;
        androidx.compose.animation.b.delta(this.alpha, this.purple, ayVar, a6, this.teal, dVar, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
