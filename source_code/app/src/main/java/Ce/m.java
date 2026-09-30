package Ce;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class m extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ p purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                Ne.f it = (Ne.f) obj;
                Intrinsics.echo(it, "it");
                return p.victor(this.purple, it);
            default:
                Ne.f it2 = (Ne.f) obj;
                Intrinsics.echo(it2, "it");
                return p.whiskey(this.purple, it2);
        }
    }
}
