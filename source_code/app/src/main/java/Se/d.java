package Se;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.InterfaceC2349y;

/* loaded from: classes2.dex */
public final class d extends n {
    public d(byte b2) {
        super(Byte.valueOf(b2));
    }

    @Override // Se.g
    public final y alpha(InterfaceC2349y module) {
        Intrinsics.echo(module, "module");
        AbstractC2120h juliet = module.juliet();
        juliet.getClass();
        return juliet.romeo(me.j.BYTE);
    }

    @Override // Se.g
    public final String toString() {
        return ((Number) this.alpha).intValue() + ".toByte()";
    }
}
