package n;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: n.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2122B implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ K purple;

    public /* synthetic */ C2122B(K k6, int i4) {
        this.alpha = i4;
        this.purple = k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.alpha();
                return Unit.INSTANCE;
            default:
                this.purple.onCancel();
                return Unit.INSTANCE;
        }
    }
}
