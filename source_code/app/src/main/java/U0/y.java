package U0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class y extends Lambda implements Function0 {
    public final /* synthetic */ kotlin.jvm.internal.t alpha;
    public final /* synthetic */ z purple;
    public final /* synthetic */ Q0.l red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ long teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlin.jvm.internal.t tVar, z zVar, Q0.l lVar, long j5, long j6) {
        super(0);
        this.alpha = tVar;
        this.purple = zVar;
        this.red = lVar;
        this.silver = j5;
        this.teal = j6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z zVar = this.purple;
        this.alpha.alpha = zVar.getPositionProvider().oscar(this.red, this.silver, zVar.getParentLayoutDirection(), this.teal);
        return Unit.INSTANCE;
    }
}
