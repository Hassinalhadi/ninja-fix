package N2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import s0.C2550j;

/* loaded from: classes3.dex */
public final class b extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2550j purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(C2550j c2550j, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c2550j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return this.purple.invoke();
            default:
                return this.purple.invoke();
        }
    }
}
