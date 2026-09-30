package s6;

import fe.C1713e;
import fe.C1715g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class J4 {
    public static Comparable alpha(Q0.g gVar, Q0.g gVar2) {
        if (gVar.compareTo(gVar2) < 0) {
            return gVar2;
        }
        return gVar;
    }

    public static double bravo(double d4, double d9, double d10) {
        if (d9 <= d10) {
            if (d4 < d9) {
                return d9;
            }
            if (d4 > d10) {
                return d10;
            }
            return d4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d10 + " is less than minimum " + d9 + '.');
    }

    public static float charlie(float f5, float f10, float f11) {
        if (f10 <= f11) {
            if (f5 < f10) {
                return f10;
            }
            if (f5 > f11) {
                return f11;
            }
            return f5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static int delta(int i4, int i5, int i10) {
        if (i5 <= i10) {
            if (i4 < i5) {
                return i5;
            }
            if (i4 > i10) {
                return i10;
            }
            return i4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i10 + " is less than minimum " + i5 + '.');
    }

    public static long echo(long j5, long j6, long j7) {
        if (j6 <= j7) {
            if (j5 < j6) {
                return j6;
            }
            if (j5 > j7) {
                return j7;
            }
            return j5;
        }
        StringBuilder uniform = Q0.c.uniform("Cannot coerce value to an empty range: maximum ", j7, " is less than minimum ");
        uniform.append(j6);
        uniform.append('.');
        throw new IllegalArgumentException(uniform.toString());
    }

    public static boolean foxtrot(int i4) {
        int type = Character.getType(i4);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static C1713e golf(C1715g c1715g, int i4) {
        boolean z2;
        Intrinsics.echo(c1715g, "<this>");
        if (i4 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Integer valueOf = Integer.valueOf(i4);
        if (z2) {
            if (c1715g.red <= 0) {
                i4 = -i4;
            }
            return new C1713e(c1715g.alpha, c1715g.purple, i4);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fe.g, fe.e] */
    public static C1715g hotel(int i4, int i5) {
        if (i5 <= Integer.MIN_VALUE) {
            C1715g c1715g = C1715g.silver;
            return C1715g.silver;
        }
        return new C1713e(i4, i5 - 1, 1);
    }
}
