package Pd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
public abstract class h extends g implements kotlin.jvm.internal.g {
    public final int alpha;

    public h(int i4, Nd.c cVar) {
        super(cVar);
        this.alpha = i4;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.alpha;
    }

    @Override // Pd.a
    public final String toString() {
        if (getCompletion() == null) {
            String india = u.alpha.india(this);
            Intrinsics.delta(india, "renderLambdaToString(...)");
            return india;
        }
        return super.toString();
    }
}
