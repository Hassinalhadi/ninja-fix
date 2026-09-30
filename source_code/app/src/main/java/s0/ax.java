package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class ax extends Lambda implements Function0 {
    public final /* synthetic */ ay alpha;
    public final /* synthetic */ W purple;
    public final /* synthetic */ long red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(ay ayVar, W w4, long j5) {
        super(0);
        this.alpha = ayVar;
        this.purple = w4;
        this.red = j5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        au y10;
        ay ayVar = this.alpha;
        boolean mike = AbstractC2557q.mike(ayVar.white.alpha);
        ap apVar = ayVar.white;
        AbstractC2366B abstractC2366B = null;
        if (!mike && !apVar.charlie) {
            L l10 = apVar.alpha().f13253k;
            if (l10 != null && (y10 = l10.y()) != null) {
                abstractC2366B = y10.e;
            }
        } else {
            L l11 = apVar.alpha().f13253k;
            if (l11 != null) {
                abstractC2366B = l11.e;
            }
        }
        if (abstractC2366B == null) {
            abstractC2366B = ((C2946x) this.purple).getPlacementScope();
        }
        au y11 = apVar.alpha().y();
        Intrinsics.checkNotNull(y11);
        AbstractC2366B.india(abstractC2366B, y11, this.red);
        return Unit.INSTANCE;
    }
}
