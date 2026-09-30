package Y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class p extends Lambda implements Function1 {
    public static final p purple = new p(1, 0);
    public static final p red = new p(1, 1);
    public static final p silver = new p(1, 2);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Boolean.valueOf(((aa) obj).f(7));
            default:
                return Boolean.valueOf(((aa) obj).f(7));
        }
    }
}
