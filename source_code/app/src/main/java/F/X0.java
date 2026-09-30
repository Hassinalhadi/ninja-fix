package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class X0 extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0103e2 purple;
    public final /* synthetic */ Function0 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X0(C0103e2 c0103e2, Function0 function0, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = c0103e2;
        this.red = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                if (!this.purple.charlie()) {
                    this.red.invoke();
                }
                return Unit.INSTANCE;
            default:
                if (!this.purple.charlie()) {
                    this.red.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
