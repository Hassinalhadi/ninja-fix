package X;

import Aa.i;
import Lb.C;
import O7.l;
import Q0.n;
import T.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.InterfaceC2558s;
import s0.P;
import s0.an;
import s6.AbstractC2627c7;

/* loaded from: classes3.dex */
public final class b extends r implements P, a, InterfaceC2558s {
    public final c alpha;
    public boolean purple;
    public h red;
    public Function1 silver;

    public b(c cVar, Function1 function1) {
        this.alpha = cVar;
        this.silver = function1;
        cVar.alpha = this;
        new C(24, this);
    }

    @Override // X.a
    public final Q0.d alpha() {
        return AbstractC2555o.golf(this).f13298q;
    }

    public final void b() {
        h hVar = this.red;
        if (hVar != null) {
            hVar.charlie();
        }
        this.purple = false;
        this.alpha.purple = null;
        AbstractC2557q.india(this);
    }

    @Override // s0.InterfaceC2558s
    public final void blue() {
        b();
    }

    @Override // X.a
    public final long bravo() {
        return AbstractC2627c7.bravo(AbstractC2555o.echo(this, 128).red);
    }

    @Override // X.a
    public final n getLayoutDirection() {
        return AbstractC2555o.golf(this).f13299r;
    }

    @Override // s0.InterfaceC2558s
    public final void jade(an anVar) {
        boolean z2 = this.purple;
        c cVar = this.alpha;
        if (!z2) {
            cVar.purple = null;
            AbstractC2557q.november(this, new i(29, this, cVar));
            if (cVar.purple != null) {
                this.purple = true;
            } else {
                throw Q0.c.xray("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        l lVar = cVar.purple;
        Intrinsics.checkNotNull(lVar);
        ((Function1) lVar.purple).invoke(anVar);
    }

    @Override // s0.P
    public final void magenta() {
        b();
    }

    @Override // T.r
    public final void onDensityChange() {
        b();
    }

    @Override // T.r
    public final void onDetach() {
        super.onDetach();
        h hVar = this.red;
        if (hVar != null) {
            hVar.charlie();
        }
    }

    @Override // T.r
    public final void onLayoutDirectionChange() {
        b();
    }

    @Override // T.r
    public final void onReset() {
        super.onReset();
        b();
    }
}
