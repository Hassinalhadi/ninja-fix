package b0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import s6.J4;

/* loaded from: classes3.dex */
public final class p extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ q purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.purple.november.delta(J4.bravo(doubleValue, r10.echo, r10.foxtrot)));
            default:
                return Double.valueOf(J4.bravo(this.purple.kilo.delta(((Number) obj).doubleValue()), r10.echo, r10.foxtrot));
        }
    }
}
