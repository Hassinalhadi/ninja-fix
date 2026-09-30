package H0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z implements i {
    public final int alpha;
    public final v bravo;
    public final int charlie;
    public final u delta;

    public z(int i4, v vVar, int i5, u uVar) {
        this.alpha = i4;
        this.bravo = vVar;
        this.charlie = i5;
        this.delta = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.alpha == zVar.alpha && Intrinsics.areEqual(this.bravo, zVar.bravo) && this.charlie == zVar.charlie && Intrinsics.areEqual(this.delta, zVar.delta)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.delta.alpha.hashCode() + (((((this.alpha * 31) + this.bravo.alpha) * 31) + this.charlie) * 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ResourceFont(resId=");
        sb2.append(this.alpha);
        sb2.append(", weight=");
        sb2.append(this.bravo);
        sb2.append(", style=");
        int i4 = this.charlie;
        if (i4 == 0) {
            str = "Normal";
        } else if (i4 == 1) {
            str = "Italic";
        } else {
            str = "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", loadingStrategy=Blocking)");
        return sb2.toString();
    }
}
