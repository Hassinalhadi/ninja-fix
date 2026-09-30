package t;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ad;
import kotlin.collections.n;
import n.C2149y;
import q0.z;
import s0.AbstractC2556p;
import s0.InterfaceC2553m;
import s1.C2576i;
import u.InterfaceC3132f;
import vf.Y;
import y.at;
import y.au;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2882h extends AbstractC2556p implements InterfaceC2553m, InterfaceC3132f {

    /* renamed from: a, reason: collision with root package name */
    public final ad f13802a = C0564b.quebec(new n(21, this));

    /* renamed from: b, reason: collision with root package name */
    public Z.c f13803b = Z.c.echo;
    public C2576i red;
    public at silver;
    public au teal;
    public C2149y white;
    public Y yellow;

    public C2882h(C2576i c2576i, at atVar, au auVar, C2149y c2149y) {
        this.red = c2576i;
        this.silver = atVar;
        this.teal = auVar;
        this.white = c2149y;
    }

    @Override // u.InterfaceC3132f
    public final q.c cyan() {
        return (q.c) this.f13802a.getValue();
    }

    @Override // u.InterfaceC3132f
    public final long gray(z zVar) {
        return lima(zVar).charlie();
    }

    @Override // u.InterfaceC3132f
    public final Z.c lima(z zVar) {
        if (!isAttached()) {
            return this.f13803b;
        }
        Z.c cVar = (Z.c) this.white.invoke(zVar);
        this.f13803b = cVar;
        return cVar;
    }

    @Override // T.r
    public final void onAttach() {
        super.onAttach();
        this.red.alpha = this;
    }

    @Override // T.r
    public final void onDetach() {
        this.red.alpha = null;
        super.onDetach();
    }
}
