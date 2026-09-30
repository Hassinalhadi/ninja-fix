package kotlin.collections;

import androidx.appcompat.widget.P0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class ab {
    public static Ld.c alpha(Ld.c cVar) {
        cVar.kilo();
        cVar.red = true;
        if (cVar.purple > 0) {
            return cVar;
        }
        return Ld.c.silver;
    }

    public static Ld.j bravo(Ld.j jVar) {
        Ld.g gVar = jVar.alpha;
        gVar.bravo();
        if (gVar.f1833b > 0) {
            return jVar;
        }
        return Ld.j.purple;
    }

    public static void charlie(int i4, int i5, int i10) {
        if (i4 >= 0 && i5 <= i10) {
            if (i4 <= i5) {
            } else {
                throw new IllegalArgumentException(A0.z.juliet("startIndex: ", i4, i5, " > endIndex: "));
            }
        } else {
            StringBuilder hotel = av.q.hotel(i4, i5, "startIndex: ", ", endIndex: ", ", size: ");
            hotel.append(i10);
            throw new IndexOutOfBoundsException(hotel.toString());
        }
    }

    public static void delta(int i4, int i5, int i10) {
        if (i4 >= 0 && i5 <= i10) {
            if (i4 <= i5) {
            } else {
                throw new IllegalArgumentException(A0.z.juliet("fromIndex: ", i4, i5, " > toIndex: "));
            }
        } else {
            StringBuilder hotel = av.q.hotel(i4, i5, "fromIndex: ", ", toIndex: ", ", size: ");
            hotel.append(i10);
            throw new IndexOutOfBoundsException(hotel.toString());
        }
    }

    public static final void echo(int i4) {
        String str;
        if (i4 > 0) {
            return;
        }
        if (2 != i4) {
            str = av.q.delta(i4, "Both size 2 and step ", " must be greater than zero.");
        } else {
            str = "size 2 must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    public static boolean foxtrot(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = objArr[i4];
            Object obj2 = objArr2[i4];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!foxtrot((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else {
                    byte[] bArr = null;
                    if ((obj instanceof kotlin.n) && (obj2 instanceof kotlin.n)) {
                        kotlin.n nVar = (kotlin.n) obj2;
                        byte[] bArr2 = ((kotlin.n) obj).alpha;
                        if (bArr2 == null) {
                            bArr2 = null;
                        }
                        byte[] bArr3 = nVar.alpha;
                        if (bArr3 != null) {
                            bArr = bArr3;
                        }
                        if (!Arrays.equals(bArr2, bArr)) {
                            return false;
                        }
                    } else if ((obj instanceof kotlin.t) && (obj2 instanceof kotlin.t)) {
                        kotlin.t tVar = (kotlin.t) obj2;
                        short[] sArr = ((kotlin.t) obj).alpha;
                        if (sArr == null) {
                            sArr = null;
                        }
                        ?? r5 = tVar.alpha;
                        if (r5 != 0) {
                            bArr = r5;
                        }
                        if (!Arrays.equals(sArr, (short[]) bArr)) {
                            return false;
                        }
                    } else if ((obj instanceof kotlin.o) && (obj2 instanceof kotlin.o)) {
                        kotlin.o oVar = (kotlin.o) obj2;
                        int[] iArr = ((kotlin.o) obj).alpha;
                        if (iArr == null) {
                            iArr = null;
                        }
                        ?? r52 = oVar.alpha;
                        if (r52 != 0) {
                            bArr = r52;
                        }
                        if (!Arrays.equals(iArr, (int[]) bArr)) {
                            return false;
                        }
                    } else if ((obj instanceof kotlin.q) && (obj2 instanceof kotlin.q)) {
                        kotlin.q qVar = (kotlin.q) obj2;
                        long[] jArr = ((kotlin.q) obj).alpha;
                        if (jArr == null) {
                            jArr = null;
                        }
                        ?? r53 = qVar.alpha;
                        if (r53 != 0) {
                            bArr = r53;
                        }
                        if (!Arrays.equals(jArr, (long[]) bArr)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(obj, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final void golf(int i4, int i5) {
        if (i4 <= i5) {
        } else {
            throw new IndexOutOfBoundsException(P0.azure(i4, i5, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static Ld.c hotel() {
        return new Ld.c(10);
    }

    public static LinkedHashSet india(Object... elements) {
        Intrinsics.echo(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.quebec(elements.length));
        ArraysKt___ArraysKt.quebec(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static List juliet(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.delta(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static LinkedHashSet kilo(Set set, Object obj) {
        Intrinsics.echo(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.quebec(set.size()));
        boolean z2 = false;
        for (Object obj2 : set) {
            boolean z10 = true;
            if (!z2 && Intrinsics.areEqual(obj2, obj)) {
                z2 = true;
                z10 = false;
            }
            if (z10) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set lima(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.quebec(objArr.length));
        ArraysKt___ArraysKt.quebec(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet mike(Set set, Iterable elements) {
        Integer num;
        int size;
        Intrinsics.echo(set, "<this>");
        Intrinsics.echo(elements, "elements");
        if (elements instanceof Collection) {
            num = Integer.valueOf(((Collection) elements).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.quebec(size));
        linkedHashSet.addAll(set);
        CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static LinkedHashSet november(Set set, Object obj) {
        Intrinsics.echo(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.quebec(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set oscar(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.delta(singleton, "singleton(...)");
        return singleton;
    }
}
