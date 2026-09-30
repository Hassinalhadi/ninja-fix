package n;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.n0;
import d.InterfaceC1532g0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class a0 implements InterfaceC1532g0 {
    public final /* synthetic */ InterfaceC1532g0 alpha;
    public final androidx.compose.runtime.ad bravo;
    public final androidx.compose.runtime.ad charlie;

    public a0(InterfaceC1532g0 interfaceC1532g0, final c0 c0Var) {
        this.alpha = interfaceC1532g0;
        final int i4 = 0;
        this.bravo = C0564b.quebec(new Function0() { // from class: n.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z2;
                boolean z10;
                switch (i4) {
                    case 0:
                        c0 c0Var2 = c0Var;
                        if (c0Var2.alpha() < ((n0) c0Var2.bravo).juliet()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        if (c0Var.alpha() > 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        });
        final int i5 = 1;
        this.charlie = C0564b.quebec(new Function0() { // from class: n.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z2;
                boolean z10;
                switch (i5) {
                    case 0:
                        c0 c0Var2 = c0Var;
                        if (c0Var2.alpha() < ((n0) c0Var2.bravo).juliet()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        if (c0Var.alpha() > 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        });
    }

    @Override // d.InterfaceC1532g0
    public final boolean alpha() {
        return this.alpha.alpha();
    }

    @Override // d.InterfaceC1532g0
    public final Object bravo(b.M m4, Xd.l lVar, Pd.c cVar) {
        return this.alpha.bravo(m4, lVar, cVar);
    }

    @Override // d.InterfaceC1532g0
    public final boolean charlie() {
        return ((Boolean) this.charlie.getValue()).booleanValue();
    }

    @Override // d.InterfaceC1532g0
    public final boolean delta() {
        return ((Boolean) this.bravo.getValue()).booleanValue();
    }

    @Override // d.InterfaceC1532g0
    public final float echo(float f5) {
        return this.alpha.echo(f5);
    }
}
