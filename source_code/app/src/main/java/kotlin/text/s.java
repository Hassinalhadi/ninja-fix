package kotlin.text;

import fe.C1713e;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ s(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e2  */
    @Override // Xd.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i4;
        int i5;
        int i10;
        Object obj3;
        Pair pair;
        Object obj4;
        switch (this.alpha) {
            case 0:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                Intrinsics.echo(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int xray = StringsKt__StringsKt.xray(DelimitedRangesSequence, (char[]) this.purple, intValue, false);
                if (xray < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(xray), 1);
            default:
                CharSequence DelimitedRangesSequence2 = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                Intrinsics.echo(DelimitedRangesSequence2, "$this$DelimitedRangesSequence");
                List list = (List) this.purple;
                if (list.size() == 1) {
                    String str = (String) CollectionsKt.j(list);
                    int fuchsia = StringsKt.fuchsia(DelimitedRangesSequence2, str, intValue2, false, 4);
                    if (fuchsia >= 0) {
                        pair = new Pair(Integer.valueOf(fuchsia), str);
                        if (pair != null) {
                            return null;
                        }
                        return new Pair(pair.getFirst(), Integer.valueOf(((String) pair.getSecond()).length()));
                    }
                    pair = null;
                    if (pair != null) {
                    }
                } else {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    C1713e c1713e = new C1713e(intValue2, DelimitedRangesSequence2.length(), 1);
                    boolean z2 = DelimitedRangesSequence2 instanceof String;
                    int i11 = c1713e.red;
                    int i12 = c1713e.purple;
                    if (z2) {
                        if ((i11 > 0 && intValue2 <= i12) || (i11 < 0 && i12 <= intValue2)) {
                            int i13 = intValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (r.lima(0, i13, str2.length(), str2, (String) DelimitedRangesSequence2, false)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    pair = new Pair(Integer.valueOf(i13), str3);
                                } else if (i13 != i12) {
                                    i13 += i11;
                                }
                            }
                        }
                        pair = null;
                        if (pair != null) {
                        }
                    } else {
                        if ((i11 > 0 && intValue2 <= i12) || (i11 < 0 && i12 <= intValue2)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        int i14 = i12;
                                        String str4 = (String) obj3;
                                        int i15 = i11;
                                        i4 = intValue2;
                                        i5 = i15;
                                        i10 = i14;
                                        if (!StringsKt__StringsKt.yankee(str4, 0, DelimitedRangesSequence2, i4, str4.length(), false)) {
                                            i11 = i5;
                                            intValue2 = i4;
                                            i12 = i10;
                                        }
                                    } else {
                                        int i16 = i11;
                                        i4 = intValue2;
                                        i5 = i16;
                                        i10 = i12;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    pair = new Pair(Integer.valueOf(i4), str5);
                                } else if (i4 != i10) {
                                    int i17 = i4 + i5;
                                    i11 = i5;
                                    intValue2 = i17;
                                    i12 = i10;
                                }
                            }
                        }
                        pair = null;
                        if (pair != null) {
                        }
                    }
                }
        }
    }
}
