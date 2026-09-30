package q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: q0.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2368D extends Lambda implements Function1 {
    public static final C2368D purple = new C2368D(1, 0);
    public static final C2368D red = new C2368D(1, 1);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2368D(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }
}
