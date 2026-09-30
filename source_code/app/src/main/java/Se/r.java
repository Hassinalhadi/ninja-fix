package Se;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import pe.InterfaceC2349y;
import s6.O5;

/* loaded from: classes2.dex */
public final class r extends g {
    public r(Ne.b bVar, int i4) {
        super(new p(new f(bVar, i4)));
    }

    @Override // Se.g
    public final y alpha(InterfaceC2349y module) {
        y yVar;
        Intrinsics.echo(module, "module");
        al.purple.getClass();
        al alVar = al.red;
        AbstractC2120h juliet = module.juliet();
        juliet.getClass();
        InterfaceC2330f india = juliet.india(me.m.ivory.golf());
        Object obj = this.alpha;
        q qVar = (q) obj;
        if (qVar instanceof o) {
            yVar = ((o) obj).alpha;
        } else if (qVar instanceof p) {
            f fVar = ((p) obj).alpha;
            Ne.b bVar = fVar.alpha;
            InterfaceC2330f delta = AbstractC2347w.delta(module, bVar);
            int i4 = fVar.bravo;
            if (delta == null) {
                hf.h hVar = hf.h.silver;
                String bVar2 = bVar.toString();
                Intrinsics.delta(bVar2, "classId.toString()");
                yVar = hf.i.charlie(hVar, bVar2, String.valueOf(i4));
            } else {
                ae oscar = delta.oscar();
                Intrinsics.delta(oscar, "descriptor.defaultType");
                B lima = O5.lima(oscar);
                for (int i5 = 0; i5 < i4; i5++) {
                    lima = module.juliet().hotel(lima);
                }
                yVar = lima;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ab.bravo(alVar, india, kotlin.collections.ab.juliet(new at(yVar)));
    }
}
