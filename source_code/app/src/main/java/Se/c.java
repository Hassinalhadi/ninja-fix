package Se;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.InterfaceC2349y;

/* loaded from: classes2.dex */
public final class c extends g {
    public final /* synthetic */ int bravo = 1;

    public /* synthetic */ c(Object obj) {
        super(obj);
    }

    @Override // Se.g
    public final y alpha(InterfaceC2349y module) {
        switch (this.bravo) {
            case 0:
                Intrinsics.echo(module, "module");
                AbstractC2120h juliet = module.juliet();
                juliet.getClass();
                return juliet.romeo(me.j.BOOLEAN);
            case 1:
                Intrinsics.echo(module, "module");
                AbstractC2120h juliet2 = module.juliet();
                juliet2.getClass();
                return juliet2.romeo(me.j.DOUBLE);
            default:
                Intrinsics.echo(module, "module");
                AbstractC2120h juliet3 = module.juliet();
                juliet3.getClass();
                return juliet3.romeo(me.j.FLOAT);
        }
    }

    @Override // Se.g
    public String toString() {
        switch (this.bravo) {
            case 1:
                return ((Number) this.alpha).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.alpha).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d4) {
        super(Double.valueOf(d4));
    }

    public c(float f5) {
        super(Float.valueOf(f5));
    }
}
