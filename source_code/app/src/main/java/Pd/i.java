package Pd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class i extends c implements kotlin.jvm.internal.g {
    private final int arity;

    public i(int i4, Nd.c cVar) {
        super(cVar);
        this.arity = i4;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    @Override // Pd.a
    @NotNull
    public String toString() {
        if (getCompletion() == null) {
            String india = u.alpha.india(this);
            Intrinsics.delta(india, "renderLambdaToString(...)");
            return india;
        }
        return super.toString();
    }
}
