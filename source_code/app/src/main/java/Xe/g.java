package Xe;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2328d;

/* loaded from: classes2.dex */
public final class g extends Qe.l {
    public final /* synthetic */ ArrayList bravo;
    public final /* synthetic */ h charlie;

    public g(ArrayList arrayList, h hVar) {
        this.bravo = arrayList;
        this.charlie = hVar;
    }

    @Override // Qe.l
    public final void bravo(InterfaceC2328d fakeOverride) {
        Intrinsics.echo(fakeOverride, "fakeOverride");
        Qe.k.romeo(fakeOverride, null);
        this.bravo.add(fakeOverride);
    }

    @Override // Qe.l
    public final void delta(InterfaceC2328d interfaceC2328d, InterfaceC2328d fromCurrent) {
        Intrinsics.echo(fromCurrent, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.charlie.bravo + ": " + interfaceC2328d + " vs " + fromCurrent).toString());
    }
}
