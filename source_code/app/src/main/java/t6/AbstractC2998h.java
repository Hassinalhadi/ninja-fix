package t6;

/* renamed from: t6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2998h {
    public static void foxtrot(int i4, int i5) {
        String bravo;
        if (i4 >= 0 && i4 < i5) {
            return;
        }
        if (i4 >= 0) {
            if (i5 < 0) {
                throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
            }
            bravo = AbstractC3003i.bravo("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
        } else {
            bravo = AbstractC3003i.bravo("%s (%s) must not be negative", "index", Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(bravo);
    }

    public static void golf(int i4, int i5) {
        if (i4 >= 0 && i4 <= i5) {
        } else {
            throw new IndexOutOfBoundsException(india(i4, i5, "index"));
        }
    }

    public static void hotel(int i4, int i5, int i10) {
        String india;
        if (i4 >= 0 && i5 >= i4 && i5 <= i10) {
            return;
        }
        if (i4 >= 0 && i4 <= i10) {
            if (i5 >= 0 && i5 <= i10) {
                india = AbstractC3003i.bravo("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            } else {
                india = india(i5, i10, "end index");
            }
        } else {
            india = india(i4, i10, "start index");
        }
        throw new IndexOutOfBoundsException(india);
    }

    public static String india(int i4, int i5, String str) {
        if (i4 < 0) {
            return AbstractC3003i.bravo("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return AbstractC3003i.bravo("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
    }

    public abstract boolean alpha(V0.g gVar, V0.c cVar, V0.c cVar2);

    public abstract boolean bravo(V0.g gVar, Object obj, Object obj2);

    public abstract boolean charlie(V0.g gVar, V0.f fVar, V0.f fVar2);

    public abstract void delta(V0.f fVar, V0.f fVar2);

    public abstract void echo(V0.f fVar, Thread thread);
}
