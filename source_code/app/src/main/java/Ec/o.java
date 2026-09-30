package Ec;

import androidx.compose.runtime.r0;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class o extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ r0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r0 r0Var, Nd.c cVar) {
        super(2, cVar);
        this.purple = r0Var;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new o(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002e -> B:5:0x0031). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        r0 r0Var = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                int i5 = p.delta;
                r0Var.kilo(r0Var.juliet() - 1);
                int i10 = p.delta;
                if (r0Var.juliet() > 0) {
                    this.alpha = 1;
                    if (vf.ad.november(1000L, this) == aVar) {
                        return aVar;
                    }
                    int i52 = p.delta;
                    r0Var.kilo(r0Var.juliet() - 1);
                    int i102 = p.delta;
                    if (r0Var.juliet() > 0) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            int i1022 = p.delta;
            if (r0Var.juliet() > 0) {
            }
        }
    }
}
