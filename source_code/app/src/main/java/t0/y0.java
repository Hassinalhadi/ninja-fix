package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class y0 extends Lambda implements Function0 {
    public final /* synthetic */ Ref.ObjectRef alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Ref.ObjectRef objectRef) {
        super(0);
        this.alpha = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((Function0) this.alpha.alpha).invoke();
        return Unit.INSTANCE;
    }
}
