package Se;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.InterfaceC2332h;
import pe.InterfaceC2349y;

/* loaded from: classes2.dex */
public class b extends g {
    public final Lambda bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List value, Function1 computeType) {
        super(value);
        Intrinsics.echo(value, "value");
        Intrinsics.echo(computeType, "computeType");
        this.bravo = (Lambda) computeType;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // Se.g
    public final y alpha(InterfaceC2349y module) {
        Intrinsics.echo(module, "module");
        y yVar = (y) this.bravo.invoke(module);
        if (!AbstractC2120h.xray(yVar)) {
            InterfaceC2332h kilo = yVar.green().kilo();
            if (kilo != null && AbstractC2120h.quebec(kilo) != null) {
                return yVar;
            }
            if (!AbstractC2120h.amber(yVar, me.m.navy.india()) && !AbstractC2120h.amber(yVar, me.m.ochre.india()) && !AbstractC2120h.amber(yVar, me.m.olive.india())) {
                AbstractC2120h.amber(yVar, me.m.orange.india());
            }
        }
        return yVar;
    }
}
