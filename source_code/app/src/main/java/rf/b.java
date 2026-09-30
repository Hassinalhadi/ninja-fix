package rf;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import t6.AbstractC3057t;

/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    public static final b red = new b(0, 0);
    public final long alpha;
    public final long purple;

    public b(long j5, long j6) {
        this.alpha = j5;
        this.purple = j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b other = (b) obj;
        Intrinsics.echo(other, "other");
        long j5 = this.alpha;
        long j6 = other.alpha;
        if (j5 != j6) {
            return Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        }
        return Long.compare(this.purple ^ Long.MIN_VALUE, other.purple ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.alpha == bVar.alpha && this.purple == bVar.purple) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha ^ this.purple;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC3057t.bravo(this.alpha, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC3057t.bravo(this.alpha, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC3057t.bravo(this.alpha, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC3057t.bravo(this.purple, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC3057t.bravo(this.purple, bArr, 24, 2, 8);
        return r.foxtrot(bArr);
    }
}
