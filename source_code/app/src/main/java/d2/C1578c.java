package d2;

import Y1.aq;
import Y1.ar;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import s6.W6;
import s6.X6;
import s6.Z6;

/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1578c extends Y1.f {
    public final /* synthetic */ int romeo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1578c(int i4, boolean z2) {
        super(z2);
        this.romeo = i4;
    }

    public static double[] india(String value) {
        Intrinsics.echo(value, "value");
        return new double[]{Double.parseDouble(value)};
    }

    @Override // Y1.aq
    public final Object alpha(Bundle bundle, String str) {
        int collectionSizeOrDefault;
        switch (this.romeo) {
            case 0:
                if (!Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) || W6.juliet(bundle, str)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                X6.charlie(str);
                throw null;
            case 1:
                if (!Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) || W6.juliet(bundle, str)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return ArraysKt.teal(doubleArray2);
                }
                X6.charlie(str);
                throw null;
            case 2:
                if (Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) && !W6.juliet(bundle, str)) {
                    String[] india = W6.india(bundle, str);
                    ArrayList arrayList = new ArrayList(india.length);
                    for (String str2 : india) {
                        arrayList.add((String) aq.oscar.delta(str2));
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
                return null;
            default:
                if (Q0.c.beige(bundle, "bundle", str, Constants.KEY_KEY, str) && !W6.juliet(bundle, str)) {
                    List b2 = ArraysKt.b(W6.india(bundle, str));
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(b2, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                    Iterator it = b2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((String) aq.oscar.delta((String) it.next()));
                    }
                    return arrayList2;
                }
                return null;
        }
    }

    @Override // Y1.aq
    public final String bravo() {
        switch (this.romeo) {
            case 0:
                return "double[]";
            case 1:
                return "List<Double>";
            case 2:
                return "string_nullable[]";
            default:
                return "List<String?>";
        }
    }

    @Override // Y1.aq
    public final Object charlie(Object obj, String str) {
        switch (this.romeo) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null) {
                    double[] india = india(str);
                    int length = dArr.length;
                    double[] copyOf = Arrays.copyOf(dArr, length + 1);
                    System.arraycopy(india, 0, copyOf, length, 1);
                    Intrinsics.checkNotNull(copyOf);
                    if (copyOf != null) {
                        return copyOf;
                    }
                }
                return india(str);
            case 1:
                List list = (List) obj;
                if (list != null) {
                    return CollectionsKt.a(list, ab.juliet(Double.valueOf(Double.parseDouble(str))));
                }
                return ab.juliet(Double.valueOf(Double.parseDouble(str)));
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    String[] juliet = juliet(str);
                    int length2 = strArr.length;
                    Object[] copyOf2 = Arrays.copyOf(strArr, length2 + 1);
                    System.arraycopy(juliet, 0, copyOf2, length2, 1);
                    Intrinsics.checkNotNull(copyOf2);
                    String[] strArr2 = (String[]) copyOf2;
                    if (strArr2 != null) {
                        return strArr2;
                    }
                }
                return juliet(str);
            default:
                List list2 = (List) obj;
                Y1.e eVar = aq.oscar;
                if (list2 != null) {
                    return CollectionsKt.a(list2, ab.juliet(eVar.delta(str)));
                }
                return ab.juliet(eVar.delta(str));
        }
    }

    @Override // Y1.aq
    public final Object delta(String value) {
        switch (this.romeo) {
            case 0:
                return india(value);
            case 1:
                Intrinsics.echo(value, "value");
                return ab.juliet(Double.valueOf(Double.parseDouble(value)));
            case 2:
                return juliet(value);
            default:
                Intrinsics.echo(value, "value");
                return ab.juliet(aq.oscar.delta(value));
        }
    }

    @Override // Y1.aq
    public final void echo(Bundle bundle, String key, Object obj) {
        int collectionSizeOrDefault;
        switch (this.romeo) {
            case 0:
                double[] dArr = (double[]) obj;
                Intrinsics.echo(key, "key");
                if (dArr == null) {
                    Z6.bravo(bundle, key);
                    return;
                } else {
                    bundle.putDoubleArray(key, dArr);
                    return;
                }
            case 1:
                List list = (List) obj;
                Intrinsics.echo(key, "key");
                if (list == null) {
                    Z6.bravo(bundle, key);
                    return;
                }
                double[] dArr2 = new double[list.size()];
                Iterator it = list.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    dArr2[i4] = ((Number) it.next()).doubleValue();
                    i4++;
                }
                bundle.putDoubleArray(key, dArr2);
                return;
            case 2:
                String[] strArr = (String[]) obj;
                Intrinsics.echo(key, "key");
                if (strArr == null) {
                    Z6.bravo(bundle, key);
                    return;
                }
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str : strArr) {
                    if (str == null) {
                        str = BuildConfig.TRAVIS;
                    }
                    arrayList.add(str);
                }
                Z6.foxtrot(bundle, key, (String[]) arrayList.toArray(new String[0]));
                return;
            default:
                List<String> list2 = (List) obj;
                Intrinsics.echo(key, "key");
                if (list2 != null) {
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                    for (String str2 : list2) {
                        if (str2 == null) {
                            str2 = BuildConfig.TRAVIS;
                        }
                        arrayList2.add(str2);
                    }
                    Z6.foxtrot(bundle, key, (String[]) arrayList2.toArray(new String[0]));
                    return;
                }
                Z6.bravo(bundle, key);
                return;
        }
    }

    @Override // Y1.f
    public final Object golf() {
        switch (this.romeo) {
            case 0:
                return new double[0];
            case 1:
                return CollectionsKt.emptyList();
            case 2:
                return new String[0];
            default:
                return CollectionsKt.emptyList();
        }
    }

    @Override // Y1.f
    public final List hotel(Object obj) {
        List teal;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        String str;
        int collectionSizeOrDefault3;
        String str2;
        switch (this.romeo) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null && (teal = ArraysKt.teal(dArr)) != null) {
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(teal, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator it = teal.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
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
                        arrayList2.add(String.valueOf(((Number) it2.next()).doubleValue()));
                    }
                    return arrayList2;
                }
                return CollectionsKt.emptyList();
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    ArrayList arrayList3 = new ArrayList(strArr.length);
                    for (String str3 : strArr) {
                        if (str3 != null) {
                            str = ar.bravo(str3);
                        } else {
                            str = BuildConfig.TRAVIS;
                        }
                        arrayList3.add(str);
                    }
                    return arrayList3;
                }
                return CollectionsKt.emptyList();
            default:
                List<String> list2 = (List) obj;
                if (list2 != null) {
                    collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault3);
                    for (String str4 : list2) {
                        if (str4 != null) {
                            str2 = ar.bravo(str4);
                        } else {
                            str2 = BuildConfig.TRAVIS;
                        }
                        arrayList4.add(str2);
                    }
                    return arrayList4;
                }
                return CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String[] juliet(String value) {
        Intrinsics.echo(value, "value");
        return new String[]{aq.oscar.delta(value)};
    }
}
