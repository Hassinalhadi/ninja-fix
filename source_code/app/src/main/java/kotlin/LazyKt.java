package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"kotlin/LazyKt__LazyJVMKt", "kotlin/LazyKt"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes2.dex */
public final class LazyKt extends LazyKt__LazyJVMKt {
    private LazyKt() {
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.l, java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.u, kotlin.Lazy] */
    public static Lazy alpha(i iVar, Function0 initializer) {
        Intrinsics.echo(initializer, "initializer");
        int i4 = h.$EnumSwitchMapping$0[iVar.ordinal()];
        if (i4 != 1) {
            r rVar = r.alpha;
            if (i4 != 2) {
                if (i4 == 3) {
                    ?? obj = new Object();
                    obj.alpha = initializer;
                    obj.purple = rVar;
                    return obj;
                }
                throw new NoWhenBranchMatchedException();
            }
            ?? obj2 = new Object();
            obj2.alpha = initializer;
            obj2.purple = rVar;
            return obj2;
        }
        return new m(initializer);
    }
}
