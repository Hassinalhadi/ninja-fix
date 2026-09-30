package I;

import androidx.compose.runtime.C0562a;
import androidx.compose.runtime.C0575g0;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.j0;

/* loaded from: classes3.dex */
public final class t extends aj {
    public static final t delta = new aj(0, 3, 1);

    @Override // I.aj
    public final void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        J2.e eVar;
        C0575g0 c0575g0 = (C0575g0) alVar.echo(1);
        C0562a c0562a = (C0562a) alVar.echo(0);
        c cVar = (c) alVar.echo(2);
        j0 hotel = c0575g0.hotel();
        if (akVar != null) {
            try {
                eVar = new J2.e(9, akVar, j0Var);
            } catch (Throwable th) {
                hotel.echo(false);
                throw th;
            }
        } else {
            eVar = null;
        }
        if (!cVar.bravo.delta()) {
            androidx.compose.runtime.r.charlie("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar.alpha.charlie(interfaceC0566c, hotel, rVar, eVar);
        hotel.echo(true);
        j0Var.delta();
        c0562a.getClass();
        j0Var.zulu(c0575g0, c0575g0.alpha(c0562a));
        j0Var.kilo();
    }
}
