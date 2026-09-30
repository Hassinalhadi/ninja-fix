package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;

/* loaded from: classes3.dex */
public final class O {
    public final N alpha;
    public final boolean bravo;
    public final u0 charlie;
    public final boolean delta;
    public final Object echo;
    public boolean foxtrot = true;

    public O(N n5, Object obj, boolean z2, u0 u0Var, boolean z10) {
        this.alpha = n5;
        this.bravo = z2;
        this.charlie = u0Var;
        this.delta = z10;
        this.echo = obj;
    }

    public final Object alpha() {
        if (this.bravo) {
            return null;
        }
        Object obj = this.echo;
        if (obj != null) {
            return obj;
        }
        r.delta("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }
}
