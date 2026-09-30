package I;

import androidx.compose.runtime.C0562a;
import androidx.compose.runtime.C0565b0;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.j0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class r extends aj {
    public static final r foxtrot;
    public static final r hotel;
    public final /* synthetic */ int delta;
    public static final r echo = new r(1, 2, 0);
    public static final r golf = new r(1, 2, 2);

    static {
        int i4 = 1;
        foxtrot = new r(i4, i4, 1);
        int i5 = 1;
        hotel = new r(i5, i5, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i4, int i5, int i10) {
        super(i4, i5, 0, (byte) 0);
        this.delta = i10;
    }

    @Override // I.aj
    public final void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        switch (this.delta) {
            case 0:
                Object invoke = ((Function0) alVar.echo(0)).invoke();
                C0562a c0562a = (C0562a) alVar.echo(1);
                int delta = alVar.delta(0);
                c0562a.getClass();
                j0Var.magenta(j0Var.charlie(c0562a), invoke);
                interfaceC0566c.lima(delta, invoke);
                interfaceC0566c.charlie(invoke);
                return;
            case 1:
                C0562a c0562a2 = (C0562a) alVar.echo(0);
                int delta2 = alVar.delta(0);
                interfaceC0566c.kilo();
                c0562a2.getClass();
                interfaceC0566c.bravo(delta2, j0Var.beige(j0Var.charlie(c0562a2)));
                return;
            case 2:
                Object echo2 = alVar.echo(0);
                C0562a c0562a3 = (C0562a) alVar.echo(1);
                int delta3 = alVar.delta(0);
                if (echo2 instanceof C0565b0) {
                    C0565b0 c0565b0 = (C0565b0) echo2;
                    ((J.e) rVar.echo).bravo(c0565b0);
                    ((bv.am) rVar.delta).alpha(c0565b0);
                }
                Object emerald = j0Var.emerald(j0Var.charlie(c0562a3), delta3, echo2);
                if (emerald instanceof C0565b0) {
                    rVar.echo((C0565b0) emerald);
                    return;
                } else {
                    if (emerald instanceof Q) {
                        ((Q) emerald).delta();
                        return;
                    }
                    return;
                }
            default:
                Object echo3 = alVar.echo(0);
                int delta4 = alVar.delta(0);
                if (echo3 instanceof C0565b0) {
                    C0565b0 c0565b02 = (C0565b0) echo3;
                    ((J.e) rVar.echo).bravo(c0565b02);
                    ((bv.am) rVar.delta).alpha(c0565b02);
                }
                Object emerald2 = j0Var.emerald(j0Var.tango, delta4, echo3);
                if (emerald2 instanceof C0565b0) {
                    rVar.echo((C0565b0) emerald2);
                    return;
                } else {
                    if (emerald2 instanceof Q) {
                        ((Q) emerald2).delta();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // I.aj
    public C0562a delta(al alVar) {
        switch (this.delta) {
            case 0:
                return (C0562a) alVar.echo(1);
            case 1:
                return (C0562a) alVar.echo(0);
            default:
                return super.delta(alVar);
        }
    }
}
