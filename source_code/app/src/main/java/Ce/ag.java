package Ce;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class ag extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Ne.f purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag(Ne.f fVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                Xe.n it = (Xe.n) obj;
                Intrinsics.echo(it, "it");
                return it.foxtrot(this.purple, EnumC3339b.teal);
            default:
                Xe.n it2 = (Xe.n) obj;
                Intrinsics.echo(it2, "it");
                return it2.charlie(this.purple, EnumC3339b.alpha);
        }
    }
}
