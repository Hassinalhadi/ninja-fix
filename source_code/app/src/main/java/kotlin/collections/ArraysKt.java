package kotlin.collections;

import com.clevertap.android.sdk.Constants;
import fe.C1713e;
import fe.C1715g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pf.C2354d;
import pf.InterfaceC2358h;

@Metadata(d1 = {"kotlin/collections/ab", "kotlin/collections/ab", "kotlin/collections/ArraysKt___ArraysJvmKt", "kotlin/collections/ArraysKt___ArraysKt"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes2.dex */
public final class ArraysKt extends ArraysKt___ArraysKt {
    private ArraysKt() {
    }

    public static List a(long[] jArr) {
        Intrinsics.echo(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j5 : jArr) {
                    arrayList.add(Long.valueOf(j5));
                }
                return arrayList;
            }
            return ab.juliet(Long.valueOf(jArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static void amber(char[] cArr, char[] cArr2, int i4, int i5, int i10) {
        Intrinsics.echo(cArr, "<this>");
        System.arraycopy(cArr, i5, cArr2, i4, i10 - i5);
    }

    public static void azure(long[] jArr, long[] destination, int i4, int i5, int i10) {
        Intrinsics.echo(jArr, "<this>");
        Intrinsics.echo(destination, "destination");
        System.arraycopy(jArr, i5, destination, i4, i10 - i5);
    }

    public static List b(Object[] objArr) {
        Intrinsics.echo(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return f(objArr);
            }
            return ab.juliet(objArr[0]);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static /* synthetic */ void beige(int i4, int i5, int i10, Object[] objArr, Object[] objArr2) {
        if ((i10 & 4) != 0) {
            i4 = 0;
        }
        if ((i10 & 8) != 0) {
            i5 = objArr.length;
        }
        yankee(0, i4, i5, objArr, objArr2);
    }

    public static /* synthetic */ void black(int i4, int i5, int[] iArr, int[] iArr2, int i10) {
        if ((i10 & 2) != 0) {
            i4 = 0;
        }
        if ((i10 & 8) != 0) {
            i5 = iArr.length;
        }
        zulu(i4, 0, iArr, iArr2, i5);
    }

    public static Object[] blue(int i4, Object[] objArr, int i5) {
        Intrinsics.echo(objArr, "<this>");
        ab.golf(i5, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i4, i5);
        Intrinsics.delta(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static List bronze(int[] iArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.quebec(iArr.length));
        for (int i4 : iArr) {
            linkedHashSet.add(Integer.valueOf(i4));
        }
        return CollectionsKt.z(linkedHashSet);
    }

    public static List c(short[] sArr) {
        Intrinsics.echo(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(sArr.length);
                for (short s3 : sArr) {
                    arrayList.add(Short.valueOf(s3));
                }
                return arrayList;
            }
            return ab.juliet(Short.valueOf(sArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static void coral(int i4, int i5, Object obj, Object[] objArr) {
        Intrinsics.echo(objArr, "<this>");
        Arrays.fill(objArr, i4, i5, obj);
    }

    public static void crimson(int i4, int[] iArr) {
        int length = iArr.length;
        Intrinsics.echo(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i4);
    }

    public static void cyan(long[] jArr, long j5) {
        int length = jArr.length;
        Intrinsics.echo(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j5);
    }

    public static List d(boolean[] zArr) {
        Intrinsics.echo(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(zArr.length);
                for (boolean z2 : zArr) {
                    arrayList.add(Boolean.valueOf(z2));
                }
                return arrayList;
            }
            return ab.juliet(Boolean.valueOf(zArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static ArrayList e(int[] iArr) {
        Intrinsics.echo(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i4 : iArr) {
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    public static ArrayList f(Object[] objArr) {
        Intrinsics.echo(objArr, "<this>");
        return new ArrayList(new k(objArr, false));
    }

    public static Object fuchsia(Object[] objArr) {
        Intrinsics.echo(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Set g(Object[] objArr) {
        Intrinsics.echo(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(y.quebec(objArr.length));
                ArraysKt___ArraysKt.quebec(objArr, linkedHashSet);
                return linkedHashSet;
            }
            return ab.oscar(objArr[0]);
        }
        return u.alpha;
    }

    public static Object gold(Object[] objArr) {
        Intrinsics.echo(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fe.g, fe.e] */
    public static C1715g gray(int[] iArr) {
        return new C1713e(0, iArr.length - 1, 1);
    }

    public static int green(long[] jArr) {
        Intrinsics.echo(jArr, "<this>");
        return jArr.length - 1;
    }

    public static ArrayList h(int[] iArr, List other) {
        Intrinsics.echo(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i4 = 0;
        for (Object obj : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(new Pair(Integer.valueOf(iArr[i4]), obj));
            i4++;
        }
        return arrayList;
    }

    public static ArrayList i(Object[] objArr, Object[] other) {
        Intrinsics.echo(objArr, "<this>");
        Intrinsics.echo(other, "other");
        int min = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(new Pair(objArr[i4], other[i4]));
        }
        return arrayList;
    }

    public static Integer indigo(int i4, int[] iArr) {
        Intrinsics.echo(iArr, "<this>");
        if (i4 >= 0 && i4 < iArr.length) {
            return Integer.valueOf(iArr[i4]);
        }
        return null;
    }

    public static Object ivory(int i4, Object[] objArr) {
        Intrinsics.echo(objArr, "<this>");
        if (i4 >= 0 && i4 < objArr.length) {
            return objArr[i4];
        }
        return null;
    }

    public static int jade(Object[] objArr, Object obj) {
        Intrinsics.echo(objArr, "<this>");
        int i4 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i4 < length) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i4 < length2) {
            if (Intrinsics.areEqual(obj, objArr[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static String lime(byte[] bArr, String str, int i4, Function1 function1, int i5) {
        String str2;
        if ((i5 & 1) != 0) {
            str = ", ";
        }
        String str3 = "";
        if ((i5 & 2) != 0) {
            str2 = "";
        } else {
            str2 = Constants.AES_PREFIX;
        }
        if ((i5 & 4) == 0) {
            str3 = Constants.AES_SUFFIX;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.echo(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i10 = 0;
        for (byte b2 : bArr) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            if (i4 >= 0 && i10 > i4) {
                break;
            }
            if (function1 != null) {
                sb2.append((CharSequence) function1.invoke(Byte.valueOf(b2)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b2));
            }
        }
        if (i4 >= 0 && i10 > i4) {
            sb2.append((CharSequence) "...");
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static String magenta(Object[] objArr, String str, String str2, String str3, Function1 function1, int i4) {
        String str4;
        String str5;
        if ((i4 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i4 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i4 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i4 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.echo(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        ArraysKt___ArraysKt.papa(objArr, sb2, str6, str4, str5, "...", function1);
        return sb2.toString();
    }

    public static Object maroon(Object[] objArr) {
        Intrinsics.echo(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int navy(Object[] objArr, Object obj) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i4 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i5 = length2 - 1;
                    if (Intrinsics.areEqual(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    length2 = i5;
                }
            }
        }
        return -1;
    }

    public static byte[] ochre(byte[] bArr, byte[] elements) {
        Intrinsics.echo(bArr, "<this>");
        Intrinsics.echo(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        Intrinsics.checkNotNull(copyOf);
        return copyOf;
    }

    public static char olive(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object orange(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length == 1) {
                return objArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static byte[] peach(byte[] bArr, C1715g indices) {
        Intrinsics.echo(bArr, "<this>");
        Intrinsics.echo(indices, "indices");
        if (indices.isEmpty()) {
            return new byte[0];
        }
        return ArraysKt___ArraysJvmKt.copyOfRange(bArr, indices.alpha, indices.purple + 1);
    }

    public static void pink(Object[] objArr, Comparator comparator) {
        Intrinsics.echo(objArr, "<this>");
        Intrinsics.echo(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void plum(Object[] objArr, Comparator comparator, int i4, int i5) {
        Intrinsics.echo(objArr, "<this>");
        Intrinsics.echo(comparator, "comparator");
        Arrays.sort(objArr, i4, i5, comparator);
    }

    public static List purple(Object[] objArr, Comparator comparator) {
        Intrinsics.echo(objArr, "<this>");
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.delta(objArr, "copyOf(...)");
            pink(objArr, comparator);
        }
        return sierra(objArr);
    }

    public static List red(byte[] bArr) {
        Intrinsics.echo(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(bArr.length);
                for (byte b2 : bArr) {
                    arrayList.add(Byte.valueOf(b2));
                }
                return arrayList;
            }
            return ab.juliet(Byte.valueOf(bArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static Iterable romeo(Object[] objArr) {
        Intrinsics.echo(objArr, "<this>");
        if (objArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return new Lf.i(1, objArr);
    }

    public static List sierra(Object[] objArr) {
        Intrinsics.echo(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        Intrinsics.delta(asList, "asList(...)");
        return asList;
    }

    public static List silver(char[] cArr) {
        Intrinsics.echo(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(cArr.length);
                for (char c3 : cArr) {
                    arrayList.add(Character.valueOf(c3));
                }
                return arrayList;
            }
            return ab.juliet(Character.valueOf(cArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static InterfaceC2358h tango(Object[] objArr) {
        if (objArr.length == 0) {
            return C2354d.alpha;
        }
        return new o(0, objArr);
    }

    public static List teal(double[] dArr) {
        Intrinsics.echo(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(dArr.length);
                for (double d4 : dArr) {
                    arrayList.add(Double.valueOf(d4));
                }
                return arrayList;
            }
            return ab.juliet(Double.valueOf(dArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static boolean uniform(int i4, int[] iArr) {
        Intrinsics.echo(iArr, "<this>");
        int length = iArr.length;
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                if (i4 == iArr[i5]) {
                    break;
                }
                i5++;
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 < 0) {
            return false;
        }
        return true;
    }

    public static boolean victor(char[] cArr, char c3) {
        int length = cArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (c3 == cArr[i4]) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 < 0) {
            return false;
        }
        return true;
    }

    public static boolean whiskey(Object[] objArr, Object obj) {
        Intrinsics.echo(objArr, "<this>");
        if (jade(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static List white(float[] fArr) {
        Intrinsics.echo(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f5 : fArr) {
                    arrayList.add(Float.valueOf(f5));
                }
                return arrayList;
            }
            return ab.juliet(Float.valueOf(fArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static void xray(int i4, int i5, int i10, byte[] bArr, byte[] destination) {
        Intrinsics.echo(bArr, "<this>");
        Intrinsics.echo(destination, "destination");
        System.arraycopy(bArr, i5, destination, i4, i10 - i5);
    }

    public static void yankee(int i4, int i5, int i10, Object[] objArr, Object[] destination) {
        Intrinsics.echo(objArr, "<this>");
        Intrinsics.echo(destination, "destination");
        System.arraycopy(objArr, i5, destination, i4, i10 - i5);
    }

    public static List yellow(int[] iArr) {
        Intrinsics.echo(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                return e(iArr);
            }
            return ab.juliet(Integer.valueOf(iArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static void zulu(int i4, int i5, int[] iArr, int[] destination, int i10) {
        Intrinsics.echo(iArr, "<this>");
        Intrinsics.echo(destination, "destination");
        System.arraycopy(iArr, i5, destination, i4, i10 - i5);
    }
}
