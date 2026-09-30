package P7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class d extends Lambda implements Function0 {
    public static final d purple = new d(0, 0);
    public static final d red = new d(0, 1);
    public static final d silver = new d(0, 2);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
            case 1:
                return "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
            default:
                return "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
        }
    }
}
