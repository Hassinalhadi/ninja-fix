package A0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class l extends Lambda implements Function0 {
    public static final l purple = new l(0, 0);
    public static final l red = new l(0, 1);
    public static final l silver = new l(0, 2);
    public static final l teal = new l(0, 3);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return null;
            case 1:
                return Float.valueOf(0.0f);
            case 2:
                return Float.valueOf(0.0f);
            default:
                return Boolean.FALSE;
        }
    }
}
