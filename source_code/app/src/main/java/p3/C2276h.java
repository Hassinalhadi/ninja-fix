package p3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: p3.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2276h implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ m purple;
    public final /* synthetic */ ab red;

    public /* synthetic */ C2276h(m mVar, ab abVar, int i4) {
        this.alpha = i4;
        this.purple = mVar;
        this.red = abVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.invoke();
                this.red.alpha.charlie.alpha("LocationFlow", "Location updates removed");
                return Unit.INSTANCE;
            default:
                this.purple.invoke();
                this.red.alpha.charlie.alpha("LocationFlow", "Location updates removed (fallback)");
                return Unit.INSTANCE;
        }
    }
}
