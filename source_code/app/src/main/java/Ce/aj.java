package Ce;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import of.AbstractC2262q;
import pe.InterfaceC2330f;

/* loaded from: classes2.dex */
public final class aj extends AbstractC2262q {
    public final /* synthetic */ j bravo;
    public final /* synthetic */ LinkedHashSet charlie;
    public final /* synthetic */ Lambda delta;

    /* JADX WARN: Multi-variable type inference failed */
    public aj(j jVar, LinkedHashSet linkedHashSet, Function1 function1) {
        this.bravo = jVar;
        this.charlie = linkedHashSet;
        this.delta = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // of.AbstractC2262q
    public final boolean charlie(Object obj) {
        InterfaceC2330f current = (InterfaceC2330f) obj;
        Intrinsics.echo(current, "current");
        if (current != this.bravo) {
            Xe.n lime = current.lime();
            Intrinsics.delta(lime, "current.staticScope");
            if (lime instanceof al) {
                this.charlie.addAll((Collection) this.delta.invoke(lime));
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // of.AbstractC2262q
    public final /* bridge */ /* synthetic */ Object india() {
        return Unit.INSTANCE;
    }
}
