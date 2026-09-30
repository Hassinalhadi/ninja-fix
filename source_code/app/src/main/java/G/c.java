package G;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c extends Lambda implements Xd.l {
    public final /* synthetic */ d alpha;
    public final /* synthetic */ v purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ T.s silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ long white;
    public final /* synthetic */ float yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, v vVar, boolean z2, T.s sVar, long j5, long j6, float f5, int i4) {
        super(2);
        this.alpha = dVar;
        this.purple = vVar;
        this.red = z2;
        this.silver = sVar;
        this.teal = j5;
        this.white = j6;
        this.yellow = f5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(1572865);
        T.s sVar = this.silver;
        long j5 = this.teal;
        this.alpha.alpha(this.purple, this.red, sVar, j5, this.white, this.yellow, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
