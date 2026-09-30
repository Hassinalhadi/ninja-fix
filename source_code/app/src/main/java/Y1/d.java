package Y1;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import s6.W6;
import s6.X6;
import s6.Z6;

/* loaded from: classes3.dex */
public final class d extends f {
    public final /* synthetic */ int romeo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i4, boolean z2) {
        super(z2);
        this.romeo = i4;
    }

    public static float[] india(String value) {
        Intrinsics.echo(value, "value");
        return new float[]{((Number) aq.india.delta(value)).floatValue()};
    }

    public static int[] juliet(String value) {
        Intrinsics.echo(value, "value");
        return new int[]{((Number) aq.bravo.delta(value)).intValue()};
    }

    public static long[] kilo(String value) {
        Intrinsics.echo(value, "value");
        return new long[]{((Number) aq.foxtrot.delta(value)).longValue()};
    }

    public static boolean[] lima(String value) {
        Intrinsics.echo(value, "value");
        return new boolean[]{((Boolean) aq.lima.delta(value)).booleanValue()};
    }

    @Override // Y1.aq
    public final Object alpha(Bundle bundle, String str) {
        switch (this.romeo) {
            case 0:
                if (!Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) || W6.juliet(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                X6.charlie(str);
                throw null;
            case 1:
                if (!Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) || W6.juliet(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return ArraysKt.d(booleanArray2);
                }
                X6.charlie(str);
                throw null;
            case 2:
                if (!Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) || W6.juliet(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                X6.charlie(str);
                throw null;
            case 3:
                if (!Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) || W6.juliet(bundle, str)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return ArraysKt.white(floatArray2);
                }
                X6.charlie(str);
                throw null;
            case 4:
                if (!Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) || W6.juliet(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                X6.charlie(str);
                throw null;
            case 5:
                if (!Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) || W6.juliet(bundle, str)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    return ArraysKt.yellow(intArray2);
                }
                X6.charlie(str);
                throw null;
            case 6:
                if (!Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) || W6.juliet(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                X6.charlie(str);
                throw null;
            case 7:
                if (!Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) || W6.juliet(bundle, str)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return ArraysKt.a(longArray2);
                }
                X6.charlie(str);
                throw null;
            case 8:
                if (Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) && !W6.juliet(bundle, str)) {
                    return W6.india(bundle, str);
                }
                return null;
            default:
                if (Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) && !W6.juliet(bundle, str)) {
                    return ArraysKt.b(W6.india(bundle, str));
                }
                return null;
        }
    }

    @Override // Y1.aq
    public final String bravo() {
        switch (this.romeo) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // Y1.aq
    public final Object charlie(Object obj, String str) {
        switch (this.romeo) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    boolean[] lima = lima(str);
                    int length = zArr.length;
                    boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                    System.arraycopy(lima, 0, copyOf, length, 1);
                    Intrinsics.checkNotNull(copyOf);
                    if (copyOf != null) {
                        return copyOf;
                    }
                }
                return lima(str);
            case 1:
                List list = (List) obj;
                e eVar = aq.lima;
                if (list != null) {
                    return CollectionsKt.a(list, kotlin.collections.ab.juliet(eVar.delta(str)));
                }
                return kotlin.collections.ab.juliet(eVar.delta(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    float[] india = india(str);
                    int length2 = fArr.length;
                    float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                    System.arraycopy(india, 0, copyOf2, length2, 1);
                    Intrinsics.checkNotNull(copyOf2);
                    if (copyOf2 != null) {
                        return copyOf2;
                    }
                }
                return india(str);
            case 3:
                List list2 = (List) obj;
                e eVar2 = aq.india;
                if (list2 != null) {
                    return CollectionsKt.a(list2, kotlin.collections.ab.juliet(eVar2.delta(str)));
                }
                return kotlin.collections.ab.juliet(eVar2.delta(str));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    int[] juliet = juliet(str);
                    int length3 = iArr.length;
                    int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                    System.arraycopy(juliet, 0, copyOf3, length3, 1);
                    Intrinsics.checkNotNull(copyOf3);
                    if (copyOf3 != null) {
                        return copyOf3;
                    }
                }
                return juliet(str);
            case 5:
                List list3 = (List) obj;
                e eVar3 = aq.bravo;
                if (list3 != null) {
                    return CollectionsKt.a(list3, kotlin.collections.ab.juliet(eVar3.delta(str)));
                }
                return kotlin.collections.ab.juliet(eVar3.delta(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    long[] kilo = kilo(str);
                    int length4 = jArr.length;
                    long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                    System.arraycopy(kilo, 0, copyOf4, length4, 1);
                    Intrinsics.checkNotNull(copyOf4);
                    if (copyOf4 != null) {
                        return copyOf4;
                    }
                }
                return kilo(str);
            case 7:
                List list4 = (List) obj;
                e eVar4 = aq.foxtrot;
                if (list4 != null) {
                    return CollectionsKt.a(list4, kotlin.collections.ab.juliet(eVar4.delta(str)));
                }
                return kotlin.collections.ab.juliet(eVar4.delta(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    int length5 = strArr.length;
                    Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                    System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                    Intrinsics.checkNotNull(copyOf5);
                    String[] strArr2 = (String[]) copyOf5;
                    if (strArr2 != null) {
                        return strArr2;
                    }
                }
                return new String[]{str};
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    return CollectionsKt.a(list5, kotlin.collections.ab.juliet(str));
                }
                return kotlin.collections.ab.juliet(str);
        }
    }

    @Override // Y1.aq
    public final Object delta(String value) {
        switch (this.romeo) {
            case 0:
                return lima(value);
            case 1:
                Intrinsics.echo(value, "value");
                return kotlin.collections.ab.juliet(aq.lima.delta(value));
            case 2:
                return india(value);
            case 3:
                Intrinsics.echo(value, "value");
                return kotlin.collections.ab.juliet(aq.india.delta(value));
            case 4:
                return juliet(value);
            case 5:
                Intrinsics.echo(value, "value");
                return kotlin.collections.ab.juliet(aq.bravo.delta(value));
            case 6:
                return kilo(value);
            case 7:
                Intrinsics.echo(value, "value");
                return kotlin.collections.ab.juliet(aq.foxtrot.delta(value));
            case 8:
                Intrinsics.echo(value, "value");
                return new String[]{value};
            default:
                Intrinsics.echo(value, "value");
                return kotlin.collections.ab.juliet(value);
        }
    }

    @Override // Y1.aq
    public final void echo(Bundle bundle, String key, Object obj) {
        switch (this.romeo) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                Intrinsics.echo(key, "key");
                if (zArr != null) {
                    bundle.putBooleanArray(key, zArr);
                    return;
                } else {
                    Z6.bravo(bundle, key);
                    return;
                }
            case 1:
                List list = (List) obj;
                Intrinsics.echo(key, "key");
                if (list != null) {
                    bundle.putBooleanArray(key, CollectionsKt.u(list));
                    return;
                } else {
                    Z6.bravo(bundle, key);
                    return;
                }
            case 2:
                float[] fArr = (float[]) obj;
                Intrinsics.echo(key, "key");
                if (fArr != null) {
                    bundle.putFloatArray(key, fArr);
                    return;
                } else {
                    Z6.bravo(bundle, key);
                    return;
                }
            case 3:
                List list2 = (List) obj;
                Intrinsics.echo(key, "key");
                if (list2 != null) {
                    bundle.putFloatArray(key, CollectionsKt.w(list2));
                    return;
                } else {
                    Z6.bravo(bundle, key);
                    return;
                }
            case 4:
                int[] iArr = (int[]) obj;
                Intrinsics.echo(key, "key");
                if (iArr != null) {
                    bundle.putIntArray(key, iArr);
                    return;
                } else {
                    Z6.bravo(bundle, key);
                    return;
                }
            case 5:
                List list3 = (List) obj;
                Intrinsics.echo(key, "key");
                if (list3 != null) {
                    bundle.putIntArray(key, CollectionsKt.y(list3));
                    return;
                }
                return;
            case 6:
                long[] jArr = (long[]) obj;
                Intrinsics.echo(key, "key");
                if (jArr != null) {
                    bundle.putLongArray(key, jArr);
                    return;
                } else {
                    Z6.bravo(bundle, key);
                    return;
                }
            case 7:
                List list4 = (List) obj;
                Intrinsics.echo(key, "key");
                if (list4 != null) {
                    bundle.putLongArray(key, CollectionsKt.A(list4));
                    return;
                } else {
                    Z6.bravo(bundle, key);
                    return;
                }
            case 8:
                String[] strArr = (String[]) obj;
                Intrinsics.echo(key, "key");
                if (strArr != null) {
                    Z6.foxtrot(bundle, key, strArr);
                    return;
                } else {
                    Z6.bravo(bundle, key);
                    return;
                }
            default:
                List list5 = (List) obj;
                Intrinsics.echo(key, "key");
                if (list5 != null) {
                    Z6.foxtrot(bundle, key, (String[]) list5.toArray(new String[0]));
                    return;
                } else {
                    Z6.bravo(bundle, key);
                    return;
                }
        }
    }

    @Override // Y1.f
    public final Object golf() {
        switch (this.romeo) {
            case 0:
                return new boolean[0];
            case 1:
                return CollectionsKt.emptyList();
            case 2:
                return new float[0];
            case 3:
                return CollectionsKt.emptyList();
            case 4:
                return new int[0];
            case 5:
                return CollectionsKt.emptyList();
            case 6:
                return new long[0];
            case 7:
                return CollectionsKt.emptyList();
            case 8:
                return new String[0];
            default:
                return CollectionsKt.emptyList();
        }
    }

    @Override // Y1.f
    public final List hotel(Object obj) {
        List d4;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List white;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        List yellow;
        int collectionSizeOrDefault5;
        int collectionSizeOrDefault6;
        List a6;
        int collectionSizeOrDefault7;
        int collectionSizeOrDefault8;
        int collectionSizeOrDefault9;
        switch (this.romeo) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null && (d4 = ArraysKt.d(zArr)) != null) {
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(d4, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator it = d4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                    }
                    return arrayList;
                }
                return CollectionsKt.emptyList();
            case 1:
                List list = (List) obj;
                if (list != null) {
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
                    }
                    return arrayList2;
                }
                return CollectionsKt.emptyList();
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null && (white = ArraysKt.white(fArr)) != null) {
                    collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(white, 10);
                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
                    Iterator it3 = white.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(String.valueOf(((Number) it3.next()).floatValue()));
                    }
                    return arrayList3;
                }
                return CollectionsKt.emptyList();
            case 3:
                List list2 = (List) obj;
                if (list2 != null) {
                    collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault4);
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(String.valueOf(((Number) it4.next()).floatValue()));
                    }
                    return arrayList4;
                }
                return CollectionsKt.emptyList();
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null && (yellow = ArraysKt.yellow(iArr)) != null) {
                    collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(yellow, 10);
                    ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault5);
                    Iterator it5 = yellow.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(String.valueOf(((Number) it5.next()).intValue()));
                    }
                    return arrayList5;
                }
                return CollectionsKt.emptyList();
            case 5:
                List list3 = (List) obj;
                if (list3 != null) {
                    collectionSizeOrDefault6 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                    ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault6);
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(String.valueOf(((Number) it6.next()).intValue()));
                    }
                    return arrayList6;
                }
                return CollectionsKt.emptyList();
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null && (a6 = ArraysKt.a(jArr)) != null) {
                    collectionSizeOrDefault7 = CollectionsKt__IterablesKt.collectionSizeOrDefault(a6, 10);
                    ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault7);
                    Iterator it7 = a6.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add(String.valueOf(((Number) it7.next()).longValue()));
                    }
                    return arrayList7;
                }
                return CollectionsKt.emptyList();
            case 7:
                List list4 = (List) obj;
                if (list4 != null) {
                    collectionSizeOrDefault8 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
                    ArrayList arrayList8 = new ArrayList(collectionSizeOrDefault8);
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        arrayList8.add(String.valueOf(((Number) it8.next()).longValue()));
                    }
                    return arrayList8;
                }
                return CollectionsKt.emptyList();
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    ArrayList arrayList9 = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        arrayList9.add(ar.bravo(str));
                    }
                    return arrayList9;
                }
                return CollectionsKt.emptyList();
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    collectionSizeOrDefault9 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10);
                    ArrayList arrayList10 = new ArrayList(collectionSizeOrDefault9);
                    Iterator it9 = list5.iterator();
                    while (it9.hasNext()) {
                        arrayList10.add(ar.bravo((String) it9.next()));
                    }
                    return arrayList10;
                }
                return CollectionsKt.emptyList();
        }
    }
}
