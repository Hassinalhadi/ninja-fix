package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class F1 extends Lambda implements Function1 {
    public final /* synthetic */ AbstractC2367C alpha;
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(AbstractC2367C abstractC2367C, int i4) {
        super(1);
        this.alpha = abstractC2367C;
        this.purple = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC2366B.hotel((AbstractC2366B) obj, this.alpha, 0, -this.purple);
        return Unit.INSTANCE;
    }
}
