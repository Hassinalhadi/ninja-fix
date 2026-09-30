package bz;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class M implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0788m purple;

    public /* synthetic */ M(int i4, C0788m c0788m) {
        this.alpha = i4;
        this.purple = c0788m;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.white = false;
                return Unit.INSTANCE;
            case 1:
                this.purple.white = false;
                return Unit.INSTANCE;
            default:
                return new Z.b(((Z.b) this.purple.getValue()).alpha);
        }
    }
}
