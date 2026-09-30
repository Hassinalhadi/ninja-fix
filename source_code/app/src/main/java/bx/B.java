package bx;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class B {
    public final bz.aa alpha;

    public B(bz.aa aaVar) {
        this.alpha = aaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B) {
                B b2 = (B) obj;
                b2.getClass();
                if (Float.compare(0.0f, 0.0f) != 0 || !Intrinsics.areEqual(this.alpha, b2.alpha)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode() + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.alpha + ')';
    }
}
