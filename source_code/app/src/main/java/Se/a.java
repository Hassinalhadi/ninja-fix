package Se;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2349y;
import qe.InterfaceC2466b;

/* loaded from: classes2.dex */
public final class a extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC2466b value) {
        super(value);
        Intrinsics.echo(value, "value");
    }

    @Override // Se.g
    public final y alpha(InterfaceC2349y module) {
        Intrinsics.echo(module, "module");
        return ((InterfaceC2466b) this.alpha).getType();
    }
}
