package Od;

import Pd.g;
import Yb.C0331t0;
import io.ktor.utils.io.ah;
import io.ktor.utils.io.ak;
import kotlin.ResultKt;
import kotlin.jvm.internal.x;

/* loaded from: classes2.dex */
public final class b extends g {
    public int alpha;
    public final /* synthetic */ C0331t0 purple;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(C0331t0 c0331t0) {
        super(r0);
        ah ahVar = ak.alpha;
        this.purple = c0331t0;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                this.alpha = 2;
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.alpha = 1;
        ResultKt.alpha(obj);
        C0331t0 c0331t0 = this.purple;
        x.echo(1, c0331t0);
        return c0331t0.invoke(this);
    }
}
