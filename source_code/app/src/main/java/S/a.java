package S;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;

    public /* synthetic */ a(int i4, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j5;
        switch (this.alpha) {
            case 0:
                l lVar = (l) obj;
                synchronized (n.charlie) {
                    j5 = n.echo;
                    n.echo = 1 + j5;
                }
                return new f(j5, lVar, this.purple);
            default:
                return this.purple.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
