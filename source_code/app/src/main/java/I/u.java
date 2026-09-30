package I;

import androidx.compose.runtime.C0562a;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.i0;
import androidx.compose.runtime.j0;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;

/* loaded from: classes3.dex */
public final class u extends aj {
    public static final u delta = new aj(1, 0, 2);

    @Override // I.aj
    public final void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        boolean z2;
        C0562a c0562a;
        int charlie;
        int i4;
        int delta2 = alVar.delta(0);
        if (j0Var.november != 0) {
            androidx.compose.runtime.r.charlie("Cannot move a group while inserting");
        }
        boolean z10 = true;
        if (delta2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            androidx.compose.runtime.r.charlie("Parameter offset is out of bounds");
        }
        if (delta2 != 0) {
            int i5 = j0Var.tango;
            int i10 = j0Var.victor;
            int i11 = j0Var.uniform;
            int i12 = i5;
            while (delta2 > 0) {
                i12 += j0Var.bravo[(j0Var.romeo(i12) * 5) + 3];
                if (i12 > i11) {
                    androidx.compose.runtime.r.charlie("Parameter offset is out of bounds");
                }
                delta2--;
            }
            int i13 = j0Var.bravo[(j0Var.romeo(i12) * 5) + 3];
            int golf = j0Var.golf(j0Var.romeo(j0Var.tango), j0Var.bravo);
            int golf2 = j0Var.golf(j0Var.romeo(i12), j0Var.bravo);
            int i14 = i12 + i13;
            int golf3 = j0Var.golf(j0Var.romeo(i14), j0Var.bravo);
            int i15 = golf3 - golf2;
            j0Var.whiskey(i15, Math.max(j0Var.tango - 1, 0));
            j0Var.victor(i13);
            int[] iArr = j0Var.bravo;
            int romeo = j0Var.romeo(i14) * 5;
            ArraysKt.zulu(j0Var.romeo(i5) * 5, romeo, iArr, iArr, (i13 * 5) + romeo);
            if (i15 > 0) {
                Object[] objArr = j0Var.charlie;
                int hotel = j0Var.hotel(golf2 + i15);
                System.arraycopy(objArr, hotel, objArr, golf, j0Var.hotel(golf3 + i15) - hotel);
            }
            int i16 = golf2 + i15;
            int i17 = i16 - golf;
            int i18 = j0Var.kilo;
            int i19 = j0Var.lima;
            int length = j0Var.charlie.length;
            int i20 = j0Var.mike;
            int i21 = i5 + i13;
            int i22 = i5;
            while (i22 < i21) {
                boolean z11 = z10;
                int romeo2 = j0Var.romeo(i22);
                int i23 = i22;
                int golf4 = j0Var.golf(romeo2, iArr) - i17;
                if (i20 < romeo2) {
                    i4 = 0;
                } else {
                    i4 = i18;
                }
                iArr[(romeo2 * 5) + 4] = j0.india(j0.india(golf4, i4, i19, length), j0Var.kilo, j0Var.lima, j0Var.charlie.length);
                i22 = i23 + 1;
                z10 = z11;
                i17 = i17;
                i18 = i18;
            }
            int i24 = i14 + i13;
            int papa = j0Var.papa();
            int bravo = i0.bravo(j0Var.delta, i14, papa);
            ArrayList arrayList = new ArrayList();
            if (bravo >= 0) {
                while (bravo < j0Var.delta.size() && (charlie = j0Var.charlie((c0562a = (C0562a) j0Var.delta.get(bravo)))) >= i14 && charlie < i24) {
                    arrayList.add(c0562a);
                }
            }
            int i25 = i5 - i14;
            int size = arrayList.size();
            for (int i26 = 0; i26 < size; i26++) {
                C0562a c0562a2 = (C0562a) arrayList.get(i26);
                int charlie2 = j0Var.charlie(c0562a2) + i25;
                if (charlie2 >= j0Var.golf) {
                    c0562a2.alpha = -(papa - charlie2);
                } else {
                    c0562a2.alpha = charlie2;
                }
                j0Var.delta.add(i0.bravo(j0Var.delta, charlie2, papa), c0562a2);
            }
            if (j0Var.crimson(i14, i13)) {
                androidx.compose.runtime.r.charlie("Unexpectedly removed anchors");
            }
            j0Var.mike(i10, j0Var.uniform, i5);
            if (i15 > 0) {
                j0Var.cyan(i16, i15, i14 - 1);
            }
        }
    }
}
