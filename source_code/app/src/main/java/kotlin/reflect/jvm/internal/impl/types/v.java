package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2332h;

/* loaded from: classes2.dex */
public final class v extends av {
    public final pe.aq[] bravo;
    public final as[] charlie;
    public final boolean delta;

    public v(pe.aq[] parameters, as[] arguments, boolean z2) {
        Intrinsics.echo(parameters, "parameters");
        Intrinsics.echo(arguments, "arguments");
        this.bravo = parameters;
        this.charlie = arguments;
        this.delta = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final boolean bravo() {
        return this.delta;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final as delta(y yVar) {
        pe.aq aqVar;
        InterfaceC2332h kilo = yVar.green().kilo();
        if (kilo instanceof pe.aq) {
            aqVar = (pe.aq) kilo;
        } else {
            aqVar = null;
        }
        if (aqVar != null) {
            int index = aqVar.getIndex();
            pe.aq[] aqVarArr = this.bravo;
            if (index < aqVarArr.length && Intrinsics.areEqual(aqVarArr[index].tango(), aqVar.tango())) {
                return this.charlie[index];
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final boolean echo() {
        if (this.charlie.length == 0) {
            return true;
        }
        return false;
    }
}
