package F;

import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2088a;

/* loaded from: classes3.dex */
public final class Y1 {
    public final AbstractC2088a alpha;
    public final AbstractC2088a bravo;
    public final AbstractC2088a charlie;
    public final AbstractC2088a delta;
    public final AbstractC2088a echo;

    public Y1(AbstractC2088a abstractC2088a, AbstractC2088a abstractC2088a2, AbstractC2088a abstractC2088a3, AbstractC2088a abstractC2088a4, AbstractC2088a abstractC2088a5) {
        this.alpha = abstractC2088a;
        this.bravo = abstractC2088a2;
        this.charlie = abstractC2088a3;
        this.delta = abstractC2088a4;
        this.echo = abstractC2088a5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y1)) {
            return false;
        }
        Y1 y12 = (Y1) obj;
        if (Intrinsics.areEqual(this.alpha, y12.alpha) && Intrinsics.areEqual(this.bravo, y12.bravo) && Intrinsics.areEqual(this.charlie, y12.charlie) && Intrinsics.areEqual(this.delta, y12.delta) && Intrinsics.areEqual(this.echo, y12.echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.echo.hashCode() + ((this.delta.hashCode() + ((this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.alpha + ", small=" + this.bravo + ", medium=" + this.charlie + ", large=" + this.delta + ", extraLarge=" + this.echo + ')';
    }
}
