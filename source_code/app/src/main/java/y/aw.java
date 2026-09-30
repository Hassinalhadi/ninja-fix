package y;

import androidx.compose.runtime.t0;
import i0.InterfaceC1878a;
import kotlin.jvm.internal.Intrinsics;
import n.e0;

/* loaded from: classes3.dex */
public final class aw implements n.K {
    public final /* synthetic */ C3344D alpha;

    public aw(C3344D c3344d) {
        this.alpha = c3344d;
    }

    @Override // n.K
    public final void alpha() {
        C3344D c3344d = this.alpha;
        C3344D.delta(c3344d, null);
        C3344D.charlie(c3344d, null);
    }

    @Override // n.K
    public final void bravo(long j5) {
        e0 delta;
        C3344D c3344d = this.alpha;
        long alpha = ai.alpha(c3344d.mike(true));
        n.ax axVar = c3344d.delta;
        if (axVar != null && (delta = axVar.delta()) != null) {
            long echo = delta.echo(alpha);
            c3344d.oscar = echo;
            ((t0) c3344d.sierra).setValue(new Z.b(echo));
            c3344d.quebec = 0L;
            ((t0) c3344d.romeo).setValue(n.al.alpha);
            c3344d.uniform(false);
        }
    }

    @Override // n.K
    public final void charlie() {
        C3344D c3344d = this.alpha;
        C3344D.delta(c3344d, null);
        C3344D.charlie(c3344d, null);
    }

    @Override // n.K
    public final void delta() {
    }

    @Override // n.K
    public final void echo(long j5) {
        e0 delta;
        InterfaceC1878a interfaceC1878a;
        C3344D c3344d = this.alpha;
        c3344d.quebec = Z.b.golf(c3344d.quebec, j5);
        n.ax axVar = c3344d.delta;
        if (axVar != null && (delta = axVar.delta()) != null) {
            ((t0) c3344d.sierra).setValue(new Z.b(Z.b.golf(c3344d.oscar, c3344d.quebec)));
            I0.t tVar = c3344d.bravo;
            Z.b kilo = c3344d.kilo();
            Intrinsics.checkNotNull(kilo);
            int transformedToOriginal = tVar.transformedToOriginal(delta.bravo(kilo.alpha, true));
            long bravo = D0.ae.bravo(transformedToOriginal, transformedToOriginal);
            if (!D0.am.bravo(bravo, c3344d.oscar().bravo)) {
                n.ax axVar2 = c3344d.delta;
                if ((axVar2 == null || ((Boolean) ((t0) axVar2.quebec).getValue()).booleanValue()) && (interfaceC1878a = c3344d.kilo) != null) {
                    interfaceC1878a.alpha(9);
                }
                c3344d.charlie.invoke(C3344D.golf(c3344d.oscar().alpha, bravo));
                c3344d.whiskey = new D0.am(bravo);
            }
        }
    }

    @Override // n.K
    public final void onCancel() {
    }
}
