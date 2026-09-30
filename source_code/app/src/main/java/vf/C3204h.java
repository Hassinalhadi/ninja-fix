package vf;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* renamed from: vf.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3204h implements InterfaceC3205i {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public /* synthetic */ C3204h(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // vf.InterfaceC3205i
    public final void alpha(Throwable th) {
        switch (this.alpha) {
            case 0:
                ((ScheduledFuture) this.bravo).cancel(false);
                return;
            case 1:
                ((Function1) this.bravo).invoke(th);
                return;
            default:
                ((aq) this.bravo).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.alpha) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.bravo) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.bravo).getClass().getSimpleName() + '@' + ad.romeo(this) + ']';
            default:
                return "DisposeOnCancel[" + ((aq) this.bravo) + ']';
        }
    }
}
