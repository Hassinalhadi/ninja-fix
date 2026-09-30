package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class r {
    public static final az alpha = new az("provider");
    public static final az bravo = new az("provider");
    public static final az charlie = new az("compositionLocalMap");
    public static final az delta = new az("providers");
    public static final az echo = new az("reference");
    public static final E0.k foxtrot = new E0.k(8);

    public static final void alpha(ArrayList arrayList, int i4, int i5) {
        int echo2 = echo(i4, arrayList);
        if (echo2 < 0) {
            echo2 = -(echo2 + 1);
        }
        while (echo2 < arrayList.size() && ((am) arrayList.get(echo2)).bravo < i5) {
        }
    }

    public static final void bravo(C0573f0 c0573f0, ArrayList arrayList, int i4) {
        if (c0573f0.lima(i4)) {
            arrayList.add(c0573f0.november(i4));
            return;
        }
        int[] iArr = c0573f0.bravo;
        int i5 = iArr[(i4 * 5) + 3] + i4;
        for (int i10 = i4 + 1; i10 < i5; i10 += iArr[(i10 * 5) + 3]) {
            bravo(c0573f0, arrayList, i10);
        }
    }

    public static final void charlie(@NotNull String str) {
        throw new ComposeRuntimeError(ao.ad.gray("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @NotNull
    public static final Void delta(@NotNull String str) {
        throw new ComposeRuntimeError(ao.ad.gray("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int echo(int i4, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i10 = (i5 + size) >>> 1;
            int golf = Intrinsics.golf(((am) arrayList.get(i10)).bravo, i4);
            if (golf < 0) {
                i5 = i10 + 1;
            } else if (golf > 0) {
                size = i10 - 1;
            } else {
                return i10;
            }
        }
        return -(i5 + 1);
    }

    public static final void foxtrot(j0 j0Var, int i4, Object obj) {
        int hotel = j0Var.hotel(i4);
        Object[] objArr = j0Var.charlie;
        Object obj2 = objArr[hotel];
        objArr[hotel] = C0580l.alpha;
        if (obj == obj2) {
            return;
        }
        charlie("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
