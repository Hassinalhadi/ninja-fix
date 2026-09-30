package T0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class h extends Lambda implements Function0 {
    public static final h purple = new h(0, 0);
    public static final h red = new h(0, 1);
    public static final h silver = new h(0, 2);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.alpha) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }
}
