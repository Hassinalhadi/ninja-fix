package D0;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {
    public final Object alpha;
    public final int bravo;
    public final int charlie;
    public final String delta;

    public e(String str, int i4, int i5, Object obj) {
        this.alpha = obj;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = str;
        if (i4 <= i5) {
            return;
        }
        J0.a.alpha("Reversed range is not supported");
    }

    public static e alpha(e eVar, t tVar, int i4, int i5) {
        Object obj = tVar;
        if ((i5 & 1) != 0) {
            obj = eVar.alpha;
        }
        if ((i5 & 4) != 0) {
            i4 = eVar.charlie;
        }
        return new e(eVar.delta, eVar.bravo, i4, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Intrinsics.areEqual(this.alpha, eVar.alpha) && this.bravo == eVar.bravo && this.charlie == eVar.charlie && Intrinsics.areEqual(this.delta, eVar.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.alpha;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.delta.hashCode() + (((((hashCode * 31) + this.bravo) * 31) + this.charlie) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.alpha);
        sb2.append(", start=");
        sb2.append(this.bravo);
        sb2.append(", end=");
        sb2.append(this.charlie);
        sb2.append(", tag=");
        return P0.fuchsia(sb2, this.delta, ')');
    }

    public e(Object obj, int i4, int i5) {
        this("", i4, i5, obj);
    }
}
