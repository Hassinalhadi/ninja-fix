package Of;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u extends ae {
    public final boolean alpha;
    public final String purple;

    public u(String body, boolean z2) {
        Intrinsics.echo(body, "body");
        this.alpha = z2;
        this.purple = body.toString();
    }

    @Override // Of.ae
    public final String alpha() {
        return this.purple;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u.class == obj.getClass()) {
                u uVar = (u) obj;
                if (this.alpha == uVar.alpha && Intrinsics.areEqual(this.purple, uVar.purple)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return this.purple.hashCode() + (i4 * 31);
    }

    @Override // Of.ae
    public final String toString() {
        boolean z2 = this.alpha;
        String str = this.purple;
        if (z2) {
            StringBuilder sb2 = new StringBuilder();
            Pf.af.alpha(sb2, str);
            return sb2.toString();
        }
        return str;
    }
}
