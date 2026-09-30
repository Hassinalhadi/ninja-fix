package Bd;

import Nf.az;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Jf.e
/* loaded from: classes2.dex */
public final class e implements Comparable<e> {

    @NotNull
    public static final d Companion = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy[] f769c;

    /* renamed from: a, reason: collision with root package name */
    public final int f770a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final long f771b;
    public final int purple;
    public final int red;
    public final g silver;
    public final int teal;
    public final int white;
    public final f yellow;

    /* JADX WARN: Type inference failed for: r3v0, types: [Bd.d, java.lang.Object] */
    static {
        i iVar = i.alpha;
        f769c = new Lazy[]{null, null, null, LazyKt.alpha(iVar, new b(0)), null, null, LazyKt.alpha(iVar, new b(1)), null, null};
        a.alpha(0L);
    }

    public /* synthetic */ e(int i4, int i5, int i10, int i11, g gVar, int i12, int i13, f fVar, int i14, long j5) {
        if (511 != (i4 & 511)) {
            az.juliet(i4, 511, c.alpha.getDescriptor());
            throw null;
        }
        this.alpha = i5;
        this.purple = i10;
        this.red = i11;
        this.silver = gVar;
        this.teal = i12;
        this.white = i13;
        this.yellow = fVar;
        this.f770a = i14;
        this.f771b = j5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        e other = eVar;
        Intrinsics.echo(other, "other");
        return Intrinsics.hotel(this.f771b, other.f771b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.alpha == eVar.alpha && this.purple == eVar.purple && this.red == eVar.red && this.silver == eVar.silver && this.teal == eVar.teal && this.white == eVar.white && this.yellow == eVar.yellow && this.f770a == eVar.f770a && this.f771b == eVar.f771b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.yellow.hashCode() + ((((((this.silver.hashCode() + (((((this.alpha * 31) + this.purple) * 31) + this.red) * 31)) * 31) + this.teal) * 31) + this.white) * 31)) * 31) + this.f770a) * 31;
        long j5 = this.f771b;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.alpha + ", minutes=" + this.purple + ", hours=" + this.red + ", dayOfWeek=" + this.silver + ", dayOfMonth=" + this.teal + ", dayOfYear=" + this.white + ", month=" + this.yellow + ", year=" + this.f770a + ", timestamp=" + this.f771b + ')';
    }

    public e(int i4, int i5, int i10, g dayOfWeek, int i11, int i12, f month, int i13, long j5) {
        Intrinsics.echo(dayOfWeek, "dayOfWeek");
        Intrinsics.echo(month, "month");
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        this.silver = dayOfWeek;
        this.teal = i11;
        this.white = i12;
        this.yellow = month;
        this.f770a = i13;
        this.f771b = j5;
    }
}
