package n;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d.O0;
import d.x0;
import f.InterfaceC1673j;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class X implements PointerInputEventHandler {
    public final /* synthetic */ vf.ab alpha;
    public final /* synthetic */ androidx.compose.runtime.ax purple;
    public final /* synthetic */ InterfaceC1673j red;
    public final /* synthetic */ androidx.compose.runtime.ax silver;

    public X(vf.ab abVar, androidx.compose.runtime.ax axVar, InterfaceC1673j interfaceC1673j, androidx.compose.runtime.ax axVar2) {
        this.alpha = abVar;
        this.purple = axVar;
        this.red = interfaceC1673j;
        this.silver = axVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(m0.u uVar, Nd.c cVar) {
        W w4 = new W(this.alpha, this.purple, this.red, null);
        Cb.i iVar = new Cb.i(this.silver, 29);
        d.ak akVar = O0.alpha;
        Object mike = vf.ad.mike(new x0(uVar, w4, iVar, new d.N(uVar), null), cVar);
        Od.a aVar = Od.a.alpha;
        if (mike != aVar) {
            mike = Unit.INSTANCE;
        }
        if (mike == aVar) {
            return mike;
        }
        return Unit.INSTANCE;
    }
}
