package lf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s6.AbstractC2823y6;

/* loaded from: classes2.dex */
public abstract class ad implements InterfaceC2079e {
    public final Lambda alpha;
    public final String bravo;

    /* JADX WARN: Multi-variable type inference failed */
    public ad(String str, Function1 function1) {
        this.alpha = (Lambda) function1;
        this.bravo = "must return ".concat(str);
    }

    @Override // lf.InterfaceC2079e
    public final String alpha() {
        return this.bravo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // lf.InterfaceC2079e
    public final boolean bravo(Ae.f fVar) {
        return Intrinsics.areEqual(fVar.yellow, this.alpha.invoke(Ue.e.echo(fVar)));
    }

    @Override // lf.InterfaceC2079e
    public final String charlie(Ae.f fVar) {
        return AbstractC2823y6.alpha(this, fVar);
    }
}
