package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import m.AbstractC2088a;

/* loaded from: classes3.dex */
public final class ai extends Lambda implements Xd.l {
    public final /* synthetic */ aj alpha;
    public final /* synthetic */ T.p purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ AbstractC2088a teal;
    public final /* synthetic */ long white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, T.p pVar, float f5, float f10, AbstractC2088a abstractC2088a, long j5, int i4) {
        super(2);
        this.alpha = ajVar;
        this.purple = pVar;
        this.red = f5;
        this.silver = f10;
        this.teal = abstractC2088a;
        this.white = j5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(196609);
        float f5 = this.red;
        float f10 = this.silver;
        this.alpha.alpha(this.purple, f5, f10, this.teal, this.white, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
