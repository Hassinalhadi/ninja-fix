package ud;

import fe.C1713e;
import fe.C1714f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import pf.C2361k;
import sd.s;
import t6.AbstractC3070v2;

/* loaded from: classes2.dex */
public abstract class g {
    public static final /* synthetic */ int alpha = 0;

    static {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int i4;
        long j5;
        AbstractC3070v2.alpha(s.foxtrot, new C2361k(21), new f(0));
        C1713e c1713e = new C1713e(0, 255, 1);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(c1713e, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = c1713e.iterator();
        while (((C1714f) it).red) {
            int alpha2 = ((x) it).alpha();
            if (48 <= alpha2 && alpha2 < 58) {
                j5 = alpha2 - 48;
            } else {
                long j6 = alpha2;
                long j7 = 97;
                if (j6 < 97 || j6 > 102) {
                    j7 = 65;
                    if (j6 < 65 || j6 > 70) {
                        j5 = -1;
                    }
                }
                j5 = 10 + (j6 - j7);
            }
            arrayList.add(Long.valueOf(j5));
        }
        CollectionsKt.A(arrayList);
        C1713e c1713e2 = new C1713e(0, 15, 1);
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(c1713e2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator it2 = c1713e2.iterator();
        while (((C1714f) it2).red) {
            int alpha3 = ((x) it2).alpha();
            if (alpha3 < 10) {
                i4 = alpha3 + 48;
            } else {
                i4 = (char) (((char) (alpha3 + 97)) - '\n');
            }
            arrayList2.add(Byte.valueOf((byte) i4));
        }
        CollectionsKt___CollectionsKt.toByteArray(arrayList2);
    }

    public static final int alpha(CharSequence charSequence, int i4, int i5) {
        Intrinsics.echo(charSequence, "<this>");
        int i10 = 0;
        while (i4 < i5) {
            int charAt = charSequence.charAt(i4);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            i10 = (i10 * 31) + charAt;
            i4++;
        }
        return i10;
    }

    public static final void bravo(C3154b c3154b, int i4) {
        throw new NumberFormatException("Invalid number: " + ((Object) c3154b) + ", wrong digit: " + c3154b.charAt(i4) + " at position " + i4);
    }
}
