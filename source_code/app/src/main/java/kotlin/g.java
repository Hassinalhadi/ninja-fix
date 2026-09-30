package kotlin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements Comparable {
    public static final g teal = new g(2, 2, 0);
    public final int alpha;
    public final int purple;
    public final int red;
    public final int silver;

    public g(int i4, int i5, int i10) {
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        if (i4 >= 0 && i4 < 256 && i5 >= 0 && i5 < 256 && i10 >= 0 && i10 < 256) {
            this.silver = (i4 << 16) + (i5 << 8) + i10;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i4 + '.' + i5 + '.' + i10).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g other = (g) obj;
        Intrinsics.echo(other, "other");
        return this.silver - other.silver;
    }

    public final boolean equals(Object obj) {
        g gVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            gVar = (g) obj;
        } else {
            gVar = null;
        }
        if (gVar != null && this.silver == gVar.silver) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.silver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.alpha);
        sb2.append('.');
        sb2.append(this.purple);
        sb2.append('.');
        sb2.append(this.red);
        return sb2.toString();
    }
}
