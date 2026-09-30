package vg;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class u implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ d purple;

    public /* synthetic */ u(d dVar, int i4) {
        this.alpha = i4;
        this.purple = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                this.purple.cancel();
                return Unit.INSTANCE;
            case 1:
                this.purple.cancel();
                return Unit.INSTANCE;
            default:
                this.purple.cancel();
                return Unit.INSTANCE;
        }
    }
}
