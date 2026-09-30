package yf;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class aq implements InterfaceC3439i {
    public final /* synthetic */ C3433c alpha;
    public final /* synthetic */ C3433c purple;
    public final /* synthetic */ o3.f red;

    public aq(C3433c c3433c, C3433c c3433c2, o3.f fVar) {
        this.alpha = c3433c;
        this.purple = c3433c2;
        this.red = fVar;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Object alpha = zf.b.alpha(cVar, new cd.a(this.red, (Nd.c) null), ar.alpha, interfaceC3440j, new InterfaceC3439i[]{this.alpha, this.purple});
        if (alpha == Od.a.alpha) {
            return alpha;
        }
        return Unit.INSTANCE;
    }
}
