package Se;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.InterfaceC2349y;

/* loaded from: classes2.dex */
public final class s extends n {
    public s(long j5) {
        super(Long.valueOf(j5));
    }

    @Override // Se.g
    public final y alpha(InterfaceC2349y module) {
        Intrinsics.echo(module, "module");
        AbstractC2120h juliet = module.juliet();
        juliet.getClass();
        return juliet.romeo(me.j.LONG);
    }

    @Override // Se.g
    public final String toString() {
        return ((Number) this.alpha).longValue() + ".toLong()";
    }
}
