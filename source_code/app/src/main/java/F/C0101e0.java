package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0101e0 extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ float purple;
    public final /* synthetic */ long red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0101e0(float f5, int i4, long j5) {
        super(1);
        this.alpha = i4;
        this.purple = f5;
        this.red = j5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                c0.d dVar = (c0.d) obj;
                float f5 = this.purple;
                float f10 = 2;
                ao.ad.juliet(dVar, this.red, t6.H2.alpha(0.0f, dVar.lavender(f5) / f10), t6.H2.alpha(Z.e.delta(dVar.bravo()), dVar.lavender(f5) / f10), dVar.lavender(f5), 0, 496);
                return Unit.INSTANCE;
            default:
                c0.d dVar2 = (c0.d) obj;
                float f11 = this.purple;
                float f12 = 2;
                ao.ad.juliet(dVar2, this.red, t6.H2.alpha(dVar2.lavender(f11) / f12, 0.0f), t6.H2.alpha(dVar2.lavender(f11) / f12, Z.e.bravo(dVar2.bravo())), dVar2.lavender(f11), 0, 496);
                return Unit.INSTANCE;
        }
    }
}
