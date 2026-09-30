package zd;

import io.ktor.utils.io.ak;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ io.ktor.utils.io.m purple;
    public final /* synthetic */ io.ktor.utils.io.m red;

    public /* synthetic */ b(io.ktor.utils.io.m mVar, io.ktor.utils.io.m mVar2, int i4) {
        this.alpha = i4;
        this.purple = mVar;
        this.red = mVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.alpha) {
            case 0:
                if (th == null) {
                    return Unit.INSTANCE;
                }
                ak.charlie(this.purple, th);
                ak.charlie(this.red, th);
                return Unit.INSTANCE;
            default:
                if (th == null) {
                    return Unit.INSTANCE;
                }
                this.purple.delta(th);
                this.red.delta(th);
                return Unit.INSTANCE;
        }
    }
}
