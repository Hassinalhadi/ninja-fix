package Yb;

import com.app.network.network.models.OrderTask;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wf.C3268e;

/* loaded from: classes2.dex */
public final class ae extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ag purple;
    public final /* synthetic */ File red;
    public final /* synthetic */ File silver;
    public final /* synthetic */ OrderTask teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ag agVar, File file, File file2, OrderTask orderTask, Nd.c cVar) {
        super(2, cVar);
        this.purple = agVar;
        this.red = file;
        this.silver = file2;
        this.teal = orderTask;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ae(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ae) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (vf.ad.blue(r10, r1, r9) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (vf.ad.blue(r10, r2, r9) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
    
        if (r10 == r0) goto L29;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        ag agVar = this.purple;
        File file = this.silver;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        ResultKt.alpha(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            Cf.e eVar = vf.ao.alpha;
            Cf.d dVar = Cf.d.purple;
            ad adVar = new ad(agVar, file, null);
            this.alpha = 1;
            obj = vf.ad.blue(dVar, adVar, this);
        }
        H9.m mVar = (H9.m) obj;
        w.o oVar = agVar.alpha;
        if (!((C0333u0) oVar.purple).alpha.isFinishing() && !((C0333u0) oVar.purple).alpha.isDestroyed()) {
            if (!Intrinsics.areEqual(agVar.bravo, this.red)) {
                vf.U u4 = vf.U.alpha;
                Cf.e eVar2 = vf.ao.alpha;
                Nd.h plus = u4.plus(Cf.d.purple);
                C0339z c0339z = new C0339z(mVar, null);
                this.alpha = 2;
            } else {
                Cf.e eVar3 = vf.ao.alpha;
                C3268e c3268e = Af.n.alpha;
                ac acVar = new ac(agVar, mVar, this.teal, file, null);
                this.alpha = 3;
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
