package B2;

import android.os.Build;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class an extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ao purple;
    public final /* synthetic */ A2.y red;
    public final /* synthetic */ K2.o silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ao aoVar, A2.y yVar, K2.o oVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = aoVar;
        this.red = yVar;
        this.silver = oVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new an(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((an) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r11 == r0) goto L25;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = Od.a.alpha;
        int i4 = this.alpha;
        ao aoVar = this.purple;
        A2.y yVar = this.red;
        J2.p pVar = aoVar.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            L2.c cVar = aoVar.echo;
            this.alpha = 1;
            String str = K2.n.alpha;
            if (pVar.quebec && Build.VERSION.SDK_INT < 31) {
                L2.b bVar = cVar.delta;
                Intrinsics.delta(bVar, "taskExecutor.mainThreadExecutor");
                obj2 = vf.ad.blue(vf.ad.papa(bVar), new K2.m(yVar, pVar, this.silver, aoVar.bravo, null), this);
                if (obj2 != obj3) {
                    obj2 = Unit.INSTANCE;
                }
            } else {
                obj2 = Unit.INSTANCE;
            }
        }
        String str2 = aq.alpha;
        A2.z.echo().alpha(str2, "Starting work for " + pVar.charlie);
        com.google.common.util.concurrent.e startWork = yVar.startWork();
        Intrinsics.delta(startWork, "worker.startWork()");
        this.alpha = 2;
        Object alpha = aq.alpha(startWork, yVar, this);
        if (alpha == obj3) {
            return obj3;
        }
        return alpha;
    }
}
