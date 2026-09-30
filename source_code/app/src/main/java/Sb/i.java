package Sb;

import Xd.l;
import androidx.compose.runtime.ax;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ ax red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j5, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = j5;
        this.red = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        do {
            long currentTimeMillis = this.purple - System.currentTimeMillis();
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            long j5 = currentTimeMillis / 1000;
            if (j5 < 0) {
                j5 = 0;
            }
            this.red.setValue(Long.valueOf(j5));
            if (currentTimeMillis > 0) {
                this.alpha = 1;
            } else {
                return Unit.INSTANCE;
            }
        } while (ad.november(1000L, this) != aVar);
        return aVar;
    }
}
