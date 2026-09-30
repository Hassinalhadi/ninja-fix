package Se;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import pe.InterfaceC2349y;

/* loaded from: classes2.dex */
public final class i extends g {
    public final Ne.b bravo;
    public final Ne.f charlie;

    public i(Ne.b bVar, Ne.f fVar) {
        super(new Pair(bVar, fVar));
        this.bravo = bVar;
        this.charlie = fVar;
    }

    @Override // Se.g
    public final y alpha(InterfaceC2349y module) {
        Intrinsics.echo(module, "module");
        Ne.b bVar = this.bravo;
        InterfaceC2330f delta = AbstractC2347w.delta(module, bVar);
        ae aeVar = null;
        if (delta != null) {
            if (!Qe.e.november(delta, 3)) {
                delta = null;
            }
            if (delta != null) {
                aeVar = delta.oscar();
            }
        }
        if (aeVar == null) {
            hf.h hVar = hf.h.f12740t;
            String bVar2 = bVar.toString();
            Intrinsics.delta(bVar2, "enumClassId.toString()");
            String str = this.charlie.alpha;
            Intrinsics.delta(str, "enumEntryName.toString()");
            return hf.i.charlie(hVar, bVar2, str);
        }
        return aeVar;
    }

    @Override // Se.g
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.bravo.india());
        sb2.append('.');
        sb2.append(this.charlie);
        return sb2.toString();
    }
}
