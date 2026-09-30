package pe;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.H, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2316H {
    public final String alpha;
    public final boolean bravo;

    public AbstractC2316H(String str, boolean z2) {
        this.alpha = str;
        this.bravo = z2;
    }

    public Integer alpha(AbstractC2316H visibility) {
        Intrinsics.echo(visibility, "visibility");
        Ld.g gVar = AbstractC2315G.alpha;
        if (this == visibility) {
            return 0;
        }
        Ld.g gVar2 = AbstractC2315G.alpha;
        Integer num = (Integer) gVar2.get(this);
        Integer num2 = (Integer) gVar2.get(visibility);
        if (num != null && num2 != null && !Intrinsics.areEqual(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    public String bravo() {
        return this.alpha;
    }

    public AbstractC2316H charlie() {
        return this;
    }

    public final String toString() {
        return bravo();
    }
}
