package Se;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2349y;

/* loaded from: classes2.dex */
public final class j extends g {
    public final String bravo;

    public j(String str) {
        super(Unit.INSTANCE);
        this.bravo = str;
    }

    @Override // Se.g
    public final y alpha(InterfaceC2349y module) {
        Intrinsics.echo(module, "module");
        return hf.i.charlie(hf.h.f12733m, this.bravo);
    }

    @Override // Se.g
    public final Object bravo() {
        throw new UnsupportedOperationException();
    }

    @Override // Se.g
    public final String toString() {
        return this.bravo;
    }
}
