package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class aw extends Lambda implements Function0 {
    public final /* synthetic */ ay alpha;
    public final /* synthetic */ long purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(ay ayVar, long j5) {
        super(0);
        this.alpha = ayVar;
        this.purple = j5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        au y10 = this.alpha.white.alpha().y();
        Intrinsics.checkNotNull(y10);
        y10.victor(this.purple);
        return Unit.INSTANCE;
    }
}
