package I;

import androidx.compose.runtime.C0562a;
import androidx.compose.runtime.C0565b0;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.j0;

/* loaded from: classes3.dex */
public final class e extends aj {
    public static final e delta = new aj(0, 2, 1);

    @Override // I.aj
    public final void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        C0562a c0562a = (C0562a) alVar.echo(0);
        Object echo = alVar.echo(1);
        if (echo instanceof C0565b0) {
            C0565b0 c0565b0 = (C0565b0) echo;
            ((J.e) rVar.echo).bravo(c0565b0);
            ((bv.am) rVar.delta).alpha(c0565b0);
        }
        if (j0Var.november != 0) {
            androidx.compose.runtime.r.charlie("Can only append a slot if not current inserting");
        }
        int i4 = j0Var.india;
        int i5 = j0Var.juliet;
        int charlie = j0Var.charlie(c0562a);
        int golf = j0Var.golf(j0Var.romeo(charlie + 1), j0Var.bravo);
        j0Var.india = golf;
        j0Var.juliet = golf;
        j0Var.whiskey(1, charlie);
        if (i4 >= golf) {
            i4++;
            i5++;
        }
        j0Var.charlie[golf] = echo;
        j0Var.india = i4;
        j0Var.juliet = i5;
    }
}
