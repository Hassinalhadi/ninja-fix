package z0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: z0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3455d extends Lambda implements Function1 {
    public static final C3455d purple = new C3455d(1, 0);
    public static final C3455d red = new C3455d(1, 1);
    public static final C3455d silver = new C3455d(1, 2);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3455d(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                ((Number) obj).longValue();
                return Unit.INSTANCE;
            case 1:
                return Integer.valueOf(((C3460i) obj).bravo);
            default:
                return Integer.valueOf(((C3460i) obj).charlie.bravo());
        }
    }
}
