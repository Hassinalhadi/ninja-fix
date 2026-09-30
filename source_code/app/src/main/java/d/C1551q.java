package d;

import androidx.compose.runtime.C0564b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: d.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1551q implements InterfaceC1532g0 {
    public final Function1 alpha;
    public final C1549p bravo = new C1549p(this);
    public final b.Q charlie = new b.Q();
    public final androidx.compose.runtime.ax delta;
    public final androidx.compose.runtime.ax echo;
    public final androidx.compose.runtime.ax foxtrot;

    public C1551q(Function1 function1) {
        this.alpha = function1;
        Boolean bool = Boolean.FALSE;
        this.delta = C0564b.zulu(bool);
        this.echo = C0564b.zulu(bool);
        this.foxtrot = C0564b.zulu(bool);
    }

    @Override // d.InterfaceC1532g0
    public final boolean alpha() {
        return ((Boolean) ((androidx.compose.runtime.t0) this.delta).getValue()).booleanValue();
    }

    @Override // d.InterfaceC1532g0
    public final Object bravo(b.M m4, Xd.l lVar, Pd.c cVar) {
        Object mike = vf.ad.mike(new C1547o(this, m4, lVar, null), cVar);
        if (mike == Od.a.alpha) {
            return mike;
        }
        return Unit.INSTANCE;
    }

    @Override // d.InterfaceC1532g0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    @Override // d.InterfaceC1532g0
    public final /* synthetic */ boolean delta() {
        return true;
    }

    @Override // d.InterfaceC1532g0
    public final float echo(float f5) {
        return ((Number) this.alpha.invoke(Float.valueOf(f5))).floatValue();
    }
}
