package Y;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.al;

/* loaded from: classes3.dex */
public final class ac implements Comparator {
    public static final ac alpha = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object[], java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        aa aaVar = (aa) obj;
        aa aaVar2 = (aa) obj2;
        int i4 = 0;
        if (g.hotel(aaVar) && g.hotel(aaVar2)) {
            al golf = AbstractC2555o.golf(aaVar);
            al golf2 = AbstractC2555o.golf(aaVar2);
            if (!Intrinsics.areEqual(golf, golf2)) {
                al[] alVarArr = new al[16];
                int i5 = 0;
                while (golf != null) {
                    int i10 = i5 + 1;
                    if (alVarArr.length < i10) {
                        int length = alVarArr.length;
                        ?? r5 = new Object[Math.max(i10, length * 2)];
                        System.arraycopy(alVarArr, 0, r5, 0, length);
                        alVarArr = r5;
                    }
                    if (i5 != 0) {
                        System.arraycopy(alVarArr, 0, alVarArr, 0 + 1, i5 + 0);
                    }
                    alVarArr[0] = golf;
                    i5++;
                    golf = golf.victor();
                }
                al[] alVarArr2 = new al[16];
                int i11 = 0;
                while (golf2 != null) {
                    int i12 = i11 + 1;
                    if (alVarArr2.length < i12) {
                        int length2 = alVarArr2.length;
                        ?? r52 = new Object[Math.max(i12, length2 * 2)];
                        System.arraycopy(alVarArr2, 0, r52, 0, length2);
                        alVarArr2 = r52;
                    }
                    if (i11 != 0) {
                        System.arraycopy(alVarArr2, 0, alVarArr2, 0 + 1, i11 + 0);
                    }
                    alVarArr2[0] = golf2;
                    i11++;
                    golf2 = golf2.victor();
                }
                int min = Math.min(i5 - 1, i11 - 1);
                if (min >= 0) {
                    while (Intrinsics.areEqual(alVarArr[i4], alVarArr2[i4])) {
                        if (i4 != min) {
                            i4++;
                        }
                    }
                    return Intrinsics.golf(alVarArr[i4].whiskey(), alVarArr2[i4].whiskey());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (g.hotel(aaVar)) {
                return -1;
            }
            if (g.hotel(aaVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
