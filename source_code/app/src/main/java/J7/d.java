package J7;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements g {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ f purple;
    public final /* synthetic */ Runnable red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ TimeUnit white;

    public /* synthetic */ d(f fVar, Runnable runnable, long j5, long j6, TimeUnit timeUnit, int i4) {
        this.alpha = i4;
        this.purple = fVar;
        this.red = runnable;
        this.silver = j5;
        this.teal = j6;
        this.white = timeUnit;
    }

    @Override // J7.g
    public final ScheduledFuture alpha(D8.c cVar) {
        switch (this.alpha) {
            case 0:
                f fVar = this.purple;
                return fVar.purple.scheduleAtFixedRate(new e(fVar, this.red, cVar, 0), this.silver, this.teal, this.white);
            default:
                f fVar2 = this.purple;
                return fVar2.purple.scheduleWithFixedDelay(new e(fVar2, this.red, cVar, 2), this.silver, this.teal, this.white);
        }
    }
}
