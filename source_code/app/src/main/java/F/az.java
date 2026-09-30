package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class az extends Lambda implements Function0 {
    public final /* synthetic */ Function1 alpha;
    public final /* synthetic */ boolean purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(Function1 function1, boolean z2) {
        super(0);
        this.alpha = function1;
        this.purple = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.alpha.invoke(Boolean.valueOf(!this.purple));
        return Unit.INSTANCE;
    }
}
