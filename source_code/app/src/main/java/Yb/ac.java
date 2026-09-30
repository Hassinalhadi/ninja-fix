package Yb;

import com.app.network.network.models.OrderTask;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.W4;

/* loaded from: classes2.dex */
public final class ac extends Pd.i implements Xd.l {
    public final /* synthetic */ ag alpha;
    public final /* synthetic */ H9.m purple;
    public final /* synthetic */ OrderTask red;
    public final /* synthetic */ File silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ag agVar, H9.m mVar, OrderTask orderTask, File file, Nd.c cVar) {
        super(2, cVar);
        this.alpha = agVar;
        this.purple = mVar;
        this.red = orderTask;
        this.silver = file;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ac(this.alpha, this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ac) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ag agVar = this.alpha;
        w.o oVar = agVar.alpha;
        if (!((C0333u0) oVar.purple).alpha.isFinishing() && !((C0333u0) oVar.purple).alpha.isDestroyed()) {
            ((C0333u0) oVar.purple).alpha.tango();
            H9.m mVar = this.purple;
            boolean z2 = mVar instanceof H9.l;
            File file = this.silver;
            if (z2) {
                File file2 = agVar.delta;
                if (file2 == null || agVar.echo) {
                    file2 = null;
                }
                H9.l lVar = (H9.l) mVar;
                agVar.delta = (File) lVar.alpha;
                androidx.lifecycle.ag foxtrot = androidx.lifecycle.T.foxtrot(((C0333u0) oVar.purple).alpha);
                vf.U u4 = vf.U.alpha;
                Cf.e eVar = vf.ao.alpha;
                vf.ad.zulu(foxtrot, u4.plus(Cf.d.purple), null, new aa(file, file2, mVar, null), 2);
                File compressedFile = (File) lVar.alpha;
                OrderTask task = this.red;
                Ac.g gVar = new Ac.g(29, agVar, task);
                Cb.ad adVar = new Cb.ad(23, agVar, task);
                B2.q qVar = new B2.q(28, agVar);
                Intrinsics.echo(compressedFile, "compressedFile");
                Intrinsics.echo(task, "task");
                ProcessOrderActivityV2 processOrderActivityV2 = (ProcessOrderActivityV2) oVar.red;
                if (!processOrderActivityV2.getSupportFragmentManager().jade() && !processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed()) {
                    new Wb.y(compressedFile, gVar, adVar, qVar, null).romeo(processOrderActivityV2.getSupportFragmentManager(), "DeliveryPreview");
                }
            } else if (mVar instanceof H9.k) {
                androidx.lifecycle.ag foxtrot2 = androidx.lifecycle.T.foxtrot(((C0333u0) oVar.purple).alpha);
                vf.U u10 = vf.U.alpha;
                Cf.e eVar2 = vf.ao.alpha;
                vf.ad.zulu(foxtrot2, u10.plus(Cf.d.purple), null, new ab(file, null), 2);
                C0333u0 c0333u0 = (C0333u0) oVar.purple;
                L9.d.pink(c0333u0.alpha, W4.alpha(c0333u0.alpha, ((H9.k) mVar).alpha));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
