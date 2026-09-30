package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class aa extends Lambda implements Function1 {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ ap purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(Xe.n nVar, List list, al alVar, ap apVar, boolean z2) {
        super(1);
        this.purple = apVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ap apVar = this.purple;
        switch (this.alpha) {
            case 0:
                C1791f refiner = (C1791f) obj;
                Intrinsics.echo(refiner, "refiner");
                int i4 = ab.alpha;
                apVar.kilo();
                return null;
            default:
                C1791f kotlinTypeRefiner = (C1791f) obj;
                Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
                int i5 = ab.alpha;
                apVar.kilo();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(List list, al alVar, ap apVar, boolean z2) {
        super(1);
        this.purple = apVar;
    }
}
