package I;

import androidx.compose.runtime.C0562a;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.j0;
import s6.AbstractC2768s5;

/* loaded from: classes3.dex */
public final class j extends aj {
    public static final j delta = new aj(0, 2, 1);

    @Override // I.aj
    public final void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        boolean z2;
        int i4;
        int i5;
        P.f fVar = (P.f) alVar.echo(0);
        int charlie = j0Var.charlie((C0562a) alVar.echo(1));
        if (j0Var.tango < charlie) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            androidx.compose.runtime.r.charlie("Check failed");
        }
        AbstractC2768s5.delta(j0Var, interfaceC0566c, charlie);
        int i10 = j0Var.tango;
        int i11 = j0Var.victor;
        while (i11 >= 0 && !j0Var.xray(i11)) {
            i11 = j0Var.black(i11, j0Var.bravo);
        }
        int i12 = i11 + 1;
        int i13 = 0;
        while (i12 < i10) {
            if (j0Var.uniform(i10, i12)) {
                if (j0Var.xray(i12)) {
                    i13 = 0;
                }
                i12++;
            } else {
                if (j0Var.xray(i12)) {
                    i5 = 1;
                } else {
                    i5 = j0Var.bravo[(j0Var.romeo(i12) * 5) + 1] & 67108863;
                }
                i13 += i5;
                i12 += j0Var.tango(i12);
            }
        }
        while (true) {
            i4 = j0Var.tango;
            if (i4 >= charlie) {
                break;
            }
            if (j0Var.uniform(charlie, i4)) {
                int i14 = j0Var.tango;
                if (i14 < j0Var.uniform && (j0Var.bravo[(j0Var.romeo(i14) * 5) + 1] & 1073741824) != 0) {
                    interfaceC0566c.charlie(j0Var.beige(j0Var.tango));
                    i13 = 0;
                }
                j0Var.indigo();
            } else {
                i13 += j0Var.fuchsia();
            }
        }
        if (i4 != charlie) {
            androidx.compose.runtime.r.charlie("Check failed");
        }
        fVar.alpha = i13;
    }
}
