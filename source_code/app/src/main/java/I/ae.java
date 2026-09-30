package I;

import androidx.compose.runtime.C0565b0;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.j0;

/* loaded from: classes3.dex */
public final class ae extends aj {
    public static final ae delta = new aj(1, 0, 2);

    @Override // I.aj
    public final void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        boolean z2 = false;
        int delta2 = alVar.delta(0);
        int i4 = j0Var.victor;
        int gray = j0Var.gray(j0Var.romeo(i4), j0Var.bravo);
        int golf = j0Var.golf(j0Var.romeo(i4 + 1), j0Var.bravo);
        for (int max = Math.max(gray, golf - delta2); max < golf; max++) {
            Object obj = j0Var.charlie[j0Var.hotel(max)];
            if (obj instanceof C0565b0) {
                rVar.echo((C0565b0) obj);
            } else if (obj instanceof Q) {
                ((Q) obj).delta();
            }
        }
        if (delta2 > 0) {
            z2 = true;
        }
        if (!z2) {
            androidx.compose.runtime.r.charlie("Check failed");
        }
        int i5 = j0Var.victor;
        int gray2 = j0Var.gray(j0Var.romeo(i5), j0Var.bravo);
        int golf2 = j0Var.golf(j0Var.romeo(i5 + 1), j0Var.bravo) - delta2;
        if (golf2 < gray2) {
            androidx.compose.runtime.r.charlie("Check failed");
        }
        j0Var.cyan(golf2, delta2, i5);
        int i10 = j0Var.india;
        if (i10 >= gray2) {
            j0Var.india = i10 - delta2;
        }
    }
}
