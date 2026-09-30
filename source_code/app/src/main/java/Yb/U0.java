package Yb;

import com.app.network.network.models.OrderTask;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class U0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ OrderTask purple;
    public final /* synthetic */ Long red;
    public final /* synthetic */ androidx.compose.runtime.p0 silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(OrderTask orderTask, Long l10, androidx.compose.runtime.p0 p0Var, Nd.c cVar) {
        super(2, cVar);
        this.purple = orderTask;
        this.red = l10;
        this.silver = p0Var;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new U0(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002a -> B:5:0x002d). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer etaInSeconds;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        androidx.compose.runtime.p0 p0Var = this.silver;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                OrderTask task = this.purple;
                Intrinsics.echo(task, "task");
                Long l10 = this.red;
                long j5 = 0;
                if (l10 != null) {
                    long longValue = (l10.longValue() - System.currentTimeMillis()) / 1000;
                    if (longValue >= 0) {
                        j5 = longValue;
                    }
                } else {
                    Date startedAt = task.getStartedAt();
                    if (startedAt != null && (etaInSeconds = task.getEtaInSeconds()) != null) {
                        long intValue = (((etaInSeconds.intValue() * 1000) + startedAt.getTime()) - System.currentTimeMillis()) / 1000;
                        if (intValue >= 0) {
                            j5 = intValue;
                        }
                    }
                }
                float f5 = V0.alpha;
                p0Var.kilo((int) j5);
                float f10 = V0.alpha;
                if (p0Var.juliet() > 0) {
                    this.alpha = 1;
                    if (vf.ad.november(1000L, this) == aVar) {
                        return aVar;
                    }
                    OrderTask task2 = this.purple;
                    Intrinsics.echo(task2, "task");
                    Long l102 = this.red;
                    long j52 = 0;
                    if (l102 != null) {
                    }
                    float f52 = V0.alpha;
                    p0Var.kilo((int) j52);
                    float f102 = V0.alpha;
                    if (p0Var.juliet() > 0) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            float f1022 = V0.alpha;
            if (p0Var.juliet() > 0) {
            }
        }
    }
}
