package ef;

import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class l extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ n purple;
    public final /* synthetic */ o red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, o oVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = nVar;
        this.red = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return ab.mike(this.purple.alpha.keySet(), this.red.oscar());
            default:
                return ab.mike(this.purple.bravo.keySet(), this.red.papa());
        }
    }
}
