package t6;

import android.content.res.Resources;
import androidx.compose.runtime.AbstractC0587t;
import androidx.compose.runtime.C0562a;
import androidx.compose.runtime.C0573f0;
import androidx.compose.runtime.C0583o;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t0.AbstractC2901T;

/* renamed from: t6.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3081x3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [He.c, androidx.compose.runtime.tooling.h] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List alpha(androidx.compose.runtime.j0 j0Var, Integer num, int i4, Integer num2) {
        int i5;
        int i10;
        bv.ah ahVar;
        if (!j0Var.whiskey && j0Var.papa() != 0) {
            ?? hVar = new androidx.compose.runtime.tooling.h(j0Var);
            if (num2 != null) {
                i5 = num2.intValue();
            } else {
                i5 = j0Var.victor;
                if (i5 < 0) {
                    i5 = j0Var.black(i4, j0Var.bravo);
                }
            }
            if (num == 0) {
                int gray = j0Var.india - j0Var.gray(j0Var.romeo(i4), j0Var.bravo);
                bv.aa aaVar = j0Var.sierra;
                if (aaVar != null && (ahVar = (bv.ah) aaVar.bravo(i4)) != null) {
                    i10 = ahVar.bravo;
                } else {
                    i10 = 0;
                }
                num = Integer.valueOf(gray + i10);
            }
            while (i4 >= 0) {
                hVar.golf(j0Var.green(i4), num);
                num = j0Var.bravo(i4);
                if (i5 >= 0) {
                    int i11 = i5;
                    i5 = j0Var.black(i5, j0Var.bravo);
                    i4 = i11;
                } else {
                    i4 = i5;
                }
            }
            return hVar.alpha;
        }
        return CollectionsKt.emptyList();
    }

    public static final float bravo(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        return ((Resources) c0585q.kilo(AndroidCompositionLocals_androidKt.charlie)).getDimension(i4) / ((Q0.d) c0585q.kilo(AbstractC2901T.hotel)).alpha();
    }

    public static final Integer charlie(C0573f0 c0573f0, AbstractC0587t abstractC0587t, int i4, int i5) {
        Integer charlie;
        while (true) {
            C0583o c0583o = null;
            if (i4 >= i5) {
                return null;
            }
            int[] iArr = c0573f0.bravo;
            int i10 = iArr[(i4 * 5) + 3] + i4;
            if (c0573f0.juliet(i4) && c0573f0.india(i4) == 206 && Intrinsics.areEqual(c0573f0.papa(i4, iArr), androidx.compose.runtime.r.echo)) {
                Object hotel = c0573f0.hotel(i4, 0);
                if (hotel instanceof C0583o) {
                    c0583o = (C0583o) hotel;
                }
                if (c0583o != null && Intrinsics.areEqual(c0583o.alpha, abstractC0587t)) {
                    return Integer.valueOf(i4);
                }
            }
            if (c0573f0.delta(i4) && (charlie = charlie(c0573f0, abstractC0587t, i4 + 1, i10)) != null) {
                return Integer.valueOf(charlie.intValue());
            }
            i4 = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [He.c, androidx.compose.runtime.tooling.h] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList delta(C0573f0 c0573f0, int i4, Integer num) {
        ?? hVar = new androidx.compose.runtime.tooling.h(c0573f0);
        int quebec = c0573f0.quebec(i4);
        C0562a alpha = c0573f0.alpha(i4);
        while (i4 >= 0) {
            hVar.golf(c0573f0.alpha.kilo(i4), num);
            if (quebec >= 0) {
                C0562a c0562a = alpha;
                alpha = c0573f0.alpha(quebec);
                i4 = quebec;
                quebec = c0573f0.quebec(quebec);
                num = c0562a;
            } else {
                i4 = quebec;
                num = alpha;
            }
        }
        return hVar.alpha;
    }
}
