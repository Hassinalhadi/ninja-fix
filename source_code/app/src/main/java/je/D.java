package je;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class D extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ E purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(E e, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return new C(this.purple);
            default:
                return this.purple.whiskey();
        }
    }
}
