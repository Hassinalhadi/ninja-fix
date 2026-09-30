package t6;

import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2743p6;

/* renamed from: t6.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2996g2 {
    public static final void alpha(sd.y yVar, String str, int i4, int i5, int i10) {
        if (i5 == -1) {
            int delta = delta(i4, i10, str);
            int charlie = charlie(delta, i10, str);
            if (charlie > delta) {
                String substring = str.substring(delta, charlie);
                Intrinsics.delta(substring, "substring(...)");
                yVar.indigo(substring, CollectionsKt.emptyList());
                return;
            }
            return;
        }
        int delta2 = delta(i4, i5, str);
        int charlie2 = charlie(delta2, i5, str);
        if (charlie2 > delta2) {
            String substring2 = str.substring(delta2, charlie2);
            Intrinsics.delta(substring2, "substring(...)");
            int delta3 = delta(i5 + 1, i10, str);
            String substring3 = str.substring(delta3, charlie(delta3, i10, str));
            Intrinsics.delta(substring3, "substring(...)");
            yVar.F(substring2, substring3);
        }
    }

    public static String bravo(Class cls) {
        LinkedHashMap linkedHashMap = Y1.au.bravo;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            Y1.as asVar = (Y1.as) cls.getAnnotation(Y1.as.class);
            if (asVar != null) {
                str = asVar.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
        }
        Intrinsics.checkNotNull(str);
        return str;
    }

    public static final int charlie(int i4, int i5, String str) {
        while (i5 > i4 && AbstractC2743p6.delta(str.charAt(i5 - 1))) {
            i5--;
        }
        return i5;
    }

    public static final int delta(int i4, int i5, String str) {
        while (i4 < i5 && AbstractC2743p6.delta(str.charAt(i4))) {
            i4++;
        }
        return i4;
    }
}
